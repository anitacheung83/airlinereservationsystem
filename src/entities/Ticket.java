package entities;

public class Ticket {
    Tier tier;
    String seatNumber;
    String gate;
    Flight flight;
    Passenger passenger;
    Airport departure;
    Airport arrival;
    float price; // should it be depended on the tier?
    boolean refundable;
    int checkedBag;


}
