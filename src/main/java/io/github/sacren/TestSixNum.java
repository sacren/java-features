/**
 * Test driver for SixNum class.
 */
import java.util.Scanner;

public class TestSixNum {
    /** SixNum test driver. */
    public static void main(String[] args) {
        int[] nums = new int[SixNum.LIST.length];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < SixNum.LIST.length; i++) {
            System.out.printf("Enter a number for %d: ", i + 1);
            nums[i] = in.nextInt();
        }
        in.close();
        System.out.println();
        System.out.println("=== Six numbers ===");
        System.out.println();
        System.out.println(new SixNum(nums));
    }
}
