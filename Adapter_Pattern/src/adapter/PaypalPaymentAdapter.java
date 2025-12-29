package adapter;

import external.PaypalClient;

public class PaypalPaymentAdapter implements PaymentProceesor{
    private PaypalClient paypalClient;
    public PaypalPaymentAdapter(PaypalClient paypalClient){
        this.paypalClient = paypalClient;
    }
    public void processPayment(double amount){
        paypalClient.sendPayment(amount);
    }
    
}
