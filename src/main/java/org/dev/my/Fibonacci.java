/**
 * Print the first 20 Fibonacci numbers and the average.
 *
 * <p>F(n) = F(n–1) + F(n–2) and F(1) = F(2) = 1
 */
public class Fibonacci {
    public static void main(String[] args) {
        printFib20AndAverage();
    }

    private static void printFib20AndAverage() {
        int upperBound = 20;
        int lowerBound = 1;
        int prev1 = 1;
        int prev2 = 1;
        int sum = 2;
        double average;
        int f;

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i == 1 || i == 2) {
                System.out.print(1 + " ");
                continue;
            }

            if (i == 20) {
                f = prev1 + prev2;
                sum += f;
                System.out.println(f);
                continue;
            }

            f = prev1 + prev2;
            sum += f;
            prev2 = prev1;
            prev1 = f;
            System.out.print(f + " ");
        }

        average = (double) sum / 20;
        System.out.println("The average is " + average);
    }
}
