/**
 * MagicSum class.
 *
 * <p>Private instance data:
 * -sum:int
 *
 * <p>Constructor:
 * +MagicSum(num:int)
 *
 * <p>Public methods:
 * +add(num:int):void
 * +hasMagic():boolean
 * +toString():String
 */
public class MagicSum {
    /* private instance data */
    private int sum;

    /** MagicSum constructor. */
    public MagicSum() {
        sum = 0;
    }

    /** MagicSum method to add to sum. */
    public void add(int num) {
        if (num < 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", num));
        }
        sum += num;
    }

    /** MagicSum getter for digit 8. */
    public boolean hasMagic() {
        int num = sum;
        for ( ; ; ) {
            if (num == 0) { /* All the digits are dropped */
                return false;
            }
            if (num % 10 == 8) { /* 8 in the number */
                break;
            }
            num /= 10; /* Drop least significant digit */
        }
        return true;
    }

    /** MagicSum instance printout. */
    public String toString() {
        return String.format(
                "%d is%s a magic sum",
                sum,
                hasMagic() ? "" : " not");
    }
}
