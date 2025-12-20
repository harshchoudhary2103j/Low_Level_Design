package domain;

public class Order {
    private final String orderId;
    private String status;
    public Order(String orderId) {
        this.orderId = orderId;
        this.status = "Created";
    }
    public String getOrderId(){
        return orderId;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
