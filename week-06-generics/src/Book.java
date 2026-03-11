/**
 * Represents a book item in the catalog.
 */
public class Book extends LibraryItem<String> {
    public Book(String title, String author, String itemID) {
        super(title, author, itemID);
    }

    @Override
    public String toString() {
        return "Book - " + super.toString();
    }
}
