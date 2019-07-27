/**
 * Test driver for Date class.
 */
public class TestDate {
    /** Test driver for Date. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Independence Day ===");
        System.out.println();
        System.out.println(new Date());
        System.out.println();
        System.out.println("=== Arbitrary Date ===");
        System.out.println();
        Date date = new Date(1994, 11, 24);
        System.out.println(date);
        date.setYear(3567);
        date.setMonth(4);
        date.setDay(30);
        System.out.println();
        System.out.println("=== Change to an arbitrary date ===");
        System.out.println();
        System.out.println(date);
        date.setDate(4798, 1, 1);
        System.out.println();
        System.out.println("=== Change to another arbitrary date ===");
        System.out.println();
        System.out.println(date);
    }
}
