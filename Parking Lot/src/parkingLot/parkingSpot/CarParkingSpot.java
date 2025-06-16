package parkingLot.parkingSpot;

import model.Vehicle;

public class CarParkingSpot extends ParkingSpot{
    public CarParkingSpot(int spotNumber) {
        super(spotNumber, "Car");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType().equalsIgnoreCase("Car");
    }
}
