/**
 * Compute the value of π using the serial expansion.
 *
 * <p>π = 4 × (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
 */
public class TestComputePi {
    /** Display the value of π with comparison to Math API. */
    public static void main(String[] args) {
        final double pi = getPi();
        System.out.printf(
                "π = %.15f%n"
                        + "π of Math.PI = %.15f%n"
                        + "Percent of Math.PI = %.15f%n",
                pi, Math.PI, pi / Math.PI * 100);
    }

    private static double getPi() {
        /* Max of upperBound is Integer.MAX_VALUE. */
        final int upperBound = Integer.MAX_VALUE - 1;
        final int lowerBound = 3;
        double sum = 1;
        for (int i = lowerBound; i < upperBound; i += 2) {
            if (i % 4 == 1) {
                sum += (double) 1 / i;
                continue;
            }
            if (i % 4 == 3) {
                sum -= (double) 1 / i;
                continue;
            }
            System.out.println("The machine runs out of control!");
        }
        return 4 * sum;
    }
}
