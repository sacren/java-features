/**
 * Test driver for ArrayByStars class.
 */
import java.util.Scanner;

public class TestArrayByStars {
    /** ArrayByStars test dirver. */
    public static void main(String[] args) {
        int[] items; /* This references an array. */
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        size = in.nextInt();
        items = new int[size];
        System.out.print("Enter value for each item: ");
        for (int i = 0; i < size; i++) {
            items[i] = in.nextInt();
        }
        in.close();
        System.out.print(new ArrayByStars(items));
    }
}
