package Facade_Pattern.service;

public class OrderService {
    public void createOrder(String userId, String productId) {
        System.out.println("Creating order for user: " + userId);
    }
}
