package Facade_Pattern;

import Facade_Pattern.controller.OrderController;

public class Main {
    public static void main(String[] args) {
        OrderController controller = new OrderController();
        controller.placeOrderRequest();
    }
}