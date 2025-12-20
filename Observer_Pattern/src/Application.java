import domain.Order;
import service.AnalyticsService;
import service.InventoryService;
import service.NotificationService;
import subject.OrderService;

public class Application {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        orderService.registerObserver(new NotificationService());
        orderService.registerObserver(new InventoryService());
        orderService.registerObserver(new AnalyticsService());

        Order order = new Order("ORD-101");

        orderService.updateOrderStatus(order, "CONFIRMED");
        orderService.updateOrderStatus(order, "SHIPPED");
    }
}
