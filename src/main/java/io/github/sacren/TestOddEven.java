/**
 * Test driver for OddEven class.
 */
import java.util.Scanner;

public class TestOddEven {
    /** OddEven test driver. */
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = in.nextInt();
        in.close();
        System.out.println();
        System.out.println("=== Odd or even ===");
        System.out.println();
        System.out.println(new OddEven(num));
    }
}
