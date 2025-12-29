package adapter;

import external.StripeClient;

public class StripePaymentAdapter implements PaymentProceesor {
    private final StripeClient stripeClient;
    public StripePaymentAdapter(StripeClient stripeClient){
        this.stripeClient = stripeClient;
    }
    public void processPayment(double amount){
        int amountInCents = (int)(amount*100);
        stripeClient.makeStripePayment(amountInCents);
    }
    
}
