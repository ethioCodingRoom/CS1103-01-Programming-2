import java.util.*;

/**
 * TextAnalysisTool
 * ----------------
 * A program that performs various text analysis operations such as:
 * - Character count
 * - Word count
 * - Most common character
 * - Character frequency (case-insensitive)
 * - Word frequency (case-insensitive)
 * - Unique word count
 *
 * @author Asres Yelia
 */
public class TextAnalysisTool {

    /**
     * Main method: Entry point of the program.
     * Handles user input and calls analysis methods.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask user to input a paragraph
        System.out.println("Welcome to the Text Analysis Tool!");
        System.out.println("----------------------------------");

        System.out.println("Enter a paragraph of text:");
        String inputText = scanner.nextLine();

        // Step 2: Character count
        int charCount = inputText.length();
        System.out.println("Total number of characters: " + charCount);

        // Step 3: Word count (split by spaces)
        String[] words = inputText.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("Total number of words: " + wordCount);

        // Step 4: Most common character
        char mostCommonChar = findMostCommonCharacter(inputText);
        System.out.println("Most common character: " + mostCommonChar);

        // Step 5: Character frequency (case-insensitive)
        System.out.println("Enter a character to check frequency:");
        char userChar = scanner.next().charAt(0);
        int charFrequency = countCharacterFrequency(inputText, userChar);
        System.out.println("Frequency of '" + userChar + "': " + charFrequency);

        // Step 6: Word frequency (case-insensitive)
        System.out.println("Enter a word to check frequency:");
        String userWord = scanner.next();
        int wordFrequency = countWordFrequency(words, userWord);
        System.out.println("Frequency of \"" + userWord + "\": " + wordFrequency);

        // Step 7: Unique words count (case-insensitive)
        int uniqueWordCount = countUniqueWords(words);
        System.out.println("Number of unique words: " + uniqueWordCount);

        scanner.close();
    }

    /**
     * Finds the most common character in the text.
     * @param text The input text
     * @return The most frequent character
     */
    public static char findMostCommonCharacter(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        text = text.toLowerCase(); // case-insensitive

        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) { // ignore spaces/punctuation
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        char mostCommon = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostCommon;
    }

    /**
     * Counts frequency of a given character (case-insensitive).
     * @param text The input text
     * @param ch The character to check
     * @return Frequency of the character
     */
    public static int countCharacterFrequency(String text, char ch) {
        int count = 0;
        text = text.toLowerCase();
        ch = Character.toLowerCase(ch);

        for (char c : text.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    /**
     * Counts frequency of a given word (case-insensitive).
     * @param words Array of words from the text
     * @param word The word to check
     * @return Frequency of the word
     */
    public static int countWordFrequency(String[] words, String word) {
        int count = 0;
        word = word.toLowerCase();

        for (String w : words) {
            if (w.toLowerCase().equals(word)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Counts the number of unique words in the text (case-insensitive).
     * @param words Array of words from the text
     * @return Number of unique words
     */
    public static int countUniqueWords(String[] words) {
        Set<String> uniqueWords = new HashSet<>();
        for (String w : words) {
            uniqueWords.add(w.toLowerCase());
        }
        return uniqueWords.size();
    }
}
