package entities;

import java.util.HashMap;

enum seatTypeFirst{
    AISLE, WINDOW
}
public class TierFirstClass implements Tier {
    private int startRow;
    private int endRow;
    private int capacity;

    public TierFirstClass(int startRow, int endRow) {
        this.startRow = startRow;
        this.endRow = endRow;
        this.capacity = (startRow + endRow) * 3;
    }

    @Override
    public HashMap[][] generateSeatingPlan(){
        HashMap[][] seats = new HashMap[this.endRow - this.startRow][3];
        HashMap<String, seatTypeFirst> seatsTypeArrangement = new HashMap<>();
        seatsTypeArrangement.put("A", seatTypeFirst.WINDOW);
        seatsTypeArrangement.put("D", seatTypeFirst.AISLE);
        seatsTypeArrangement.put("K", seatTypeFirst.WINDOW);
        int k = 0;
        for (int i = this.startRow; i <= this.endRow; i++) {
            int l = 0;
            for(var entry: seatsTypeArrangement.entrySet()) {
                HashMap<String, seatTypeFirst> tempHashMap = new HashMap<>();
                String key = entry.getKey();
                seatTypeFirst value = entry.getValue();
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
