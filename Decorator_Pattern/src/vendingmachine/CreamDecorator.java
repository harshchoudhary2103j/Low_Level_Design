package vendingmachine;

public class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee coffee){
        super(coffee);
    }
    public String getDescription(){
        return super.getDescription()+", Cream";
    }
    public double getCost(){
        return super.getCost()+10.0;
    }
    
}
