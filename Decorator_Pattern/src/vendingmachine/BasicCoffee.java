package vendingmachine;

public class BasicCoffee implements Coffee {
    @Override
    public String getDescription(){
        return "Basic Coffee";
    }
    public double getCost(){
        return 50.0;
    }
    
}
