package proyecto.inventario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase que gestiona el inventario.
 * Su responsabilidad es almacenar y administrar productos.
 */
public class Inventory {
    private static Inventory instance;

    private final List<Product> products = new ArrayList<>();

    private Inventory() {}

    public static Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }

    public void addProduct(String name, int quantity, double price) {
        Product product = new Product(name, quantity, price);
        products.add(product);
        System.out.println("Product added.");
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
