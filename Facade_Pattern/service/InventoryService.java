package Facade_Pattern.service;

public class InventoryService {
    public boolean isStockAvailable(String productId){
        System.out.println("Checking inventory for product: "+ productId);
        return true;
    }
}
