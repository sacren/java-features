/**
 * Gcd class for greatest common denominator.
 *
 * <p>num1 >= num2 > 0
 * GCD(num1, 0) = num1
 * GCD(num1, num2) = GCD(num2, num1 mod num2)
 *
 * <p>Private data:
 * -num1:int
 * -num2:int
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
    private int num1;
    private int num2;
    private int tmpA;
    private int tmpB;
    private int gcd;

    /** Gcd constructor. */
    public Gcd(int n, int m) {
        setNum1(n);
        setNum2(m);
        dupe();
        gcd();
    }

    /** Gcd setter for num1. */
    public void setNum1(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", n));
        }
        num1 = n;
    }

    /** Gcd setter for num2. */
    public void setNum2(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", n));
        }
        num2 = n;
    }

    /** Gcd method for tmpA and tmpB. */
    public void dupe() {
        tmpA = num1;
        tmpB = num2;
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

    /** Gcd method for recursive GCD. */
    public int recGcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return recGcd(m, n % m);
    }

    /** Gcd instance description. */
    public String toString() {
        return String.format(
                "First Number: %d%n"
                        + "Second Number: %d%n"
                        + "GCD: %d",
                num1,
                num2,
                gcd);
    }
}
