package entities;

public class Airport {
    private String IATA;
    private String location;
    private String name;
    private Country country;

    public Airport(String IATA, String location, String name, Country country){
        this.IATA = IATA;
        this.location = location;
        this.name = name;
        this.country = country;
    }
}
