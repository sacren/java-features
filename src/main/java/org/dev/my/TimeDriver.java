/**
 * Driver for Time.
 */
import java.util.Scanner;

public class TimeDriver {
    /** Prompt the user for time input and initialize Time. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int hour;
        for ( ; ; ) {
            System.out.print("Enter the hour: ");
            hour = inStream.nextInt();
            if (hour >= 0 && hour <= 24) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", hour);
        }
        int minute;
        for ( ; ; ) {
            System.out.print("Enter the minute: ");
            minute = inStream.nextInt();
            if (minute >= 0 && minute <= 60) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", minute);
        }
        int second;
        for ( ; ; ) {
            System.out.print("Enter the second: ");
            second = inStream.nextInt();
            if (second >= 0 && second <= 60) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", second);
        }
        inStream.close();
        Time currentTime = new Time(second, minute, hour);
        System.out.println();
        System.out.print(currentTime);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                currentTime.getHour(),
                currentTime.getMinute(),
                currentTime.getSecond());
        /* Reset time to zero hour by default values. */
        currentTime.setSecond(Time.DEFAULT_SECOND);
        currentTime.setMinute(Time.DEFAULT_MINUTE);
        currentTime.setHour(Time.DEFAULT_HOUR);
        System.out.printf("Reset time to zero hour.%n%n");
        System.out.print(currentTime);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                currentTime.getHour(),
                currentTime.getMinute(),
                currentTime.getSecond());
        /* Restore private attributes to original values. */
        currentTime.setSecond(currentTime.getOriginalSecond());
        currentTime.setMinute(currentTime.getOriginalMinute());
        currentTime.setHour(currentTime.getOriginalHour());
        System.out.printf("Restore to original values.%n%n");
        System.out.print(currentTime);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                currentTime.getHour(),
                currentTime.getMinute(),
                currentTime.getSecond());
        /* Reset to zero hour by setTime(). */
        currentTime.setTime(Time.DEFAULT_SECOND, Time.DEFAULT_MINUTE, Time.DEFAULT_HOUR);
        System.out.printf("Reset again to zero hour.%n%n");
        System.out.print(currentTime);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n",
                currentTime.getHour(),
                currentTime.getMinute(),
                currentTime.getSecond());
    }
}
