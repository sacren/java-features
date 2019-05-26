/**
 * Prod class.
 *
 * <p>Product of integers from 1 to 10, 1 to 11, 1 to 12... and 1 to 15.
 *
 * <p>Private instance data:
 * -product:long
 *
 * <p>Constructor:
 * +Prod()
 *
 * <p>Public methods:
 * +setTo10():void
 * +toString():String
 */
public class Prod {
    /* private instance data */
    private long product;

    /** Prod constructor. */
    public Prod() {
        setTo10();
    }

    /** Prod getter from 1 to 10. */
    public void setTo10() {
        product = 1;
        for (int i = 0; i < 10; i++) {
            product *= i + 1;
        }
    }

    /** Prod string method. */
    public String toString() {
        String s = String.format(
                "Product from 1 to 10: %d%n",
                product);
        for (int i = 0; i < 5; i++) {
            product *= i + 11;
            s += String.format(
                    "Product from 1 to %d: %d%n",
                    i + 11, product);
        }
        return s;
    }
}
