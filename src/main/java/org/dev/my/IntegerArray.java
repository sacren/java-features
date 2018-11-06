/**
 * Prompt the user for the number of items in an array (a non-negative integer)
 * and for the values of all the items.  Print the contents of the array.
 */
import java.util.Scanner;

public class IntegerArray {
    /** Prompt for input and display results. */
    public static void main(String[] args) {
        int[] items; /* This references an array. */
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

        if (size == 0) {
            System.out.println("Empty array.");
        } else {
            System.out.print("Enter value for each item: ");

            for (int i = 0; i < size; i++) {
                items[i] = inStream.nextInt();
            }

            listArray(items);
            System.out.println();
        }

        inStream.close();
    }

    private static void listArray(int[] a) {
        System.out.print("Contents of the array: ");

        for (int val: a) {
            System.out.printf("%d ", val);
        }
    }
}
