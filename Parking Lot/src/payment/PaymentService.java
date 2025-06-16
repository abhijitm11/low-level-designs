package payment;

import payment.paymentStrategies.CashPayment;
import payment.paymentStrategies.CreditCardPayment;

import java.util.Scanner;

public class PaymentService {
    private Scanner scanner;

    public PaymentService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void makePayment(double fee) {
        chosePaymentMethodAndProcess(fee);
    }

    private void chosePaymentMethodAndProcess(double fee) {
        System.out.println("Parking fee to be paid: "+fee);
        System.out.println("Chose a payment method: ");
        System.out.println("1. Cash");
        System.out.println("2. Credit Card");
        int choice = scanner.nextInt();

        Payment payment;

        switch (choice) {
            case 1:
                payment = new Payment(fee, new CashPayment());
                break;
            case 2:
                payment = new Payment(fee, new CreditCardPayment());
                break;
            default:
                System.out.println("Invalid choice! Redirecting to cash payment");
                payment = new Payment(fee, new CashPayment());
                break;
        }

        payment.processPayment();











    }


}
