/**
 * Test driver for Prime class.
 */
import java.util.Scanner;

public class TestPrime {
    /** Prime test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer number for upper limit: ");
        num = in.nextInt();
        in.close();
        System.out.println();
        System.out.println("=== Prime numbers ===");
        System.out.println();
        System.out.println(new Prime(num));
    }
}
