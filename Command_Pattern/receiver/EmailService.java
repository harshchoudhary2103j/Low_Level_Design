package Command_Pattern.receiver;

public class EmailService {
    public void sendConfirmation(String email){
        System.out.println("Confirmation email sent to "+email);
    }
    
}
