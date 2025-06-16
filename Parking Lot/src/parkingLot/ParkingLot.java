package parkingLot;

import model.Vehicle;
import parkingLot.parkingFloor.ParkingFloor;
import parkingLot.parkingSpot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    // method to find an available spot across all floors based on vehicle type
    public ParkingSpot findAvailableSpot(String vehicleType) {
        for(ParkingFloor floor: floors) {
            ParkingSpot spot = floor.findAvailableParkingSpots(vehicleType);
            if(spot !=null) {
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
        if(spot != null) {
            spot.parkVehicle(vehicle);
            System.out.println("Vehicle parked successfully in spot: "+spot.getSpotNumber());
            return spot;
        }
        System.out.println("No parking spots available!");
        return null;
    }

    public void vacateSpot(ParkingSpot spot, Vehicle vehicle) {
        if(spot !=null && spot.isOccupied() && spot.getVehicle().equals(vehicle)) {
            spot.vacate();     // free the spot
            System.out.println(vehicle.getVehicleType() + "vacated the spot: "+spot.getSpotNumber());
        } else {
            System.out.println("Invalid operation!");
        }
    }

    // method to find a spot by its number
    public ParkingSpot getSpotByNumber(int spotNumber) {
        for(ParkingFloor floor: floors) {
            for(ParkingSpot spot: floor.getParkingSpots()) {
                if(spot.getSpotNumber() == spotNumber) {
                    return spot;
                }
            }
        }
        return null;              // not found
    }
}
