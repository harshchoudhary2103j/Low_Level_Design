public class Main {
    public static void main(String[] args) {
        ImportService service = new ImportService();
        
        FileImportTemplate csvImporter = new CsvFileImporter();
        FileImportTemplate jsonImporter = new JsonFileImporter();
        System.out.println("CSV IMPORT");
        service.processImport(csvImporter, "Users.csv");
        System.out.println("\n=== JSON Import ===");
        service.processImport(jsonImporter, "orders.json");
    }
}
