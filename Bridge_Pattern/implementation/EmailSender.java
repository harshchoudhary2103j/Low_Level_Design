package Bridge_Pattern.implementation;

public class EmailSender implements NotificationSender {
    public void send(String message){
       System.out.println("Sending EMAIL: " + message);
    }
    
}
