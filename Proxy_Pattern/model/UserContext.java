package Proxy_Pattern.model;

public class UserContext {
    private final String username;
    private final String role;
    public UserContext(String username, String role){
        this.username = username;
        this.role = role;
    }
    public String getRole(){
        return role;
    }
    public String getUsername(){
        return username;
    }
    
}
