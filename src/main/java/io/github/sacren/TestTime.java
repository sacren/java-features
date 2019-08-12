/**
 * Test driver for Time class.
 */
import java.util.Scanner;

public class TestTime {
    /** Test driver for Time. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int hour;
        System.out.print("Enter the hour: ");
        hour = inStream.nextInt();
        int minute;
        System.out.print("Enter the minute: ");
        minute = inStream.nextInt();
        int second;
        System.out.print("Enter the second: ");
        second = inStream.nextInt();
        inStream.close();
        Time currentTime = new Time(new Cube(second, minute, hour));
        System.out.println();
        System.out.println("=== What time is it? ===");
        System.out.println();
        System.out.println(currentTime);
        /* advance one second. */
        currentTime.nextSecond();
        System.out.println();
        System.out.println("=== Advance to the next second ===");
        System.out.println();
        System.out.println(currentTime);
        /* reset time to zero hour by default values. */
        currentTime.setDefTime();
        System.out.println();
        System.out.println("=== Reset time to zero hour ===");
        System.out.println();
        System.out.println(currentTime);
        /* restore private attributes to original values */
        currentTime.restoreTime();
        System.out.println();
        System.out.println("=== Restore to start time ===");
        System.out.println();
        System.out.println(currentTime);
        /* advance two seconds */
        currentTime.nextSecond().nextSecond();
        System.out.println();
        System.out.println("=== Advance to the next next second ===");
        System.out.println();
        System.out.println(currentTime);
    }
}
