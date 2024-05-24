import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class withoutscanner {
    public static void containsWord(String str, String word)
    {
        if(str.contains(word))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you string here:");
        String input = bf.readLine();
        System.out.println("Enter your target: ");
        String target = bf.readLine();
        containsWord(input, target);
    }
}
