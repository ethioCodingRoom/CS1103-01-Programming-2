import java.util.Scanner;

/**
 * Main class to run the Generic Library Catalog program.
 * Provides a simple command-line interface (CLI) for user interaction.
 * 
 * @author Asres Yelia
 */
public class Main {
    public static void main(String[] args) {
        Catalog<LibraryItem<String>> catalog = new Catalog<>();
        boolean running = true;

        try (Scanner scanner = new Scanner(System.in)) {
            while (running) {
                System.out.println("\nLibrary Catalog Menu");
                System.out.println("1. Add Library Item");
                System.out.println("2. Remove Library Item");
                System.out.println("3. View Catalog");
                System.out.println("4. Exit");
                System.out.print("Select an option: ");

                int choice = readMenuChoice(scanner);
                /* Using switch expression for cleaner control flow based on user choice.
                 Each case corresponds to a menu option, allowing 
                 the user to add, remove, view, or retrieve items 
                 from the catalog, or exit the program. The default
                  case handles invalid input gracefully. 
                */

                switch (choice) {
                    case 1 -> {
                        LibraryItem<String> item = createItemFromUserInput(scanner);
                        catalog.addItem(item);
                    }
                    case 2 -> {
                        System.out.print("Enter item ID to remove: ");
                        String id = scanner.nextLine();
                        LibraryItem<String> toRemove = null;
                        for (LibraryItem<String> item : catalog.getItems()) {
                            if (item.getItemID().equals(id)) {
                                toRemove = item;
                                break;
                            }
                        }
                        if (toRemove != null) {
                            catalog.removeItem(toRemove);
                        } else {
                            System.out.println("Item not found in the catalog.");
                        }
                    }
                    case 3 -> catalog.displayCatalog();
                    case 4 -> {
                        System.out.println("Thank you for using the Library Catalog. Goodbye!");
                        running = false;
                    }
                    default -> System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
    /* Reads the user's menu choice and handles invalid input gracefully.
     * Returns -1 for non-integer input, which is treated as an invalid option.
     * 
     * @param scanner the Scanner object for reading user input
     * @return the parsed menu choice, or -1 if input is invalid
     */

    private static int readMenuChoice(Scanner scanner) {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    /* Creates a library item based on user input.

     * @param scanner the Scanner object for reading user input
     * @return the created library item
     */

    private static LibraryItem<String> createItemFromUserInput(Scanner scanner) {
        System.out.println("Select item type:");
        System.out.println("1. Book");
        System.out.println("2. DVD");
        System.out.println("3. Magazine");
        System.out.print("Which catagory choose? ");
        int itemType = readMenuChoice(scanner);

        System.out.print("Enter item ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        return switch (itemType) {
            case 1 -> new Book(title, author, id);
            case 2 -> new DVD(title, author, id);
            case 3 -> new Magazine(title, author, id);
            default -> {
                System.out.println("Invalid type selected. Defaulting to Book.");
                yield new Book(title, author, id);
            }
        };
    }

}