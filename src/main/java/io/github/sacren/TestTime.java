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
        /* advance one second */
        ct.nextSecond();
        System.out.println();
        System.out.println("=== Advance to the next second ===");
        System.out.println();
        System.out.println(ct);
        /* reset time to zero hour */
        ct.setTime();
        System.out.println();
        System.out.println("=== Reset time to zero hour ===");
        System.out.println();
        System.out.println(ct);
        /* restore Time instance to original state */
        ct.restoreTime();
        System.out.println();
        System.out.println("=== Restore to start time ===");
        System.out.println();
        System.out.println(ct);
        /* advance two seconds */
        ct.nextSecond().nextSecond();
        System.out.println();
        System.out.println("=== Advance to the next next second ===");
        System.out.println();
        System.out.println(ct);
        /* restore Time instance to original state again */
        ct.restoreTime();
        System.out.println();
        System.out.println("=== Restore to start time again ===");
        System.out.println();
        System.out.println(ct);
        System.out.println();
        System.out.println("=== Default time ===");
        System.out.println();
        Time dt = new Time();
        System.out.println(dt);
        /* restore to default start time */
        dt.restoreTime();
        System.out.println();
        System.out.println("=== Restore to default start time ===");
        System.out.println();
        System.out.println(dt);
    }
}
