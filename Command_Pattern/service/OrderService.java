package Command_Pattern.service;

import Command_Pattern.invoker.CommandInvoker;
import Command_Pattern.receiver.EmailService;
import Command_Pattern.receiver.InventoryService;
import Command_Pattern.receiver.PaymentService;

public class OrderService {

    private final InventoryService inventoryService = new InventoryService();
    private final PaymentService paymentService = new PaymentService();
    private final EmailService emailService = new EmailService();

    public void placeOrder() {

        CommandInvoker invoker = new CommandInvoker();

        invoker.addCommand(
                new ReserveInventoryCommand(inventoryService, "P123", 2)
        );

        invoker.addCommand(
                new ProcessPaymentCommand(paymentService, "O456", 500.0)
        );

        invoker.addCommand(
                new SendEmailCommand(emailService, "user@email.com")
        );

        invoker.executeAll();
    }
}

