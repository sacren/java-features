/**
 * Test driver for AlphaNum class
 */
import java.util.Scanner;

public class TestAlphaNum {
    /** AlphaNum test driver. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        String usrStr;
        System.out.print("Enter a string: ");
        usrStr = inStream.nextLine();
        inStream.close();
        System.out.println();
        System.out.println("=== Count vowels and digits ===");
        System.out.println();
        System.out.println(new AlphaNum(usrStr));
    }
}
