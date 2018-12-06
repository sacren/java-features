/**
 * Prompt the user for two arrays of int and check if they are exactly the
 * same.
 */
import java.util.Arrays;
import java.util.Scanner;

public class EqualArray {
    /** Prompt the user for input and test if arrays are equal. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int sizeOfArray1;
        for ( ; ; ) {
            System.out.print("Enter the size of the first integer array: ");
            sizeOfArray1 = inStream.nextInt();
            if (sizeOfArray1 >= 0) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", sizeOfArray1);
        }
        int[] intArray1 = new int[sizeOfArray1];
        if (sizeOfArray1 != 0) {
            System.out.print("Enter value for each item: ");
            for (int i = 0; i < sizeOfArray1; i++) {
                intArray1[i] = inStream.nextInt();
            }
        }
        int sizeOfArray2;
        for ( ; ; ) {
            System.out.print("Enter the size of the second integer array: ");
            sizeOfArray2 = inStream.nextInt();
            if (sizeOfArray2 >= 0) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", sizeOfArray2);
        }
        int[] intArray2 = new int[sizeOfArray2];
        if (sizeOfArray2 != 0) {
            System.out.print("Enter value for each item: ");
            for (int i = 0; i < sizeOfArray2; i++) {
                intArray2[i] = inStream.nextInt();
            }
        }
        System.out.printf(
                "%s and %s are%s equal%n",
                Arrays.toString(intArray1), Arrays.toString(intArray2),
                isEqual(intArray1, intArray2) ? "" : " not");
        inStream.close();
    }

    private static boolean isEqual(int[] a, int[] b) {
        int index = 0;
        if (a.length != b.length) {
            return false;
        }
        for (int number: a) {
            if (number != b[index++]) {
                return false;
            }
        }
        return true;
    }
}
