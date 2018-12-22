/**
 * Print the first 20 Fibonacci numbers and the average.
 *
 * <p>F(n) = F(n–1) + F(n–2) and F(1) = F(2) = 1
 */
public class Fibonacci {
    /** Show Fibonacci series of the first 20. */
    public static void main(String[] args) {
        String series = "";
        int sum = 0;
        for (int f: getFibonacciArray()) {
            sum += f;
            series += String.format("%d ", f);
        }
        System.out.printf(
                "Fibonacci series: %s%n"
                        + "Average: %.2f%n",
                series, (double) sum / 20);
    }

    private static int[] getFibonacciArray() {
        final int upperBound = 20;
        final int lowerBound = 2;
        int[] fibonacciArray = new int[upperBound];
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;
        int preNumber = 1;
        int prepreNumber = 1;
        for (int i = lowerBound; i < upperBound; i++) {
            fibonacciArray[i] = preNumber + prepreNumber;
            prepreNumber = preNumber;
            preNumber = fibonacciArray[i];
        }
        return fibonacciArray;
    }
}
