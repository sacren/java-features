/**
 * Test driver for ArrayByStars class.
 */
import java.util.Scanner;

public class TestArrayByStars {
    /** ArrayByStars test driver. */
    public static void main(String[] args) {
        int[] items; /* This references an array. */
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        size = in.nextInt();
        items = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter value for item %d: ", i + 1);
            items[i] = in.nextInt();
        }
        in.close();
        System.out.println();
        System.out.println("=== Array by asterisks ===");
        System.out.println();
        System.out.print(new ArrayByStars(items));
    }
}
