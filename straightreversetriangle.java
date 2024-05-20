import java.util.Scanner;

public class straightreversetriangle {
    public static void printReverseTriangle(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stars: ");
        int height = scanner.nextInt();
        scanner.close();
        printReverseTriangle(height);
    }
}
