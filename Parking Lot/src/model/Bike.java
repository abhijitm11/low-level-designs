package model;

public class Bike extends Vehicle {

    private static final int RATE = 5;        // 5$ per hour for car

    public Bike(String licenceNumber) {
        super(licenceNumber, "Bike");
    }

    @Override
    public double calculateFee(int numOfHoursStayed) {
        return numOfHoursStayed * RATE;
    }
}
