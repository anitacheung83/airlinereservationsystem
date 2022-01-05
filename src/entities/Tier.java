package entities;

import java.util.HashMap;

public interface Tier {
    public HashMap<String, seatTypeBusiness>[][] generateSeatingPlan();

    public int getCapacity();
}
