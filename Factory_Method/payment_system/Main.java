package Factory_Method.payment_system;

import Factory_Method.payment_system.factory.DefaultPaymentFactory;
import Factory_Method.payment_system.service.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService =
                new PaymentService(new DefaultPaymentFactory());

        paymentService.processPayment("UPI", 500);
        paymentService.processPayment("CREDIT_CARD", 1200);
        paymentService.processPayment("WALLET", 300);
    }
}