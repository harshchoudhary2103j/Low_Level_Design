package observer;
import domain.Order;
public interface OrderObserver {
    void onOrderStatusChanged(Order order);
}