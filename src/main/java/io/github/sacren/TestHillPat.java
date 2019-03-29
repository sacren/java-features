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
        if (size < 3) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", size));
        }
        HillPat hp = new HillPat(size);
        System.out.println();
        System.out.println(hp);
    }
}
