/**
 * Test driver for RvsStr class.
 */
import java.util.Scanner;

public class TestRvsStr {
    /** Ask the user for the string. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.print("Enter a string: ");
        str = in.nextLine();
        in.close();
        System.out.println();
        System.out.println("=== Reverse string ===");
        System.out.println();
        System.out.println(new RvsStr(str));
    }
}
