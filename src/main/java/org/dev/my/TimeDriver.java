/**
 * Driver for Time.
 */
import java.util.Scanner;

public class TimeDriver {
    /** Prompt the user for time input and initialize Time. */
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
        Time currentTime = new Time(second, minute, hour);
        System.out.println();
        printTime(currentTime);
    }

    private static void printTime(Time time) {
        System.out.print(time);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                time.getHour(),
                time.getMinute(),
                time.getSecond());
        /* Advance one second. */
        time.nextSecond();
        System.out.printf("Advance to the next second.%n%n");
        System.out.print(time);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                time.getHour(),
                time.getMinute(),
                time.getSecond());
        /* Reset time to zero hour by default values. */
        System.out.printf("Reset time to zero hour.%n%n");
        time.setTime(Time.DEFAULT_SECOND, Time.DEFAULT_MINUTE, Time.DEFAULT_HOUR);
        System.out.print(time);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                time.getHour(),
                time.getMinute(),
                time.getSecond());
        /* Restore private attributes to original values. */
        System.out.printf("Restore to original state.%n%n");
        time.setOriginalState();
        System.out.print(time);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                time.getHour(),
                time.getMinute(),
                time.getSecond());
        /* Advance two seconds. */
        time.nextSecond().nextSecond();
        System.out.printf("Advance to the next next second.%n%n");
        System.out.print(time);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n",
                time.getHour(),
                time.getMinute(),
                time.getSecond());
    }
}
