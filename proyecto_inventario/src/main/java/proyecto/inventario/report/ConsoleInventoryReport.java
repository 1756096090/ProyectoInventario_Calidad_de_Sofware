package proyecto.inventario.report;

import proyecto.inventario.Product;
import java.util.List;

public class ConsoleInventoryReport implements InventoryReport {
    @Override
    public void generateReport(List<Product> products) {
        for (Product p : products) {
            System.out.println(p.getDetails());
        }
    }
}