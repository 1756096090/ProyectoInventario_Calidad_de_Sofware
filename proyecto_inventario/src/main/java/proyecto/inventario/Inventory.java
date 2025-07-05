package proyecto.inventario;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static Inventory instance;

    private List<Product> products = new ArrayList<>();

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

    public void printInventory() {
        for (Product product : products) {
            System.out.println(product.getDetails());
        }
    }
}
