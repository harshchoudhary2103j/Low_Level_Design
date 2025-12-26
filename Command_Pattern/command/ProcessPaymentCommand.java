import Command_Pattern.receiver.PaymentService;

public class ProcessPaymentCommand implements Command {
    private final PaymentService paymentService;
    private final String orderId;
    private final double amount;
    public ProcessPaymentCommand(PaymentService paymentService,String orderId, double amount){
        this.amount = amount;
        this.orderId = orderId;
        this.paymentService = paymentService;
    }
    public void execute(){
        paymentService.processPayment(orderId, amount);
    }

    
}
