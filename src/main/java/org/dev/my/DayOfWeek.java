/**
 * Prompt the user for an integer between 0 and 6 (0 for Sunday, 6 for
 * Saturday, etc.) and print the corresponding day of the week.
 */
import java.util.Scanner;

public class DayOfWeek {
    /** Ask the user for a number to show day of the week. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        String[] weekDay = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        };
        int day;
        for ( ; ; ) {
            System.out.print("Enter between 0 and 6 with 0 for Sunday: ");
            day = inStream.nextInt();
            if (day >= 0 && day <= 6) {
                break;
            }
            System.out.printf("%d is an invalid number. Try again.%n", day);
        }
        System.out.printf("%d is for %s%n", day, weekDay[day]);
        inStream.close();
    }
}
