import adapter.PaypalPaymentAdapter;
import adapter.StripePaymentAdapter;
import external.PaypalClient;
import external.StripeClient;
import service.PaymentService;

public class Main {
    public static void main(String[] args) {
        StripeClient stripeClient = new StripeClient();
        PaymentService paymentService = new PaymentService(new StripePaymentAdapter(stripeClient));
        paymentService.checkout(99.99);
        PaypalClient paypalClient = new PaypalClient();
        PaymentService paymentService2 = new PaymentService(new PaypalPaymentAdapter(paypalClient));
        paymentService2.checkout(150.0);
    }
}
