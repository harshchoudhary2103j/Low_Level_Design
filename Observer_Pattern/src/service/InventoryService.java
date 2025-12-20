package service;

import domain.Order;
import observer.OrderObserver;

public class InventoryService implements OrderObserver {

    @Override
    public void onOrderStatusChanged(Order order) {
        if ("CONFIRMED".equals(order.getStatus())) {
            System.out.println(
                    "Inventory updated for Order "
                            + order.getOrderId()
            );
        }
    }
}
