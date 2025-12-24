package Singleton_Pattern.Logger_Service;

public class UserService {
    public void createUser(String username){
        Applogger logger = Applogger.getInstance();
        logger.log("User Created "+ username);
    }
}
