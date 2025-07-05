package proyecto.inventario;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Inventory System ===");

        Inventory inventory = Inventory.getInstance();
        inventory.addProduct("Laptop", 5, 999.99);
        inventory.addProduct("Monitor", 10, 199.99);

        System.out.println("\n--- Current Inventory ---");
        inventory.printInventory();
    }
}
