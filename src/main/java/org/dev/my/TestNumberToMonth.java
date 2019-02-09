/**
 * Prompt the user for an integer between 1 and 12 for the name of the month
 * in upper case.
 */
import java.util.Scanner;

public class TestNumberToMonth {
    /** Ask the user for the number to display the month. */
    public static void main(String[] args) {
        int month;
        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter 1 to 12 for the month: ");
            month = inStream.nextInt();

            if (month >= 1 && month <= 12) {
                break;
            }

            System.out.println("You entered an invalid number. Try again.");
        }

        System.out.printf("%d is for %s%n", month, getMonth(month));
        inStream.close();
    }

    private static String getMonth(final int number) {
        String month = "december";

        switch (number) {
            case 1:
                month = "january";
                break;
            case 2:
                month = "february";
                break;
            case 3:
                month = "march";
                break;
            case 4:
                month = "april";
                break;
            case 5:
                month = "may";
                break;
            case 6:
                month = "june";
                break;
            case 7:
                month = "july";
                break;
            case 8:
                month = "august";
                break;
            case 9:
                month = "september";
                break;
            case 10:
                month = "october";
                break;
            case 11:
                month = "november";
                break;
            case 12:
                /* month has been initialized. */
                break;
            default:
                /* Nothing to do. */
        }

        return month.toUpperCase();
    }
}
