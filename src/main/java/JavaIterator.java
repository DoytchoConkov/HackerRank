import java.util.ArrayList;
import java.util.Scanner;

public class JavaIterator {
    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String)//Hints: use instanceof operator

                break;
        }
        return it;

    }
    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(scanner.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(scanner.next());
        }

        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
