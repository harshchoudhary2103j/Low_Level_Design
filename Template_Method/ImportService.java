public class ImportService {
    public void processImport(FileImportTemplate importer,String filePath){
        importer.importFile(filePath);
    }
}
