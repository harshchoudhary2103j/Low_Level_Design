package Bridge_Pattern.abstraction;

import Bridge_Pattern.implementation.NotificationSender;

public abstract class Notification {
    protected NotificationSender sender;
    protected Notification(NotificationSender sender){
        this.sender = sender;
    }
    public abstract void notifyUser();
    
}
