import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            boolean flag = true;
            String input = scanner.next();
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == '[' || c == '(' || c == '{') {
                    stack.push(c);
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        flag = false;
                    }
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        flag = false;
                    }
                } else if (c == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        flag = false;
                    }
                }
            }
            System.out.println(flag && stack.isEmpty());
        }

    }
}
