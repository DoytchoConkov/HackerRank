import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for (int i = 1; i < s.length()-k+1; i++) {
            String substring = s.substring(i, i + k);
            if(smallest.compareTo(substring)>0){
                smallest= substring;
            }
            if(largest.compareTo(substring)<0){
                largest= substring;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
