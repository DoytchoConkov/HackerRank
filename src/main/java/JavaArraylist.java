import java.util.Arrays;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[rows][];
        for (int i = 0; i < rows; i++) {
            array[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        int points = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < points; i++) {
            int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            if(tokens[0]-1>=rows){
                System.out.println("ERROR!");
            }else{
                if(tokens[1]>=array[tokens[0]-1].length){
                    System.out.println("ERROR!");
                }else {
                    System.out.println(array[tokens[0]-1][tokens[1]]);
                }
            }
        }
    }
}
