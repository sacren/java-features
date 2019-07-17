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
 * +set(num:int):void
 * +toString():String
 */
import java.time.Month;

public class NumMon {
    /* private instance data */
    private int num;

    /** NumMon constructor. */
    public NumMon(int num) {
        set(num);
    }

    /** NumMon setter for instance data. */
    public void set(int num) {
        if (num < 1 || num > 12) {
            throw new IllegalArgumentException(
                    String.format(
                        "%d is invalid!", num));
        }
        this.num = num;
    }

    /** NumMon string method. */
    public String toString() {
        return String.format(
                "Number: %d%n%n"
                        + "Month: %TB",
                num,
                Month.of(num));
    }
}
