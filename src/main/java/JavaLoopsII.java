import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int twoPow = 1;
            int result = a + b;
            String totalResult = result + " ";
            for (int j = 0; j < n - 1; j++) {
                twoPow = twoPow * 2;
                result = result + twoPow * b;
                totalResult += result + " ";
            }
            System.out.println(totalResult);
        }
        in.close();
    }
}
