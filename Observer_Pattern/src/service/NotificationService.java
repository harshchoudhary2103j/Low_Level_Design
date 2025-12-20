package service;

import domain.Order;
import observer.OrderObserver;

public class NotificationService implements OrderObserver {

    @Override
    public void onOrderStatusChanged(Order order) {
        System.out.println(
                "Notification sent for Order "
                        + order.getOrderId()
                        + " with status: "
                        + order.getStatus()
        );
    }
}
