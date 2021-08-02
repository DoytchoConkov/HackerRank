import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> phoneBook = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            phoneBook.put(name, phone);
            scanner.nextLine();
        }
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if(phoneBook.containsKey(s)){
                System.out.println(s+"="+phoneBook.get(s));
            }else{
                System.out.println("Not found");
            }
        }
    }
}
