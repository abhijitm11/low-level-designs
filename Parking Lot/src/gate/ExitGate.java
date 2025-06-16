package gate;

import model.Vehicle;
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
        if (spot == null || !spot.isOccupied()) {
            System.out.println("Invalid or vacant spot!");
            return;
        }

        // get the vehicle in the spot
        Vehicle vehicle = spot.getVehicle();
        if (vehicle == null) {
            System.out.println("No vehicle found in the given spot!");
            return;
        }

        // calculate the parking fee
        double fee = vehicle.calculateFee(hoursStayed);

        // delegate the payment processing to payment service
        paymentService.makePayment(fee);

        // vacant the spot after payment
        parkingLot.vacateSpot(spot, vehicle);
        System.out.println("Spot vacated successfully!");
    }
}
