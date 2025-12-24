package Singleton_Pattern.Logger_Service;

public class PaymentService {
    public void processPayment(double amount){
        Applogger logger = Applogger.getInstance();
        logger.log("Payment Processed "+amount);
    }
}
