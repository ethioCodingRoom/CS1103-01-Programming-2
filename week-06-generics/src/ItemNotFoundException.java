/**
 * Custom checked exception for catalog operations when an item is not found.
 */
public class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}
