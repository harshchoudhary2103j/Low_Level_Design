package Proxy_Pattern.service;

public class RealDocumentService implements DocumentService {
    public String getDocument(String documentId){
         return "CONFIDENTIAL DOCUMENT CONTENT for ID: " + documentId;
    }
    
}
