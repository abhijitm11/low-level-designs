package model;

public abstract class Vehicle {
    private String licenceNumber;
    private String vehicleType;

    public Vehicle(String licenceNumber, String vehicleType) {
        this.licenceNumber = licenceNumber;
        this.vehicleType = vehicleType;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public abstract double calculateFee(int numOfHours);
}
