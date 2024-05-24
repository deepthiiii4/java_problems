import java.util.Scanner;
import java.util.regex.*;

public class validateip {
    public static String validateIPAddress(String ipAddress) {
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(ipAddress);
        if (matcher.matches()) {
            String[] parts = ipAddress.split("\\.");
            for (String part : parts) {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255 || (part.length() > 1 && part.startsWith("0"))) {
                    return "Invalid";
                }
            }
            return "Valid";
        } else {
            return "Invalid";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ip: ");
        String ipAddress = scanner.nextLine();
        String result = validateIPAddress(ipAddress);
        System.out.println("Output: " + result);
    }


}
