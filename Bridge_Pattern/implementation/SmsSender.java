package Bridge_Pattern.implementation;

public class SmsSender implements NotificationSender {
    public void send(String message){
          System.out.println("Sending SMS: " + message);
    }
    
}
