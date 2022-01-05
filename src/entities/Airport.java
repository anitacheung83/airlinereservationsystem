package entities;

public class Airport {
    private String IATA;
    private String location;
    private String name;
    private String country;

    public Airport(String IATA, String location, String name, String country){
        this.IATA = IATA;
        this.location = location;
        this.name = name;
        this.country = country;
    }

    public String getIATA() {
        return IATA;
    }

    public void setIATA(String IATA) {
        this.IATA = IATA;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
