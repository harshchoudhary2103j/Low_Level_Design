package Bridge_Pattern.abstraction;

import Bridge_Pattern.implementation.NotificationSender;

public class AlertNotification extends Notification{
    public AlertNotification(NotificationSender sender){
        super(sender);
    }
     public void notifyUser() {
        sender.send("System Alert: High CPU usage detected!");
    }
    
}
