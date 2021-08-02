import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<Integer> items = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int Q = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < Q; i++) {
            String command = scanner.nextLine();
            if ("Insert".equals(command)) {
                int[] token = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
                items.add(token[0], token[1]);
            } else {
                items.remove(Integer.parseInt(scanner.nextLine()));
            }
        }
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
    }
}
