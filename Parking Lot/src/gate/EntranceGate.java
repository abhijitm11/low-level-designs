package gate;

import model.Vehicle;
import model.VehicleFactory;
import parkingLot.ParkingLot;
import parkingLot.parkingSpot.ParkingSpot;

import java.util.Scanner;

public class EntranceGate {
    private ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    // method to process the vehicle entrance
    public void processEntrance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the vehicle licence plate number: ");
        String licenceNumber = scanner.next();
        System.out.println("Enter the vehicle type(Car/Bike): ");
        String vehicleType = scanner.next();

        Vehicle vehicle = VehicleFactory.createVehicle(licenceNumber, vehicleType);
        if (vehicle == null) {
            System.out.println("Invalid vehicle type! Only Car or Bike is allowed");
            return;
        }

        // try to park the vehicle
        ParkingSpot spot = parkingLot.parkVehicle(vehicle);
        if (spot != null) {
            System.out.println("Vehicle parked successfully!");
        } else {
            System.out.println("No available spots for vehicle type!");
        }


    }


}
