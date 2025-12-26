package Command_Pattern.receiver;

public class PaymentService {
    public void processPayment(String orderId,double amount){
        System.out.println("Payment processed for the order: "+orderId);
    }
    
}
