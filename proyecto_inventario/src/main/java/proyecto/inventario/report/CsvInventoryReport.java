package proyecto.inventario.report;

import proyecto.inventario.Product;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvInventoryReport implements InventoryReport {
    private final String path;
    public CsvInventoryReport(String path) { this.path = path; }

    @Override
    public void generateReport(List<Product> products) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write("Name,Quantity,Price\n");
            for (Product p : products) {
                writer.write(String.format("%s,%d,%.2f\n",
                    p.getName(), p.getQuantity(), p.getPrice()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}