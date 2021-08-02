import java.security.MessageDigest;
import java.util.Scanner;

public class JavaMD5 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String message = scanner.nextLine();
        scanner.close();

        try {
            MessageDigest messageDigest
                    = MessageDigest.getInstance("MD5");
            messageDigest.update(message.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        } catch (Exception e) {}
    }
}
