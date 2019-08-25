/**
 * RvsInt class for reversed integer number and sum.
 *
 * <p>Private instance data:
 * -num:int
 *
 * <p>Constructor:
 * +RvsInt(num:int)
 *
 * <p>Public methods:
 * +getRvs():int
 * +getSum():int
 * +toString():String
 */
public class RvsInt {
    /* private instance data */
    private int num;

    /** RvsInt constructor. */
    public RvsInt(int num) {
        this.num = num;
    }

    /** RvsInt getter for the reversed integer. */
    public int getRvs() {
        StringBuffer sb = new StringBuffer(Integer.toString(num));
        return Integer.parseUnsignedInt(sb.reverse().toString());
    }

    /** RvsInt getter for sum of digits. */
    public int getSum() {
        int sum = 0;
        for (char c : Integer.toString(num).toCharArray()) {
            sum += Integer.parseUnsignedInt(Character.toString(c));
        }
        return sum;
    }

    /** RvsInt string method. */
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
