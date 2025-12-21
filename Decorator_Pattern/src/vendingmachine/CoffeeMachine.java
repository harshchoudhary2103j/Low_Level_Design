package vendingmachine;

public class CoffeeMachine {
    public static void main(String[] args) {
        //Basic Coffee
        Coffee coffee = new BasicCoffee();
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: ₹" + coffee.getCost());

        //Milk Coffee
        coffee = new MilkDecorator(coffee);
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: ₹" + coffee.getCost());

        //Sugar Coffee
        coffee = new SugarDecorator(coffee);
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: ₹" + coffee.getCost());

        //cream Coffee
        coffee = new CreamDecorator(coffee);
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: ₹" + coffee.getCost());

    }
    
}
