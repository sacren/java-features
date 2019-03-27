/**
 * Gcd class for greatest common denominator.
 *
 * <p>numA >= numB > 0
 * GCD(numA, 0) = numA
 * GCD(numA, numB) = GCD(numB, numA mod numB)
 *
 * <p>Private data:
 * -numA:int
 * -numB:int
 * -tmpA:int
 * -tmpB:int
 * -gcd:int
 *
 * <p>Constructor:
 * +Gcd(n:int, m:int)
 *
 * <p>Public methods:
 * +toString():String
 */
public class Gcd {
    /* private instance data */
    private int numA;
    private int numB;
    private int tmpA;
    private int tmpB;
    private int gcd;

    /** Gcd constructor. */
    public Gcd(int n, int m) {
        numA(n);
        numB(m);
        dupe();
        gcd();
    }

    /** Gcd setter for numA. */
    public void numA(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", n));
        }
        numA = n;
    }

    /** Gcd setter for numB. */
    public void numB(int m) {
        if (m <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", m));
        }
        numB = m;
    }

    /** Gcd method for tmpA and tmpB. */
    public void dupe() {
        tmpA = numA;
        tmpB = numB;
    }

    /** Gcd method for greatest common denominator. */
    public void gcd() {
        int remainder;
        for ( ; ; ) {
            if (tmpB == 0) {
                break;
            }
            remainder = tmpA % tmpB;
            tmpA = tmpB;
            tmpB = remainder;
        }
        gcd = tmpA;
    }

    /** Gcd instance description. */
    public String toString() {
        return String.format(
                "First Number: %d%n"
                        + "Second Number: %d%n"
                        + "GCD: %d",
                numA,
                numB,
                gcd);
    }
}
