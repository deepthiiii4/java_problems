import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class filereader {

    public static void readFileWithScanner(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    public static void readFileWithFileReader(String filePath) throws IOException {
        File file = new File(filePath);
        try (FileReader reader = new FileReader(file)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filepath: ");
        String filepath = scanner.nextLine();
        try {
            System.out.println("Reading file using Scanner:");
            readFileWithScanner(filepath);
            System.out.println("\nReading file using FileReader:");
            readFileWithFileReader(filepath);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
