public abstract class FileImportTemplate{
    public final void importFile(String filepath){
        validate(filepath);
        parse(filepath);
        transform();
        save();
        sendNotification();
    }
    protected void validate(String filePath){
        System.out.println("Validating: "+filePath);

    }
    protected abstract void parse(String filePath);
    protected abstract void transform();
    protected void save(){
        System.out.println("Saving to Database");
    }
    protected void sendNotification(){
        System.out.println("Sending import complete Notification");
    }
}

//Here final keyword ensures that workflow cannot be changed