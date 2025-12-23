package Factory_Method.payment_system.service;
import Factory_Method.payment_system.payment.Payment;
import  Factory_Method.payment_system.factory.PaymentFactory;

public class PaymentService {
    private  final PaymentFactory paymentFactory;
    public PaymentService(PaymentFactory paymentFactory){
        this.paymentFactory = paymentFactory;
    }
    public void processPayment(String paymentType,double amount){
        Payment payment = paymentFactory.createPayment(paymentType);
        payment.pay(amount);
    }
}
