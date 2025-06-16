package parkingLot.parkingSpot;

import model.Vehicle;

public class BikeParkingSpot extends ParkingSpot{
    public BikeParkingSpot(int spotNumber) {
        super(spotNumber, "Bike");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType().equalsIgnoreCase("Bike");
    }
}
