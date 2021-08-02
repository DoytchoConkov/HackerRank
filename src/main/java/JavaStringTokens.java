import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        String splits[] = s.split("[!,?._'@ ]");
        splits = Arrays.asList(splits).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
        System.out.println(splits.length);
        for(String z : splits)
            System.out.println(z);
    }
}
