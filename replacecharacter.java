import java.util.Scanner;

public class replacecharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the index to replace: ");
        int index = scanner.nextInt();
        System.out.print("Enter the character to replace with: ");
        char replacementChar = scanner.next().charAt(0);
        String modifiedStr = replaceCharAtIndex(str, index, replacementChar);
        System.out.println("Modified string: " + modifiedStr);
        scanner.close();
    }

    public static String replaceCharAtIndex(String str, int index, char replacementChar) {
        if (index < 0 || index >= str.length()) {

            System.out.println("Index out of bounds!");
            return str;
        }

        char[] charArray = str.toCharArray();

        charArray[index] = replacementChar;
        return new String(charArray);
    }
}
