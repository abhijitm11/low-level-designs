package parkingLot.parkingFloor;

import parkingLot.parkingSpot.BikeParkingSpot;
import parkingLot.parkingSpot.CarParkingSpot;
import parkingLot.parkingSpot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> parkingSpots;
    private int floorNumber;

    public ParkingFloor(int floorNumber, int bikeSpots, int carSpots ) {
        this.parkingSpots = new ArrayList<>();
        this.floorNumber = floorNumber;

        // add spots for bike
        for(int i=1; i<=bikeSpots; i++) {
            this.parkingSpots.add(new BikeParkingSpot(i));
        }

        // add spots for car
        for(int i=1; i<=carSpots; i++) {
            this.parkingSpots.add(new CarParkingSpot(i));
        }
    }

    // method to return all available parking spots on the floor
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public ParkingSpot findAvailableParkingSpots(String vehicleType) {
        for(ParkingSpot spot: parkingSpots) {
            if(!spot.isOccupied() && spot.getSpotType().equalsIgnoreCase(vehicleType)) {
                return spot;             // return the first available spot for vehicle type
            }
        }
        return null;
    }





















}
