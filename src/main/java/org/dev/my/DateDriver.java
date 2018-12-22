/**
 * Date driver.
 */
import java.util.Scanner;

public class DateDriver {
    /** Prompt the user for year, month and day. Initialize Date object. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int year;
        int month;
        int day;
        for ( ; ; ) {
            System.out.print("Enter the year in number: ");
            year = inStream.nextInt();
            if (year >= 0) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", year);
        }
        for ( ; ; ) {
            System.out.print("Enter the month in number: ");
            month = inStream.nextInt();
            if (month > 0 && month <= 12) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", month);
        }
        for ( ; ; ) {
            System.out.print("Enter the day in number: ");
            day = inStream.nextInt();
            if (day > 0 && day <= 31) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", day);
        }
        inStream.close();
        Date defaultDate = new Date();
        Date date = new Date(year, month, day);
        System.out.println();
        System.out.print(defaultDate);
        System.out.printf(
                "Year is %04d%n"
                        + "Month is %02d%n"
                        + "Day is %02d%n",
                defaultDate.getYear(), defaultDate.getMonth(), defaultDate.getDay());
        System.out.println();
        System.out.print(date);
        System.out.printf(
                "Year is %04d%n"
                        + "Month is %02d%n"
                        + "Day is %02d%n",
                date.getYear(), date.getMonth(), date.getDay());
    }
}
