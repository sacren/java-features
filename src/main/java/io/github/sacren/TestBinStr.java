/**
 * Test driver for BinStr class.
 */
import java.util.Scanner;

public class TestBinStr {
    /** BinStr test driver. */
    public static void main(String[] args) {
        String binStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        binStr = in.nextLine();
        in.close();
        System.out.println();
        System.out.println("=== Binary string to decimal ===");
        System.out.println();
        System.out.println(new BinStr(binStr));
    }
}
