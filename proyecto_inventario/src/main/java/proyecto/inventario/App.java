// src/main/java/proyecto/inventario/App.java
package proyecto.inventario;

import proyecto.inventario.repository.InventoryRepository;
import proyecto.inventario.report.ConsoleInventoryReport;
import proyecto.inventario.report.CsvInventoryReport;
import proyecto.inventario.report.InventoryReport;

public class App {
    public static void main(String[] args) {
        InventoryRepository repo = new InventoryRepository();

        // Añadimos productos
        repo.add(new Product("Manzana", 10, 0.5));
        repo.add(new Product("Pera",    5,  0.75));

        // Reporte consola
        InventoryReport consoleReport = new ConsoleInventoryReport();
        consoleReport.generate(repo.findAll());

        // Reporte CSV
        InventoryReport csvReport = new CsvInventoryReport("inventario.csv");
        csvReport.generate(repo.findAll());
    }
}
