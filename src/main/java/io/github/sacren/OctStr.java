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
 * +check():void
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
        check();
    }

    /** OctStr method to validate user input. */
    public void check() {
        if (inStr.isEmpty()) {
            throw new IllegalArgumentException(
                    String.format("\"%s\" is invalid!", inStr));
        }
        for (char c : inStr.toCharArray()) {
            if (Character.digit(c, RADIX) == -1) {
                throw new IllegalArgumentException(
                        String.format("%s is invalid!", inStr));
            }
        }
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
