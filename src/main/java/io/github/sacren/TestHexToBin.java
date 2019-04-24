/**
 * Test driver for HexToBin class.
 */
import java.util.Scanner;

public class TestHexToBin {
    /** HexToBin test driver. */
    public static void main(String[] args) {
        String hex;
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a hex string: ");
        hex = in.nextLine();
        in.close();
        System.out.println();
        System.out.println("=== Hex to binary ===");
        System.out.println();
        System.out.println(new HexToBin(hex));
    }
}
