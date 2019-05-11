/**
 * Test driver for BinStr, OctStr and HexToBin classes.
 */
import java.util.Scanner;

public class TestBinOctHex {
    /** BinStr, OctStr and HexToBin test driver. */
    public static void main(String[] args) {
        String binStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        binStr = in.nextLine();
        String octStr;
        System.out.print("Enter a octal string: ");
        octStr = in.nextLine();
        String hexStr;
        System.out.print("Enter a hex string: ");
        hexStr = in.nextLine();
        in.close();
        System.out.println();
        System.out.println("=== Binary string ===");
        System.out.println();
        System.out.println(new BinStr(binStr));
        System.out.println();
        System.out.println("=== Octal string to decimal ===");
        System.out.println();
        System.out.println(new OctStr(octStr));
        System.out.println();
        System.out.println("=== Hex string to binary ===");
        System.out.println();
        System.out.println(new HexToBin(hexStr));
    }
}
