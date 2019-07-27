/**
 * Test driver for CopyArray class.
 */
import java.util.Scanner;

public class TestCopyArray {
    /** CopyArray test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] intArray;
        int size;
        System.out.print("Enter the size of integer array: ");
        size = in.nextInt();
        intArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter integer for array element %d: ", i + 1);
            intArray[i] = in.nextInt();
        }
        in.close();
        System.out.println();
        System.out.println("=== Copy integer array ===");
        System.out.println();
        System.out.println(new CopyArray(intArray));
    }
}
