/**
 * Test driver for IntArray class.
 */
import java.util.Scanner;

public class TestIntArray {
    /** IntArray test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        System.out.print("Enter the number of items: ");
        size = in.nextInt();
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter value for item %d: ", i + 1);
            intArray[i] = in.nextInt();
        }
        in.close();
        System.out.println();
        System.out.println("=== Integer array ===");
        System.out.println();
        System.out.println(new IntArray(intArray));
    }
}
