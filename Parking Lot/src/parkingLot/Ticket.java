package parkingLot;

import model.Vehicle;
import parkingLot.parkingSpot.ParkingSpot;

import java.time.LocalDateTime;

public class Ticket {
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private LocalDateTime startTime;

    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle, LocalDateTime startTime) {
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.startTime = startTime;
    }
}
