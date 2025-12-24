package Singleton_Pattern.Logger_Service;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        PaymentService paymentService = new PaymentService();
        userService.createUser("Harsh");
        paymentService.processPayment(5000.0);
        Applogger l1 = Applogger.getInstance();
        Applogger l2 = Applogger.getInstance();
         System.out.println("Same logger instance? " + (l1 == l2));

    }
}
