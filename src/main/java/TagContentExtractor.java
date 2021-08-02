import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        String rgx = "<(.+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(rgx);
        while (testCases > 0) {
            String line = sc.nextLine();
            Matcher m = pattern.matcher(line);
            boolean match = false;
            while (m.find()) {
                System.out.println(m.group(2));
                match = true;
            }
            if (! match == true) {
                System.out.println("None");
            }
            //Write your code here

            testCases--;
        }
    }
}
