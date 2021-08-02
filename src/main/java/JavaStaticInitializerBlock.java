import java.util.Scanner;

public class JavaStaticInitializerBlock {
    private static boolean flag=true;
    private static int B, H;

    static {
        Scanner scanner = new Scanner(System.in);
        B = Integer.parseInt(scanner.nextLine());
        H = Integer.parseInt(scanner.nextLine());
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
