/**
 * Compute the value of π using the serial expansion.
 *
 * <p>π = 4 × (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
 */
public class ComputePi {
    /** Display the value of π. */
    public static void main(String[] args) {
        final double pi = getPi();
        System.out.printf(
                "π = %.15f%n"
                        + "π of Math.PI = %.15f%n"
                        + "Percent of Math.PI = %.15f%n",
                pi, Math.PI, pi / Math.PI * 100);
    }

    private static double getPi() {
        final int upperBound = 999999999;
        final int lowerBound = 3;
        double sum = 1;
        for (int i = lowerBound; i <= upperBound; i += 2) {
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
