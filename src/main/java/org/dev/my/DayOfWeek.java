/**
 * Prompt the user for an integer between 0 and 6 (0 for Sunday, 6 for
 * Saturday, etc.) and print the corresponding day of the week.
 */
import java.util.Scanner;

public class DayOfWeek {
    /** Ask the user for a number to show day of the week. */
    public static void main(String[] args) {
        int day;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter between 0 and 6 with 0 for Sunday: ");
            day = inStream.nextInt();

            if (day >= 0 && day <= 6) {
                break;
            }

            System.out.println("You entered an invalid number. Try again.");
        }

        dayOfWeek(day);
        inStream.close();
    }

    private static void dayOfWeek(int number) {
        String day = "Sunday";

        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
        }

        System.out.printf("You entered %d for %s%n", number, day);
    }
}
