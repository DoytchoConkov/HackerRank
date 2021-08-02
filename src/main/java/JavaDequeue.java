import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new LinkedHashSet<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int maxSize = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            deque.add(num);
            set.add(num);
            if (deque.size() == m) {
                if (set.size() > maxSize) maxSize = set.size();
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }
        }

        System.out.println(maxSize);
    }
}
