package Facade_Pattern.service;

public class PaymentService {
    public boolean processPayment(String userId, double amount){
        System.out.println("Processing payment of "+amount+" for user :"+userId);
        return true;
    }
    
}
