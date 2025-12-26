import Command_Pattern.receiver.InventoryService;

public class ReserveInventoryCommand implements Command{
    private final InventoryService inventoryService;
    private String productId;
    private final int quantity;
    public ReserveInventoryCommand(InventoryService inventoryService,String productId, int quantity){
        this.inventoryService = inventoryService;
        this.productId = productId;
        this.quantity = quantity;
    }
    public void execute(){
        inventoryService.reserve(productId, quantity);
    }

    
}
