import java.util.ArrayList;
import java.util.List;

/**
 * Generic Catalog class for managing library items of any type.
 * Supports adding, removing, retrieving, and displaying items.
 * 
 * @param <T> the type of library item stored in the catalog
 * @author Asres Yelia
 */
public class Catalog<T> {
    /** List to store items in the catalog */
    private List<T> items;

    /** Constructs an empty catalog */
    public Catalog() {
        items = new ArrayList<>();
    }

    /**
     * Adds a new item to the catalog.
     * 
     * @param item the item to add
     */
    public void addItem(T item) {
        items.add(item);
    }

    /**
     * Removes an item from the catalog.
     * Checks for existence before removal.
     * 
     * @param item the item to remove
     */
    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println("Item removed successfully!");
        } else {
            System.out.println("Item not found in the catalog.");
        }
    }

    /** Displays all items in the catalog */
    public void displayCatalog() {
        if (items.isEmpty()) {
            System.out.println("The catalog is empty.");
        } else {
            System.out.println("Library Catalog:");
            for (T item : items) {
                System.out.println(item);
            }
        }
    }

    /** @return list of all items (for testing or advanced operations) */
    public List<T> getItems() {
        return items;
    }
}