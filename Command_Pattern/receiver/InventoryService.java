package Command_Pattern.receiver;

public class InventoryService {
    public void reserve(String productId, int quantity){
        System.out.println("Inventory reserved for product: "+productId);
    }
    
    public boolean isStockAvailable(String productId) {
        // Simulating stock availability check
        return true;
    }
}
