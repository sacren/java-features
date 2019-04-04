/**
 * Test driver for HexToBin class.
 */
import java.util.Scanner;

public class TestHexToBin {
    /** HexToBin test driver. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a hex string: ");
        String hex = inStream.nextLine();
        inStream.close();
        HexToBin bin = new HexToBin(hex);
        System.out.println();
        System.out.println("=== Convert hex string to binary string ===");
        System.out.println();
        System.out.println(bin);
    }
}
