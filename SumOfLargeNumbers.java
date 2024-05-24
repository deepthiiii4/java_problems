import java.util.*;

public class SumOfLargeNumbers {
    public static String findSum(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        int maxLength = Math.max(str1.length(), str2.length());
        str1 = padWithZeros(str1, maxLength);
        str2 = padWithZeros(str2, maxLength);

        int carry = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            int digit1 = Character.getNumericValue(str1.charAt(i));
            int digit2 = Character.getNumericValue(str2.charAt(i));

            int sum = digit1 + digit2 + carry;

            carry = sum / 10;

            result.insert(0, sum % 10);
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    public static String padWithZeros(String str, int length) {
        StringBuilder paddedStr = new StringBuilder(str);
        while (paddedStr.length() < length) {
            paddedStr.insert(0, '0');
        }
        return paddedStr.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter number 2: ");
        String str2 = scanner.nextLine();
        scanner.close();

        String sum = findSum(str1, str2);
        System.out.println("Sum: " + sum);
    }
}
