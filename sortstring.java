import java.util.Arrays;
import java.util.Scanner;

public class sortstring {
    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String sortedString = sortString(inputString);
        System.out.println("Sorted string: " + sortedString);
        scanner.close();
    }


}
