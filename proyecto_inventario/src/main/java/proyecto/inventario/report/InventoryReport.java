package proyecto.inventario.report;

import proyecto.inventario.Product;
import java.util.List;

public interface InventoryReport {
    void generate(List<Product> products);
}