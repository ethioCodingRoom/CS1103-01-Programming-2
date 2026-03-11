/**
 * Represents a DVD item in the catalog.
 */
public class DVD extends LibraryItem<String> {
    public DVD(String title, String author, String itemID) {
        super(title, author, itemID);
    }
    
    @Override
    public String toString() {
        return "DVD - " + super.toString();
    }
}
