package entities;

public class Aircraft {
    final private String manufacturer;
    final private String flightNumber;
    private String airline;
    private Tier economy;
    private Tier businessClass;
    private Tier firstClass;

    public Aircraft(String manufacturer, String flightNumber, String airline, Tier economy, Tier businessClass, Tier firstClass) {
        this.manufacturer = manufacturer;
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.economy = economy;
        this.businessClass = businessClass;
        this.firstClass = firstClass;
    }

    public int totalCapacity() {
        int sum = 0;
        sum += (this.economy.getCapacity() + this.businessClass.getCapacity() + this.firstClass.getCapacity());
        return sum;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public Tier getEconomy() {
        return economy;
    }

    public Tier getBusinessClass() {
        return businessClass;
    }

    public Tier getFirstClass() {
        return firstClass;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setEconomy(Tier economy) {
        this.economy = economy;
    }

    public void setBusinessClass(Tier businessClass) {
        this.businessClass = businessClass;
    }

    public void setFirstClass(Tier firstClass) {
        this.firstClass = firstClass;
    }
}
