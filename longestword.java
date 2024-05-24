import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class longestword {
    public static void main(String[] args) throws FileNotFoundException {
        new longestword().findLongestWords();
    }

    public void findLongestWords() throws FileNotFoundException {
        String longestWord = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filepath: ");
        String filePath = sc.nextLine();
        sc.close();

        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNext()) {
            String current = fileScanner.next();
            if (current.length() > longestWord.length()) {
                longestWord = current;
            }
        }
        fileScanner.close();

        System.out.println("\nThe longest word is: " + longestWord + "\n");
    }
}
