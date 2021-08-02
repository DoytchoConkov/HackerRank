import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] bitset = new BitSet[3];

        bitset[1] = b1;
        bitset[2] = b2;

        while ( 0 < m-- ) {
            String op = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            switch (op) {
                case "AND":
                    bitset[x].and(bitset[y]);
                    break;
                case "OR":
                    bitset[x].or(bitset[y]);
                    break;
                case "XOR":
                    bitset[x].xor(bitset[y]);
                    break;
                case "FLIP":
                    bitset[x].flip(y);
                    break;
                case "SET":
                    bitset[x].set(y);
            }

            System.out.printf("%d %d%n", b1.cardinality(), b2.cardinality());
        }
    }
}
