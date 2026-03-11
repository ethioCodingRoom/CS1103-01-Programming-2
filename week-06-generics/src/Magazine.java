/**
 * Represents a magazine item in the catalog.
 */
public class Magazine extends LibraryItem<String> {
    public Magazine(String title, String author, String itemID) {
        super(title, author, itemID);
    }

    @Override
    public String toString() {
        return "Magazine - " + super.toString();
    }
}
