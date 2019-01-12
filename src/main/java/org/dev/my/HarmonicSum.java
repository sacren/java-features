/**
 * Sum of a harmonic series adding from left to right:
 *
 * <p>1 + 1/2 + 1/3 + ... + 1/50000
 *
 * <p>Sum of a harmonic series adding from right to left:
 *
 * <p>1/50000 + 1/49999 + 1/49998 + ... + 1/3 + 1/2 + 1
 *
 * <p>Show the difference.
 */
public class HarmonicSum {
    /** Harmonic sum up to 50,000. */
    public static void main(String[] args) {
        final int upperBound = 50000;
        double sumLeftToRight = 0;
        for (int i = 0; i < upperBound; i++) {
            sumLeftToRight += (double) 1 / (i + 1);
        }

        double sumRightToLeft = 0;
        for (int i = 0; i < upperBound; i++) {
            sumRightToLeft += (double) 1 / (upperBound - i);
        }

        System.out.printf(
                "Harmonic sum (%d) from left to right is %.30f%n"
                        + "Harmonic sum (%1$d) from right to left is %.30f%n"
                        + "Difference is %.30f%n"
                        + "Which sum is more accurate?%n",
                upperBound, sumLeftToRight, sumRightToLeft, sumRightToLeft - sumLeftToRight);
    }
}
