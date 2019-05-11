/**
 * OctStr class converts octal number to decimal.
 *
 * <p>Private instance data:
 * -inStr:String
 *
 * <p>Constructor:
 * +OctStr(inStr:String)
 *
 * <p>Public methods:
 * +toString():String
 */
public class OctStr {
    /* private static data */
    private static final int RADIX = 8;

    /* private instance data */
    private String inStr;

    /** OctStr constructor. */
    public OctStr(String inStr) {
        this.inStr = inStr;
    }

    /** OctStr instance string method. */
    public String toString() {
        return String.format(
                "Octal:   %s%n"
                        + "Decimal: %d",
                inStr,
                Integer.parseInt(inStr, RADIX));
    }
}
