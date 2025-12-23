package Factory_Method.payment_system.factory;
import Factory_Method.payment_system.payment.*;
public class DefaultPaymentFactory implements PaymentFactory {
    public Payment createPayment(String type) {
        switch (type.toUpperCase()) {
            case "CREDIT_CARD":
                return new CreditCardPayment();
            case "UPI":
                return new UpiPayment();
            case "WALLET":
                return new WalletPayment();
            default:
                throw new IllegalArgumentException("Invalid payment type");
        }
}
}
