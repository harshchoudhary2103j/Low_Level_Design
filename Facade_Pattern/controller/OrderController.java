package Facade_Pattern.controller;

import Facade_Pattern.facade.OrderProcessingFacade;

public class OrderController {

    private final OrderProcessingFacade orderFacade;

    public OrderController() {
        this.orderFacade = new OrderProcessingFacade();
    }

    public void placeOrderRequest() {
        orderFacade.placeOrder("user123", "product456", 999.99);
    }
}
