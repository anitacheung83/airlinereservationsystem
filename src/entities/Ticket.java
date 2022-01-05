package entities;

enum ClassTier {
    FIRSTCLASS, BUSINESSCLASS, ECONOMY
}
public class Ticket {
    ClassTier tier;
    String seatNumber;
    String gate;
    Flight flight;
    Passenger passenger;
    Airport departure;
    Airport arrival;
    boolean refundable;
    int checkedBag;

    public Ticket(ClassTier tier, String seatNumber, String gate, Flight flight, Passenger passenger, Airport departure, Airport arrival, boolean refundable, int checkedBag) {
        this.tier = tier;
        this.seatNumber = seatNumber;
        this.gate = gate;
        this.flight = flight;
        this.passenger = passenger;
        this.departure = departure;
        this.arrival = arrival;
        this.refundable = refundable;
        this.checkedBag = checkedBag;
    }

    public ClassTier getTier() {
        return tier;
    }

    public void setTier(ClassTier tier) {
        this.tier = tier;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Airport getDeparture() {
        return departure;
    }

    public void setDeparture(Airport departure) {
        this.departure = departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public void setArrival(Airport arrival) {
        this.arrival = arrival;
    }

    public boolean isRefundable() {
        return refundable;
    }

    public void setRefundable(boolean refundable) {
        this.refundable = refundable;
    }

    public int getCheckedBag() {
        return checkedBag;
    }

    public void setCheckedBag(int checkedBag) {
        this.checkedBag = checkedBag;
    }
}

