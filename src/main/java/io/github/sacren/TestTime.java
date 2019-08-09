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
        Time currentTime = new Time(new Point3D(second, minute, hour));
        System.out.println();
        System.out.println(currentTime);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                currentTime.getHour(),
                currentTime.getMinute(),
                currentTime.getSecond());
        /* Advance one second. */
        currentTime.nextSecond();
        System.out.printf("Advance to the next second.%n%n");
        System.out.println(currentTime);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                currentTime.getHour(),
                currentTime.getMinute(),
                currentTime.getSecond());
        /* Reset time to zero hour by default values. */
        System.out.printf("Reset time to zero hour.%n%n");
        currentTime.setTime(Time.DEFAULT_TIME);
        System.out.println(currentTime);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                currentTime.getHour(),
                currentTime.getMinute(),
                currentTime.getSecond());
        /* Restore private attributes to original values. */
        System.out.printf("Restore to original state.%n%n");
        currentTime.setOriginalState();
        System.out.println(currentTime);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                currentTime.getHour(),
                currentTime.getMinute(),
                currentTime.getSecond());
        /* Advance two seconds. */
        currentTime.nextSecond().nextSecond();
        System.out.printf("Advance to the next next second.%n%n");
        System.out.println(currentTime);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n",
                currentTime.getHour(),
                currentTime.getMinute(),
                currentTime.getSecond());
    }
}
