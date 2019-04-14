/**
 * Pi class for the approximte value of π.
 *
 * <p>π = 4 × (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
 *
 * <p>Private instance data:
 * -pi:double
 *
 * <p>Constructor:
 * +Pi()
 *
 * <p>Public methods:
 * +calcPi():void
 * +toString():String
 */
public class Pi {
    /* private instance data */
    private double pi;

    /** Pi constructor. */
    public Pi() {
        pi = 1;
        calcPi();
    }

    /** Pi method to calculate π. */
    public void calcPi() {
        /* Integer.MAX_VALUE - 2 for the last loop */
        for (int i = 3; i < Integer.MAX_VALUE - 1; i += 2) {
            if (i % 4 == 1) {
                pi += (double) 1 / i;
                continue;
            }
            if (i % 4 == 3) {
                pi -= (double) 1 / i;
            }
        }
        pi *= 4;
    }

    /** Pi instance printout. */
    public String toString() {
        return String.format(
                "π            = %.15f%n"
                        + "π of Math.PI = %.15f%n%n"
                        + "Percent of Math.PI = %.15f%%",
                pi,
                Math.PI,
                pi / Math.PI * 100);
    }
}
