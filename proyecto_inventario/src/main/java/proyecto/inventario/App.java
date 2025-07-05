// src/main/java/proyecto/inventario/App.java
package proyecto.inventario;

import proyecto.inventario.repository.InventoryRepository;

import java.util.List;

import proyecto.inventario.report.ConsoleInventoryReport;
import proyecto.inventario.report.CsvInventoryReport;
import proyecto.inventario.report.InventoryReport;

public class App {
    public static void main(String[] args) {
        Inventory inventory = Inventory.getInstance();
        inventory.addProduct("Laptop", 5, 999.99);
        inventory.addProduct("Monitor", 10, 199.99);

        List<Product> products = inventory.getProducts();

        InventoryReport report = new ConsoleInventoryReport(); // o CsvInventoryReport
        InventoryPrinter printer = new InventoryPrinter(report);
        printer.print(products);
    }
}
