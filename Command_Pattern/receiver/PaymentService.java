package Command_Pattern.receiver;

public class PaymentService {
    
    public boolean processPayment(String userId, double amount) {
        // Simulating payment processing
        System.out.println("Processing payment of " + amount + " for user " + userId);
        return true;
    }
}
