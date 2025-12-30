package Proxy_Pattern.proxy;

import Proxy_Pattern.model.UserContext;
import Proxy_Pattern.service.DocumentService;
import Proxy_Pattern.service.RealDocumentService;

public class DocumentServiceProxy implements DocumentService {
    private final DocumentService documentService;
    private final UserContext userContext;
    public DocumentServiceProxy(UserContext userContext){
        this.userContext = userContext;
        this.documentService = new RealDocumentService();
    }
    private boolean isAuthorised(){
        return "ADMIN".equals(userContext.getRole());

    }
    private void logAccesAttempt(){
        System.out.println("User "+ userContext.getUsername()+" attempting to access");
    }
    public String getDocument(String documentId){
        logAccesAttempt();
        if(!isAuthorised()){
            throw new RuntimeException("ACCESS DENIED: User is not authorized");
        }
        return documentService.getDocument(documentId);
    }
    
}
