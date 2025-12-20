package subject;
import observer.OrderObserver;
import domain.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderService implements OrderSubject {
    private final List<OrderObserver>observers = new ArrayList<>();//list of observers
    private Order currentOrder; //the order being processed
    @Override
    public void registerObserver(OrderObserver observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.onOrderStatusChanged(currentOrder);
        }
    
    }
      public void updateOrderStatus(Order order, String newStatus) {
        order.setStatus(newStatus);
        this.currentOrder = order;
        notifyObservers();
    }

}
