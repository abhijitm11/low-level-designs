package gate;

import parkingLot.ParkingLot;
import parkingLot.parkingSpot.ParkingSpot;
import payment.PaymentService;

public class ExitGate {
    private ParkingLot parkingLot;
    private PaymentService paymentService;

    public ExitGate(ParkingLot parkingLot, PaymentService paymentService) {
        this.parkingLot = parkingLot;
        this.paymentService = paymentService;
    }

    public void processExit(int spotNumber, int hoursStayed) {
        // find the spot by number
        ParkingSpot spot = parkingLot.getSpotByNumber(spotNumber);
        if(spot == null || !spot.isOccupied()) {
            System.out.println("Invalid or vacant spot!");
            return;
        }

        // get the vehicle in the spot
        
    }



}
