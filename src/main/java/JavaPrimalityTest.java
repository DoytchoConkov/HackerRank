import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        boolean flag = n.isProbablePrime(1);

        if (flag) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
