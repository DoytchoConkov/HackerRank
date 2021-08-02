import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String IP = scanner.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    public String pattern = "((\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])";
}