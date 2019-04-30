/**
 * ToDecimal class.
 *
 * <p>String with radix to decimal number.
 *
 * <p>Private instance data:
 * -usrStr:String
 * -radix:int
 *
 * <p>Constructor:
 * +ToDecimal(usrStr:String, radix:int)
 *
 * <p>Public method:
 * +toString():String
 */
public class ToDecimal {
    /* private instance data */
    private String usrStr;
    private int radix;

    /** ToDecimal constructor. */
    public ToDecimal(String usrStr, int radix) {
        this.usrStr = usrStr;
        this.radix = radix;
    }

    /** ToDecimal instance printout. */
    public String toString() {
        return String.format(
                "Input string:  %s%n"
                        + "Decimal value: %d",
                usrStr,
                Integer.parseInt(usrStr, radix));
    }
}
