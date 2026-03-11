/**
 * Represents a library item with a title, author, and unique item ID.
 * This class is compatible with a generic catalog.
 *
 * @param <T> the type used for the item ID
 * 
 * @author Asres Yelia
 */
public class LibraryItem<T> {
    /** The title of the library item */
    private final String title;

    /** The author or creator of the item */
    private final String author;

    /** Unique ID for the library item */
    private final T itemID;

    /**
     * Constructs a LibraryItem with specified title, author, and ID.
     * 
     * @param title  the title of the item
     * @param author the author or creator of the item
     * @param itemID the unique ID of the item
     */
    public LibraryItem(String title, String author, T itemID) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
    }

    /** @return the title of the item */
    public String getTitle() {
        return title;
    }

    /** @return the author of the item */
    public String getAuthor() {
        return author;
    }

    /** @return the unique item ID */
    public T getItemID() {
        return itemID;
    }

    /** @return formatted string representing the item */
    @Override
    public String toString() {
        return "ID: " + itemID + ", Title: " + title + ", Author: " + author;
    }
}