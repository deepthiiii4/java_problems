import java.io.File;
import java.util.Scanner;

public class deletefile {
    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filepath: ");
        String filepath = scanner.nextLine();
        scanner.close();
        deleteFile(filepath);
    }
}
