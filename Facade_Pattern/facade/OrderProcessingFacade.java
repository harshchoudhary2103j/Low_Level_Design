package Facade_Pattern.facade;

import Command_Pattern.receiver.InventoryService;
import Command_Pattern.receiver.PaymentService;
import Command_Pattern.service.OrderService;
import Facade_Pattern.service.NotificationService;

public class OrderProcessingFacade {

    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final OrderService orderService;
    private final NotificationService notificationService;

    public OrderProcessingFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.orderService = new OrderService();
        this.notificationService = new NotificationService();
    }

    public void placeOrder(String userId, String productId, double amount) {

        if (!inventoryService.isStockAvailable(productId)) {
            throw new RuntimeException("Product out of stock");
        }

        if (!paymentService.processPayment(userId, amount)) {
            throw new RuntimeException("Payment failed");
        }

        orderService.createOrder(userId, productId);
        notificationService.sendOrderConfirmation(userId);

        System.out.println("Order placed successfully!");
    }
}
