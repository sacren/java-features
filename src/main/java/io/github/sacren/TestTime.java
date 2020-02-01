/**
 * Test driver for Time class.
 */
public class TestTime {
    /** Test driver for Time. */
    public static void main(String[] args) {
        Time ct = new Time(new Trio(23, 59, 58));
        System.out.println();
        System.out.println("=== What time is it? ===");
        System.out.println();
        System.out.println(ct);
        System.out.println();
        System.out.println("=== Advance to the next second ===");
        System.out.println();
        System.out.println(ct.nextSecond());
        System.out.println();
        System.out.println("=== Reset time to zero hour ===");
        System.out.println();
        System.out.println(ct.zeroHour());
        System.out.println();
        System.out.println("=== Turn time back one second ===");
        System.out.println();
        System.out.println(ct.prevSecond());
        System.out.println();
        System.out.println("=== Restore to start time ===");
        System.out.println();
        System.out.println(ct.restoreTime());
        System.out.println();
        System.out.println("=== Advance to the next next second ===");
        System.out.println();
        System.out.println(ct.nextSecond().nextSecond());
        System.out.println();
        System.out.println("=== Restore to start time again ===");
        System.out.println();
        System.out.println(ct.restoreTime());
        System.out.println();
        System.out.println("=== Default time ===");
        System.out.println();
        Time dt = new Time();
        System.out.println(dt);
        System.out.println();
        System.out.println("=== Restore to default start time ===");
        System.out.println();
        System.out.println(dt.restoreTime());
    }
}
