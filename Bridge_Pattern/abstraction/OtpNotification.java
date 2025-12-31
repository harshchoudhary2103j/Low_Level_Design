package Bridge_Pattern.abstraction;

import Bridge_Pattern.implementation.NotificationSender;

public class OtpNotification extends Notification {

    public OtpNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser() {
        sender.send("Your OTP is 123456");
    }
}

