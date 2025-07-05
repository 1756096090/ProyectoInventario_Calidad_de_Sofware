package proyecto.inventario;


import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static Inventory instance;

    private List<String> products = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();
    private List<Double> prices = new ArrayList<>();

    private Inventory() {}

    public static Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }

    public void addProduct(String name, int quantity, double price) {
        products.add(name);
        quantities.add(quantity);
        prices.add(price);
        System.out.println("Product added.");
    }

    public void printInventory() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Product: " + products.get(i) +
                               ", Quantity: " + quantities.get(i) +
                               ", Price: $" + prices.get(i));
        }
    }
}
