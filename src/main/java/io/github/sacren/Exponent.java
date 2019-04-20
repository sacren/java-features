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
        this.exponent = exponent;
        product = 1;
    }

    /** Exponent instance printout. */
    public String toString() {
        for (int i = 0; i < exponent; i++) {
            product *= base;
        }
        return String.format("%d ** %d = %d", base, exponent, product);
    }
}
