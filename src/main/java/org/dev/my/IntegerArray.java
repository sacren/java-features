/**
 * Prompt the user for the number of items in an array (a non-negative integer)
 * and for the values of all the items.  Print the contents of the array.
 */
import java.util.Arrays;
import java.util.Scanner;

public class IntegerArray {
    /** Prompt for input and display results. */
    public static void main(String[] args) {
        int[] items; /* This references an array. */
        double[] doubles;
        int size;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter the number of items: ");
            size = inStream.nextInt();

            if (size >= 0) {
                break;
            }

            System.out.printf("%d is invalid. Try again.%n", size);
        }

        items = new int[size];
        doubles = new double[size];

        if (size != 0) {
            System.out.print("Enter value for each item: ");
            for (int i = 0; i < size; i++) {
                items[i] = inStream.nextInt();
            }
        }

        printArray(items);

        int index = 0;
        String typeName = "double";
        for (double number: items) {
            doubles[index++] = number * Math.E; /* make array distinctive */
        }
        printArray(doubles);
        printArray(doubles, typeName);
        inStream.close();
    }

    private static void printArray(int[] a) {
        System.out.printf(
                "The size of array is %d%n"
                        + "The contents of array is %s%n",
                a.length, Arrays.toString(a));
    }

    private static void printArray(double[] a) {
        System.out.printf(
                "The size of array is %d%n"
                        + "The contents of array is %s%n",
                a.length, Arrays.toString(a));
    }

    private static void printArray(double[] a, String s) {
        System.out.printf(
                "The size of array is %d%n"
                        + "The contents of array is %s, of %s type%n",
                a.length, Arrays.toString(a), s);
    }
}
