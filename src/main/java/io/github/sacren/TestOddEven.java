/**
 * Test driver for OddEven class.
 */
import java.util.Scanner;

public class TestOddEven {
    /** OddEven test driver. */
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = in.nextInt();
        in.close();
        System.out.println();
        System.out.println("=== Odd or even number ===");
        System.out.println();
        System.out.println(new OddEven(number));
    }
}
