/**
 * ToDecimal class.
 *
 * <p>String with radix to decimal number.
 *
 * <p>Private instance data:
 * -num:String
 * -radix:int
 *
 * <p>Constructor:
 * +ToDecimal(num:String, radix:int)
 *
 * <p>Public method:
 * +toString():String
 */
public class ToDecimal {
    /* private instance data */
    private String num;
    private int radix;

    /** ToDecimal constructor. */
    public ToDecimal(String num, int radix) {
        this.num = num;
        this.radix = radix;
    }

    /** ToDecimal string method. */
    public String toString() {
        return String.format(
                "Input string:  %s%n"
                        + "Decimal value: %d",
                num,
                Integer.parseInt(num, radix));
    }
}
