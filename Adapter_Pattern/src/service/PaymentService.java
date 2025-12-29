package service;

import adapter.PaymentProceesor;

public class PaymentService {
    private final PaymentProceesor paymentProceesor;
    public PaymentService(PaymentProceesor paymentProceesor){
        this.paymentProceesor = paymentProceesor;
    }
    public void checkout(double amount){
        paymentProceesor.processPayment(amount);
    }
}
