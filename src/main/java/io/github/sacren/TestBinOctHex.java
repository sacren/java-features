/**
 * Test driver for BinStr, OctStr and HexStr classes.
 */
import java.util.Scanner;

public class TestBinOctHex {
    /** BinStr, OctStr and HexStr test driver. */
    public static void main(String[] args) {
        String binStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive binary number: ");
        binStr = in.nextLine();
        String octStr;
        System.out.print("Enter a positive octal number: ");
        octStr = in.nextLine();
        String hexStr;
        System.out.print("Enter a positive hex number: ");
        hexStr = in.nextLine();
        in.close();
        System.out.println();
        System.out.println(new BinStr(binStr));
        System.out.println();
        System.out.println(new OctStr(octStr));
        System.out.println();
        System.out.println(new HexStr(hexStr));
    }
}
