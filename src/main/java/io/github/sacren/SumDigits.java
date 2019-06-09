/**
 * SumDigits class for the sum of individual digits.
 *
 * <p>Private instance data:
 * -list:char[]
 *
 * <p>Constructor:
 * +SumDigits()
 *
 * <p>Public methods:
 * +set():void
 * +toString():String
 */
public class SumDigits {
    /* private instance data */
    private char[] list;
    private String expr;
    private int sum;

    /** SumDigits constructor. */
    public SumDigits(char[] list) {
        this.list = list;
        set();
    }

    /** SumDigits setter for the sum and characters of array. */
    public void set() {
        StringBuffer sb = new StringBuffer();
        sum = 0;
        for (char c : list) {
            sb.append(c);
            sb.append(" + ");
            sum += Integer.parseUnsignedInt(Character.toString(c));
        }
        sb.setCharAt(sb.lastIndexOf("+"), '=');
        expr = sb.toString();
    }

    /** SumDigits string method. */
    public String toString() {
        return expr + sum;
    }
}
