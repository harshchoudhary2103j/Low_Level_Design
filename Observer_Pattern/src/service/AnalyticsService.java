package service;

import domain.Order;
import observer.OrderObserver;

public class AnalyticsService implements OrderObserver {

    @Override
    public void onOrderStatusChanged(Order order) {
        System.out.println(
                "Analytics recorded for Order "
                        + order.getOrderId()
                        + " status: "
                        + order.getStatus()
        );
    }
}
