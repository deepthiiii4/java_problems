import java.util.Scanner;

public class stringpermutations {
    static void printDistinctPermutation(String str, String ans)
    {
        if (str.length() == 0) {
            System.out.print(ans + "\n");
            return;
        }
        boolean alpha[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String res = str.substring(0, i) + str.substring(i + 1);
            if (alpha[ch - 'a'] == false)
                printDistinctPermutation(res, ans + ch);
            alpha[ch - 'a'] = true;
        }
    }
    public static void main(String[] args)
    {   Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        printDistinctPermutation(s, "");
    }
}
