package external;

public class StripeClient {
    public void makeStripePayment(int amountInCents){
        System.out.println("Stripe Payment Processed: "+ amountInCents+ " cents");

    }
}
