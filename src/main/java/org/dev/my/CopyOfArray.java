/**
 * Prompt the user for an int array and make a copy of that array.
 */
import java.util.Arrays;
import java.util.Scanner;

public class CopyOfArray {
    /** Prompt the user for an integer array and make a copy. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int[] intArray;
        int size;

        for ( ; ; ) {
            System.out.print("Enter the size of integer array: ");
            size = inStream.nextInt();
            if (size >= 0) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", size);
        }
        intArray = new int[size];
        if (size != 0) {
            System.out.print("Enter value for each element of the array: ");
            for (int i = 0; i < size; i++) {
                intArray[i] = inStream.nextInt();
            }
        }
        System.out.printf(
                "%s is the copy of %s%n",
                Arrays.toString(copyArray(intArray)), Arrays.toString(intArray));
        inStream.close();
    }

    private static int[] copyArray(int[] a) {
        int[] b = new int[a.length];
        int index = 0;
        for (int number: a) {
            b[index++] = number;
        }
        return b;
    }
}
