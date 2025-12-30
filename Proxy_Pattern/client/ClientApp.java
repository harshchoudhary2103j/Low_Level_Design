package Proxy_Pattern.client;

import Proxy_Pattern.model.UserContext;
import Proxy_Pattern.proxy.DocumentServiceProxy;
import Proxy_Pattern.service.DocumentService;

public class ClientApp {
    public static void run(){
        UserContext adminUser = new UserContext("Harsh", "ADMIN");
        DocumentService service = new DocumentServiceProxy(adminUser);
        String doc = service.getDocument("Doc-123");
        System.out.println(doc);
    }
    
}
