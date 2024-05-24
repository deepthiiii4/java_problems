import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class readonly {

    public static void writeToFile(String directoryName, String fileName, String content) throws IOException {

        File directory = new File(directoryName);
        if (!directory.exists()) {
            directory.mkdirs();
        }


        File file = new File(directory, fileName);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        }

        if (!file.setReadOnly()) {
            System.err.println("Failed to set the file to read-only");
        }
    }

    public static void main(String[] args) {
        String directoryName = "FileOps";
        String fileName = "example.txt";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file content: ");
        String content = scanner.nextLine();
        scanner.close();

        try {
            writeToFile(directoryName, fileName, content);
            System.out.println("File written and set to read-only successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
