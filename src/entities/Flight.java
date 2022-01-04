package entities;
import java.util.Date;

public class Flight {
    private String flightNumber;
    private Date date; // can be eliminated
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Date arrivalTime;
    private Date departureTime;
    private Date boardingTime;
    private Long duration;

    public Flight(String flightNumber, Date date, Airport departureAirport, Airport arrivalAirport, Date arrivalTime, Date departureTime, Date boardingTime) {
        this.flightNumber = flightNumber;
        this.date = date;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.boardingTime = boardingTime;
        this.duration = arrivalTime.getTime() - departureTime.getTime();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(Date boardingTime) {
        this.boardingTime = boardingTime;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
}
