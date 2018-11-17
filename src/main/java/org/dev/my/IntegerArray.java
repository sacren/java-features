/**
 * Prompt the user for the number of items in an array (a non-negative integer)
 * and for the values of all the items.  Print the contents of the array.
 */
import java.util.Arrays;
import java.util.Scanner;

public class IntegerArray {
    /** Prompt for input and display results. */
    public static void main(String[] args) {
        int[] ints; /* This references an array. */
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

        ints = new int[size];
        doubles = new double[size];

        if (size != 0) {
            System.out.print("Enter value for each item: ");
            for (int i = 0; i < size; i++) {
                ints[i] = inStream.nextInt();
            }
        }

        int index = 0;
        String typeName = "double";
        for (double number: ints) {
            doubles[index++] = number * Math.E; /* make array distinctive */
        }
        System.out.printf(
                "The contents of int array is %s%n"
                        + "The contents of double array is %s%n"
                        + "The contents of array is %s%n"
                        + "%1$s %s %d%n"
                        + "Index is %d%n",
                arrayToString(ints), arrayToString(doubles), arrayToString(doubles, typeName),
                hasInt(ints, size) ? "has" : "doesn't have", size, searchArray(ints, size));
        inStream.close();
    }

    private static String arrayToString(int[] a) {
        return Arrays.toString(a);
    }

    private static String arrayToString(double[] a) {
        return Arrays.toString(a);
    }

    private static String arrayToString(double[] a, String s) {
        return Arrays.toString(a) + ", of " + s + " type";
    }

    private static boolean hasInt(int[] intArray, int number) {
        for (int element: intArray) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }

    private static int searchArray(int[] intArray, int number) {
        int index = 0;
        if (index == intArray.length) {
            return -1;
        }
        for (int element: intArray) {
            if (element == number) {
                break;
            }
            if (index++ == intArray.length - 1) {
                return -1;
            }
        }
        return index;
    }
}
