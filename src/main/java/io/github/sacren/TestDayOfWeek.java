/**
 * Test driver for DayOfWeek class.
 */
import java.util.Scanner;

public class TestDayOfWeek {
    /** DayOfWeek test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter between 0 and 6 with 0 for Sunday: ");
        int day = in.nextInt();
        in.close();
        DayOfWeek dayOfWeek = new DayOfWeek(day);
        System.out.println();
        System.out.println("=== Day of week ===");
        System.out.println();
        System.out.println(dayOfWeek);
    }
}
