package Singleton_Pattern.Logger_Service;

public class Applogger {
    private static Applogger instance;
    private Applogger(){

    }
    public static synchronized Applogger getInstance(){
        if(instance==null){
            instance = new Applogger();
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
    
}
