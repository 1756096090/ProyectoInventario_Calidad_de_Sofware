package proyecto.inventario;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Inventory inventory = Inventory.getInstance();
        inventory.addProduct("Laptop", 5, 999.99);
        inventory.printInventory();
    }
}
