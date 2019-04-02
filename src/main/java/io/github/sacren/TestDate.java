/**
 * Test driver for Date class.
 */
public class TestDate {
    /** Test driver for Date. */
    public static void main(String[] args) {
        Date defaultDate = new Date();
        Date date = new Date(1994, 11, 24);
        System.out.println();
        System.out.println("=== Independence Day ===");
        System.out.println();
        System.out.println(defaultDate);
        System.out.println();
        System.out.printf(
                "Year is %04d%n"
                        + "Month is %02d%n"
                        + "Day is %02d%n",
                defaultDate.getYear(),
                defaultDate.getMonth(),
                defaultDate.getDay());
        System.out.println();
        System.out.println("=== Arbitrary Date ===");
        System.out.println();
        System.out.println(date);
        System.out.println();
        System.out.printf(
                "Year is %04d%n"
                        + "Month is %02d%n"
                        + "Day is %02d%n",
                date.getYear(), date.getMonth(), date.getDay());
        date.setYear(3567);
        date.setMonth(4);
        date.setDay(30);
        System.out.println();
        System.out.println("=== Change to an arbitrary date ===");
        System.out.println();
        System.out.println(date);
        System.out.println();
        System.out.printf(
                "Year is %04d%n"
                        + "Month is %02d%n"
                        + "Day is %02d%n",
                date.getYear(),
                date.getMonth(),
                date.getDay());
        date.setDate(4798, 1, 1);
        System.out.println();
        System.out.println("=== Change to another arbitrary date ===");
        System.out.println();
        System.out.println(date);
        System.out.printf(
                "Year is %04d%n"
                        + "Month is %02d%n"
                        + "Day is %02d%n",
                date.getYear(),
                date.getMonth(),
                date.getDay());
    }
}
