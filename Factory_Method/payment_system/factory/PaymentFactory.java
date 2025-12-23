package Factory_Method.payment_system.factory;

import Factory_Method.payment_system.payment.Payment;

public interface PaymentFactory {
    Payment createPayment(String type);
}