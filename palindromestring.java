import java.util.Scanner;

public class palindromestring {
    public static String palindrome(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {

            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        return new String(characters);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        scanner.close();
        if (palindrome(input).equals(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
