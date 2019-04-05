/**
 * Harmonic class.
 *
 * <p>Sum of a harmonic series with bounds of 50,000.
 *
 * <p>1 + 1/2 + 1/3 + ... + 1/50000 or
 * 1/50000 + 1/49999 + 1/49998 + ... + 1/3 + 1/2 + 1.
 * Difference?
 *
 * <p>Private data:
 * -sumFrom:double
 * -sumTo:double
 * -bounds:int
 *
 * <p>Constructor:
 * +Harmonic(bounds:int)
 *
 * <p>Public methods:
 * +sumFrom():void
 * +sumTo():void
 * +toString():String
 */
public class Harmonic {
    /* private data */
    private double sumFrom;
    private double sumTo;
    private int bounds;

    /** Harmonic custom constructor. */
    public Harmonic(int bounds) {
        this.bounds = bounds;
        sumFrom();
        sumTo();
    }

    /** Harmonic method for the sum of the series from 1. */
    public void sumFrom() {
        sumFrom = 0;
        for (int i = 0; i < bounds; i++) {
            sumFrom += (double) 1 / (i + 1);
        }
    }

    /** Harmonic method for the sum of the series to 1. */
    public void sumTo() {
        sumTo = 0;
        for (int i = 0; i < bounds; i++) {
            sumTo += (double) 1 / (bounds - i);
        }
    }

    /** Harmonic instance string. */
    public String toString() {
        return String.format(
                "Harmonic sum (%d) from left to right is %.30f%n"
                        + "Harmonic sum (%1$d) from right to left is %.30f%n"
                        + "Difference is %.30f%n"
                        + "Which sum is more accurate?",
                bounds,
                sumFrom,
                sumTo,
                sumTo - sumFrom);
    }
}
