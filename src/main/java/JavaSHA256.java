import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        m.reset();
        m.update(scanner.nextLine().getBytes());
        for (byte i : m.digest()) {
            System.out.print(String.format("%02x", i));
        }
        System.out.println();
    }
}
