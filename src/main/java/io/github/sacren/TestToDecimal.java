/**
 * Test driver for ToDecimal class.
 */
import java.util.Scanner;

public class TestToDecimal {
    /** ToDecimal test driver. */
    public static void main(String[] args) {
        String usrStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        usrStr = in.nextLine();
        int radix;
        System.out.print("Enter the radix: ");
        radix = in.nextInt();
        in.close();
        System.out.println();
        System.out.println("=== String to decimal ===");
        System.out.println();
        System.out.println(new ToDecimal(usrStr, radix));
    }
}
