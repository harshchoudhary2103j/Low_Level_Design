import Command_Pattern.receiver.EmailService;

public class SendEmailCommand implements Command {
    private final EmailService emailService;
    private final String email;
    public SendEmailCommand(EmailService emailService,String email){
        this.email = email;
        this.emailService = emailService;
    }
    public void execute(){
        emailService.sendConfirmation(email);
    }

    
}
