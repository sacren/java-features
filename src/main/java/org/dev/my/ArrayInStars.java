/**
 * Prompt the user for the number of items in an array (a non-negative integer)
 * and for the values of all the items.  Print the contents of the array with
 * the index and values represented by number of stars.
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInStars {
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
        }

        inStream.close();
    }

    private static void listArray(int[] a) {
        final int size = a.length;
        final int first = 0;

        for (int row = first; row < size; row++) {
            System.out.printf("%d: ", row);

            for (int col = first; col < a[row]; col++) {
                System.out.print('*');
            }

            System.out.printf("(%d)%n", a[row]);
        }
    }
}
