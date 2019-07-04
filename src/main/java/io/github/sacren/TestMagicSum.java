/**
 * Test driver for MagicSum class.
 */
import java.util.Scanner;

public class TestMagicSum {
    /** MagicSum test driver. */
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        MagicSum sum = new MagicSum();
        for ( ; ; ) {
            System.out.print("Enter a positive integer (0 to quit): ");
            num = in.nextInt();
            if (num == 0) {
                break;
            }
            sum.add(num);
        }
        in.close();
        System.out.println();
        System.out.println("=== Magic sum ===");
        System.out.println();
        System.out.println(sum);
    }
}
