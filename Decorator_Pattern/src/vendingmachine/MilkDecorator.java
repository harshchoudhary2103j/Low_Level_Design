package vendingmachine;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    public String getDescription(){
        return super.getDescription()+", Milk";
    }
    public double getCost(){
        return super.getCost()+15.0;
    }
}
