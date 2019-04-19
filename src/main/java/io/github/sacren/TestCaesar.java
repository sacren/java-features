/**
 * Test driver for Caesar class.
 */
import java.util.Scanner;

public class TestCaesar {
    /** Caesar test driver. */
    public static void main(String[] args) {
        String usrStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text in mixed case: ");
        usrStr = in.nextLine();
        in.close();
        System.out.println();
        System.out.println("=== Caesar cipher, decipher and cipher text ===");
        System.out.println();
        System.out.println(new Caesar(usrStr));
    }
}
