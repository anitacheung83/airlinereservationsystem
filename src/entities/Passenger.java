package entities;

import java.util.Date;

enum PassengerAgeType {
    ADULT, CHILDREN, INFANT
}

public class Passenger {
    String firstName;
    String lastName;
    int phoneNumber; // can add regex in the future
    Country passportCountry;
    String passportNumber;
    Gender gender;
    String emailAddress; // can add regex in the future
    Date dateOfBirth;
    PassengerAgeType passengerAgeType;

    public Passenger(String firstName, String lastName, int phoneNumber, Country passportCountry, String passportNumber, Gender gender, String emailAddress, Date dateOfBirth, PassengerAgeType passengerAgeType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.passportCountry = passportCountry;
        this.passportNumber = passportNumber;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.dateOfBirth = dateOfBirth;
        this.passengerAgeType = passengerAgeType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Country getPassportCountry() {
        return passportCountry;
    }

    public void setPassportCountry(Country passportCountry) {
        this.passportCountry = passportCountry;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public PassengerAgeType getPassengerAgeType() {
        return passengerAgeType;
    }

    public void setPassengerAgeType(PassengerAgeType passengerAgeType) {
        this.passengerAgeType = passengerAgeType;
    }
}
