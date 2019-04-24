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
 * -bounds:int
 *
 * <p>Constructor:
 * +Harmonic(bounds:int)
 *
 * <p>Public methods:
 * +sumFrom():double
 * +sumTo():double
 * +toString():String
 */
public class Harmonic {
    /* private data */
    private int bounds;

    /** Harmonic custom constructor. */
    public Harmonic(int bounds) {
        this.bounds = bounds;
    }

    /** Harmonic method for the sum of the series from 1. */
    public double sumFrom() {
        double sum = 0;
        for (int i = 0; i < bounds; i++) {
            sum += (double) 1 / (i + 1);
        }
        return sum;
    }

    /** Harmonic method for the sum of the series to 1. */
    public double sumTo() {
        double sum = 0;
        for (int i = 0; i < bounds; i++) {
            sum += (double) 1 / (bounds - i);
        }
        return sum;
    }

    /** Harmonic instance string. */
    public String toString() {
        return String.format(
                "Harmonic sum (%d) from left to right is %.30f%n"
                        + "Harmonic sum (%1$d) from right to left is %.30f%n"
                        + "Difference is %.30f%n"
                        + "Which sum is more accurate?",
                bounds,
                sumFrom(),
                sumTo(),
                sumTo() - sumFrom());
    }
}
