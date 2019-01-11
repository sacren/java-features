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
    public static void main(String[] args) {
        getHarmonicSum();
    }

    private static void getHarmonicSum() {
        final int upperBound = 50000;
        final int lowerBound = 1;
        double sumLeftToRight = 1;
        double sumRightToLeft = 0;

        for (int i = lowerBound + 1; i <= upperBound; i++) {
            sumLeftToRight += (double) lowerBound / i;
        }

        for (int i = upperBound; i > lowerBound; i--) {
            sumRightToLeft += (double) lowerBound / i;
        }

        sumRightToLeft += 1;
        System.out.printf(
                "Harmonic sum (%d) from left to right is %.30f%n"
                        + "Harmonic sum (%1$d) from right to left is %.30f%n"
                        + "Difference is %.30f%n"
                        + "Which sum is more accurate?%n",
                upperBound, sumLeftToRight, sumRightToLeft, sumRightToLeft - sumLeftToRight);
    }
}
