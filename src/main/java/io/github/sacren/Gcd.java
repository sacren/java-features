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
 *
 * <p>Constructor:
 * +Gcd(n:int, m:int)
 *
 * <p>Public methods:
 * +getNum1():int
 * +setNum1(num:int):void
 * +getNum2():int
 * +setNum2(num2:int):void
 * +gcd():int
 * +recGcd(n:int, m:int):int
 * +toString():String
 */
public class Gcd {
    /* private instance data */
    private int num1;
    private int num2;

    /** Gcd constructor. */
    public Gcd(int n, int m) {
        setNum1(n);
        setNum2(m);
    }

    /** Gcd getter for num1. */
    public int getNum1() {
        return num1;
    }

    /** Gcd setter for num1. */
    public void setNum1(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", num));
        }
        num1 = num;
    }

    /** Gcd getter for num2. */
    public int getNum2() {
        return num2;
    }

    /** Gcd setter for num2. */
    public void setNum2(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", num));
        }
        num2 = num;
    }

    /** Gcd method for greatest common denominator. */
    public int gcd() {
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
        return tmp1;
    }

    /** Gcd method for recursive GCD. */
    public int recGcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return recGcd(m, n % m);
    }

    /** Gcd instance printout. */
    public String toString() {
        return String.format(
                "First Number:  %d%n"
                        + "Second Number: %d%n"
                        + "GCD:           %d",
                num1,
                num2,
                gcd());
    }
}
