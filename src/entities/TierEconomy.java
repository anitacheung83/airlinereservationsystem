package entities;

import java.util.HashMap;

enum seatTypeEconomy {
    AISLE, MIDDLE, WINDOW
}
public class TierEconomy implements Tier{
    private int startRow;
    private int endRow;
    private int capacity;

    public TierEconomy(int startRow, int endRow) {
        this.startRow = startRow;
        this.endRow = endRow;
        this.capacity = (startRow - endRow) * 10;
    }

    @Override
    public HashMap[][] generateSeatingPlan() {
        HashMap[][] seats = new HashMap[this.endRow - this.startRow][10];
        HashMap<String, seatTypeEconomy> seatsTypeArrangement = new HashMap<>();
        seatsTypeArrangement.put("A", seatTypeEconomy.WINDOW);
        seatsTypeArrangement.put("B", seatTypeEconomy.MIDDLE);
        seatsTypeArrangement.put("C", seatTypeEconomy.AISLE);
        seatsTypeArrangement.put("D", seatTypeEconomy.AISLE);
        seatsTypeArrangement.put("E", seatTypeEconomy.MIDDLE);
        seatsTypeArrangement.put("F", seatTypeEconomy.MIDDLE);
        seatsTypeArrangement.put("G", seatTypeEconomy.AISLE);
        seatsTypeArrangement.put("H", seatTypeEconomy.AISLE);
        seatsTypeArrangement.put("J", seatTypeEconomy.MIDDLE);
        seatsTypeArrangement.put("K", seatTypeEconomy.WINDOW);
        int k = 0;
        for (int i = this.startRow; i <= this.endRow; i++) {
            int l = 0;
            for (var entry: seatsTypeArrangement.entrySet()) {
                HashMap<String, seatTypeEconomy> tempHashMap = new HashMap<>();
                String key = entry.getKey();
                seatTypeEconomy value = entry.getValue();
                String newKey = i + key;
                tempHashMap.put(newKey, value);
                seats[k][l] = tempHashMap;
                l += 1;
            }
            k += 1;
        }
        return seats;
    }

    public int getCapacity() {
        return capacity;
    }
}
