package Facade_Pattern.service;

public class NotificationService {
    
    public void sendOrderConfirmation(String userId) {
        
        System.out.println("Order confirmation sent to user " + userId);
    }
}
