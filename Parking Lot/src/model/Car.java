package model;

public class Car extends Vehicle {
    private static final int RATE = 10;        // 10$ per hour for car

    public Car(String licenceNumber) {
        super(licenceNumber, "Car");
    }

    @Override
    public double calculateFee(int numOfHoursStayed) {
        return numOfHoursStayed * RATE;
    }
}
