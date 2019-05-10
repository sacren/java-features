/**
 * Test driver for OctStr class.
 */
import java.util.Scanner;

public class TestOctStr {
    /** OctStr test driver. */
    public static void main(String[] args) {
        String inStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an octal string: ");
        inStr = in.nextLine();
        in.close();
        System.out.println();
        System.out.println("=== Octal string to decimal ===");
        System.out.println();
        System.out.println(new OctStr(inStr));
    }
}
