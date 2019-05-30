/**
 * RvsIntOp class for reversed number by integer operation.
 *
 * <p>Private instance data:
 * -num:int
 *
 * <p>Constructor:
 * +RvsIntOp(num:int)
 *
 * <p>Public methods:
 * +getRvs():int
 * +getSum():int
 * +toString():String
 */
import java.util.Scanner;

public class RvsIntOp {
    /* private instance data */
    private int num;

    /** RvsIntOp constructor. */
    public RvsIntOp(int num) {
        this.num = num;
    }

    /** RvsIntOp getter for reversed integer. */
    public int getRvs() {
        int remainder;
        int reversed = 0;
        /* decrement through division by 10 */
        for (int i = num; i != 0; i /= 10) {
            remainder = i % 10;
            reversed *= 10;
            reversed += remainder;
        }
        return reversed;
    }

    /** RvsIntOp getter for sum of digits. */
    public int getSum() {
        int sum = 0;
        /* decrement through division by 10 */
        for (int i = Math.abs(num); i != 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }

    /** RvsIntOp string method. */
    public String toString() {
        return String.format(
                "Original input: %d%n"
                        + "Reversed:       %d%n"
                        + "Sum of digits:  %d",
                num,
                getRvs(),
                getSum());
    }
}
