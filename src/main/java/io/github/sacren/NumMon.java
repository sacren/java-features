/**
 * NumMon class for 1 - 12 for the name of the month in upper case.
 *
 * <p>Private instance data:
 * -num:int
 *
 * <p>Constructor:
 * +NumMon(num:int)
 *
 * <p>Public methods:
 * +check():void
 * +toString():String
 */
import java.time.Month;

public class NumMon {
    /* private instance data */
    private int num;

    /** NumMon constructor. */
    public NumMon(int num) {
        this.num = num;
        check();
    }

    /** NumMon method to validate the input. */
    public void check() {
        if (num < 1 || num > 12) {
            throw new IllegalArgumentException(
                    String.format(
                        "%d is invalid!", num));
        }
    }

    /** NumMon instance string. */
    public String toString() {
        return String.format(
                "Number: %d%n%n"
                        + "Month: %TB",
                num,
                Month.of(num));
    }
}
