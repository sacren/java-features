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

    /** RvsInt string method. */
    public String toString() {
        return String.format(
                          "Original input: %d%n"
                        + "Reversed:       %d",
                num,
                getRvs());
    }
}
