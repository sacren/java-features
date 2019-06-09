/**
 * SumDigits class for the sum of individual digits.
 *
 * <p>Private instance data:
 * -expr:String
 * -sum:int
 *
 * <p>Constructor:
 * +SumDigits(list:char[])
 *
 * <p>Public methods:
 * +set(list:char[]):void
 * +toString():String
 */
public class SumDigits {
    /* private instance data */
    private String expr;
    private int sum;

    /** SumDigits constructor. */
    public SumDigits(char[] list) {
        set(list);
    }

    /** SumDigits setter for the sum and characters of array. */
    public void set(char[] list) {
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
