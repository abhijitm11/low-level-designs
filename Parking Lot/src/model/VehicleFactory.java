package model;

public class VehicleFactory {
    public static Vehicle createVehicle(String licenceNumber, String vehicleType) {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car(licenceNumber);
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            return new Bike(licenceNumber);
        } else {
            //throw an exception;
            return null;
        }
    }
}
