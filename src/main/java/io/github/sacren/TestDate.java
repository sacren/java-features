/**
 * Test driver for Date class.
 */
public class TestDate {
    /** Test driver for Date. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Unix epoch ===");
        System.out.println();
        System.out.println(new Date());
        System.out.println();
        System.out.println("=== Arbitrary Date ===");
        System.out.println();
        Date date = new Date(new Trio(1994, 11, 24));
        System.out.println(date);
        System.out.println();
        System.out.println("=== Change to an arbitrary date ===");
        System.out.println();
        date.setYear(3567);
        date.setMonth(4);
        date.setDay(30);
        System.out.println(date);
        System.out.println();
        System.out.println("=== Change to another arbitrary date ===");
        System.out.println();
        date.setDate(new Trio(4798, 2, 28));
        System.out.println(date);
    }
}
