package proyecto.inventario;

import java.util.List;

import proyecto.inventario.report.InventoryReport;

public class InventoryPrinter {
    private InventoryReport report;

    public InventoryPrinter(InventoryReport report) {
        this.report = report;
    }

    public void print(List<Product> products) {
        report.generateReport(products);
    }
}
