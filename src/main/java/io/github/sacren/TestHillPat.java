/**
 * Test driver for HillPat class.
 */
import java.util.Scanner;

public class TestHillPat {
    /** Test driver for various hill patterns. */
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size greater than 2: ");
        size = in.nextInt();
        in.close();
        /* display patterns */
        System.out.println();
        System.out.println("=== Hill patterns ===");
        System.out.println();
        System.out.println(new HillPat(size));
    }
}
