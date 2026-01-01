public class JsonFileImporter extends FileImportTemplate {

    @Override
    protected void parse(String filePath) {
       System.out.println("Parsing JSON file: "+ filePath);
    }

    @Override
    protected void transform() {
        System.out.println("Transforming JSON objects");
    }
    
    
}
