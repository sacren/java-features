/**
 * Exponent class.
 *
 * <p>Private instance data:
 * -base:int
 * -exponent:int
 * -product:int
 *
 * <p>Constructor:
 * +Exponent(base:int, exponent:int)
 *
 * <p>Public methods:
 * +setExpo(exponent:int):void
 * +toString():String
 */
public class Exponent {
    /* private instance data */
    private int base;
    private int exponent;
    private int product;

    /** Exponent constructor. */
    public Exponent(int base, int exponent) {
        this.base = base;
        setExpo(exponent);
        product = 1;
    }

    /** Exponent setter for exponent. */
    public void setExpo(int exponent) {
        if (exponent <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", exponent));
        }
        this.exponent = exponent;
    }

    /** Exponent instance printout. */
    public String toString() {
        for (int i = 0; i < exponent; i++) {
            product *= base;
        }
        return String.format("%d ** %d = %d", base, exponent, product);
    }
}
