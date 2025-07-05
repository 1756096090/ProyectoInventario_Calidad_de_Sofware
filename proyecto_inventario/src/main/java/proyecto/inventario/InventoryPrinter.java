package proyecto.inventario;

/**
 * Clase encargada de mostrar el contenido del inventario.
 * Su responsabilidad es únicamente la presentación.
 */
public class InventoryPrinter {
    public static void print(Inventory inventory) {
        for (Product product : inventory.getProducts()) {
            System.out.println(product.getDetails());
        }
    }
}