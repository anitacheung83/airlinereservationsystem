package entities;

import java.util.List;

enum flightType {
    DIRECT, CONNECTING
}

public class Order {
    int orderNumber;
    int numOfPassenger;
    flightType flightType;
    List<Passenger> passengers;
    int price;

}
