import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int count = 0;
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum += arr[j];
                if(sum<0) count++;
            }
        }
        System.out.println(count);
    }
}
