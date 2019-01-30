/**
 * Test driver for Date class.
 */
import java.util.Scanner;

public class TestDate {
    /** Test driver for Date. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int year;
        System.out.print("Enter the year in number: ");
        year = inStream.nextInt();
        int month;
        System.out.print("Enter the month in number: ");
        month = inStream.nextInt();
        int day;
        System.out.print("Enter the day in number: ");
        day = inStream.nextInt();
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
        date.setYear(3567);
        date.setMonth(4);
        date.setDay(30);
        System.out.println();
        System.out.printf("[Change to an arbitrary date]%n");
        System.out.print(date);
        System.out.printf(
                "Year is %04d%n"
                        + "Month is %02d%n"
                        + "Day is %02d%n",
                date.getYear(), date.getMonth(), date.getDay());
        date.setDate(4798, 1, 1);
        System.out.println();
        System.out.printf("[Change to another arbitrary date]%n");
        System.out.print(date);
        System.out.printf(
                "Year is %04d%n"
                        + "Month is %02d%n"
                        + "Day is %02d%n",
                date.getYear(), date.getMonth(), date.getDay());
    }
}
