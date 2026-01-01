public class CsvFileImporter extends FileImportTemplate {

    @Override
    protected void parse(String filePath) {
        
        System.out.println("Parsing CSV file: "+filePath);
    }

    @Override
    protected void transform() {
        System.out.println("Transforming CSV records");
        
    }
    
}
