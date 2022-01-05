package entities;

import java.util.HashMap;

enum seatTypeBusiness {
    AISLE, WINDOW
}

public class TierBusinessClass implements Tier {
    private int startRow;
    private int endRow;
    private int capacity;
    private HashMap<String, seatTypeBusiness>[][] seatsPlan;

    public TierBusinessClass(int startRow, int endRow) {
        this.startRow = startRow;
        this.endRow = endRow;
        this.capacity = (startRow - endRow) * 4;
        this.seatsPlan = this.generateSeatingPlan(); // maybe redundant ...
    }

    @Override
    public HashMap[][] generateSeatingPlan() {
        HashMap[][] seats = new HashMap[this.endRow - this.startRow][4];
        HashMap<String, seatTypeBusiness> seatsTypeArrangement = new HashMap<>();
        seatsTypeArrangement.put("A", seatTypeBusiness.WINDOW);
        seatsTypeArrangement.put("D", seatTypeBusiness.AISLE);
        seatsTypeArrangement.put("G", seatTypeBusiness.AISLE);
        seatsTypeArrangement.put("K", seatTypeBusiness.WINDOW);
        int k = 0;
        for (int i = this.startRow; i <= this.endRow; i++) {
            int l = 0;
            for (var entry: seatsTypeArrangement.entrySet()) {
                HashMap<String, seatTypeBusiness> tempHashMap = new HashMap<>();
                String key = entry.getKey();
                seatTypeBusiness value = entry.getValue();
                String newKey = i + key;
                tempHashMap.put(newKey, value);
                seats[k][l] = tempHashMap;
                l += 1;
            }
            k += 1;
        }
        return seats;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

}
