import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}
