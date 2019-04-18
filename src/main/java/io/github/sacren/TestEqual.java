/**
 * Test driver for Equal class.
 */
import java.util.Scanner;

public class TestEqual {
    /** Equal test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size1;
        System.out.print("Enter the size of the first integer array: ");
        size1 = in.nextInt();
        int[] array1 = new int[size1];
        System.out.print("Enter value for each item: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = in.nextInt();
        }
        int size2;
        System.out.print("Enter the size of the second integer array: ");
        size2 = in.nextInt();
        int[] array2 = new int[size2];
        System.out.print("Enter value for each item: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = in.nextInt();
        }
        in.close();
        System.out.println();
        System.out.println("=== Check if arrays are equal ===");
        System.out.println();
        System.out.println(new Equal(array1, array2));
    }
}
