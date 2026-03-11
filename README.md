# Generic Library Catalog

This project is a Java command-line program for managing a small library catalog using generics. The program can store different types of items such as books, DVDs, and magazines.

## Features

- Uses a generic `Catalog<T>` class to store library items
- Uses a generic `LibraryItem<T>` class for item IDs
- Supports adding items to the catalog
- Supports removing items from the catalog
- Displays the current catalog in the console
- Loads a default collection of 10 sample items at startup
- Includes a text file with a sample collection list

## Project Files

- `Catalog.java` - generic catalog class
- `LibraryItem.java` - generic library item class
- `Book.java` - book item class
- `DVD.java` - DVD item class
- `Magazine.java` - magazine item class
- `Main.java` - command-line user interface
- `ItemNotFoundException.java` - custom exception file kept with the project
- `text.txt` - sample list of 10 collection items
- `test_output.txt` - sample output file

## How To Run

Compile all Java files:

```powershell
javac *.java
```

Run the program:

```powershell
java Main
```

## Menu Options

When the program starts, it shows these options:

1. Add Library Item
2. Remove Library Item
3. View Catalog
4. Exit

## Sample Default Collection

The program starts with 10 sample items, including:

- Data Science book
- Java books
- Manga-style book entry
- DVDs such as Interstellar and The Matrix
- Magazines such as National Geographic and Java Monthly

## Author

Asres Yelia
