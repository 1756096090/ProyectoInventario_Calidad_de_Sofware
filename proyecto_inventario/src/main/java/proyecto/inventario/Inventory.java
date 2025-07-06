package proyecto.inventario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Singleton que gestiona internamente los productos.
 * Implementa solo las operaciones de lectura y escritura.
 */
public class Inventory implements InventoryReader, InventoryWriter {
    private final List<Product> products = new ArrayList<>();

    private Inventory() {}

    // Holder idiom: inicialización perezosa + segura
    private static class InventoryHolder {
        private static final Inventory INSTANCE = new Inventory();
    }

    public static Inventory getInstance() {
        return InventoryHolder.INSTANCE;
    }

    @Override
    public void addProduct(String name, int quantity, double price) {
        products.add(new Product(name, quantity, price));
        System.out.println("Product added.");
    }

    @Override
    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
