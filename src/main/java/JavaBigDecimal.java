import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String []args){
        //Input
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=scanner.next();
        }
        scanner.close();
        Arrays.sort(s, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1==null||o2==null){
                    return 0;
                }
                return (new BigDecimal(o2)).compareTo(new BigDecimal(o1));
            }
        });
        //Write your code here

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
