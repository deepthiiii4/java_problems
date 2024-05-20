import java.util.Scanner;

public class reversetriangle {
    public static void printReverseTriangle(int height) {
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        scanner.close();
        printReverseTriangle(height);
    }
}
