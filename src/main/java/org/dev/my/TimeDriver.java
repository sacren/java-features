/**
 * Driver for Time.
 */
import java.util.Scanner;

public class TimeDriver {
    /** Prompt the user for time input and initialize Time. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        System.out.print("Enter the hour: ");
        final int hour = inStream.nextInt();
        System.out.print("Enter the minute: ");
        final int minute = inStream.nextInt();
        System.out.print("Enter the second: ");
        final int second = inStream.nextInt();
        inStream.close();
        Time currentTime = new Time(second, minute, hour);
        System.out.println();
        System.out.print(currentTime);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                currentTime.getHour(),
                currentTime.getMinute(),
                currentTime.getSecond());
        /* Advance one second. */
        currentTime.nextSecond();
        System.out.printf("Advance to the next second.%n%n");
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
        System.out.printf("Restore to original state.%n%n");
        currentTime.setOriginalState();
        System.out.print(currentTime);
        System.out.printf(
                "Current time is %02d:%02d:%02d%n%n",
                currentTime.getHour(),
                currentTime.getMinute(),
                currentTime.getSecond());
        /* Advance two seconds. */
        currentTime.nextSecond().nextSecond();
        System.out.printf("Advance to the next next second.%n%n");
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
