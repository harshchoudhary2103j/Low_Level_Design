package Bridge_Pattern;

import Bridge_Pattern.abstraction.AlertNotification;
import Bridge_Pattern.abstraction.Notification;
import Bridge_Pattern.abstraction.OtpNotification;
import Bridge_Pattern.implementation.EmailSender;
import Bridge_Pattern.implementation.NotificationSender;
import Bridge_Pattern.implementation.SmsSender;

public class Client {

    public static void main(String[] args) {

        NotificationSender emailSender = new EmailSender();
        NotificationSender smsSender = new SmsSender();

        Notification alertViaEmail = new AlertNotification(smsSender);
        alertViaEmail.notifyUser();

        Notification otpViaSms = new OtpNotification(emailSender);
        otpViaSms.notifyUser();
    }
}
