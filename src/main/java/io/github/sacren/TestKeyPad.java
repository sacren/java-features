/**
 * Test driver for KeyPad class.
 */
import java.util.Scanner;

public class TestKeyPad {
    /** KeyPad test driver. */
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter letters for the phone number: ");
        str = in.nextLine();
        in.close();
        System.out.println();
        System.out.println("=== Phone key pad ===");
        System.out.println();
        System.out.println(new KeyPad(str));
    }
}
