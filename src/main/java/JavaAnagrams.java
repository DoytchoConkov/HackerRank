import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] aArray = a.toUpperCase().toCharArray();
        char[] bArray = b.toUpperCase().toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        for (int i = 0; i < a.length(); i++) {
            if (aArray[i] != bArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
