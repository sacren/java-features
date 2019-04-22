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
    private int gcd;

    /** Gcd constructor. */
    public Gcd(int n, int m) {
        setNum1(n);
        setNum2(m);
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

    /** Gcd method for greatest common denominator. */
    public void gcd() {
        int remainder;
        int tmp1 = num1;
        int tmp2 = num2;
        for ( ; ; ) {
            if (tmp2 == 0) {
                break;
            }
            remainder = tmp1 % tmp2;
            tmp1 = tmp2;
            tmp2 = remainder;
        }
        gcd = tmp1;
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
                "First Number:  %d%n"
                        + "Second Number: %d%n"
                        + "GCD:           %d",
                num1,
                num2,
                gcd);
    }
}
