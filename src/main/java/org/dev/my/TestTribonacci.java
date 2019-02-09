/**
 * Print the first 20 Tribonacci numbers.
 *
 * <p>T(n) = T(n–1) + T(n–2) + T(n-3), T(1) = T(2) = 1 and T(3) = 2
 */
public class TestTribonacci {
    public static void main(String[] args) {
        printTribonacci20();
    }

    private static void printTribonacci20() {
        int upperBound = 20;
        int lowerBound = 1;
        int prev1 = 2;
        int prev2 = 1;
        int prev3 = 1;
        int t;

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i == 1 || i == 2) {
                System.out.print(1 + " ");
                continue;
            }

            if (i == 3) {
                System.out.print(2 + " ");
                continue;
            }

            if (i == 20) {
                t = prev1 + prev2 + prev3;
                System.out.println(t);
                continue;
            }

            t = prev1 + prev2 + prev3;
            prev3 = prev2;
            prev2 = prev1;
            prev1 = t;
            System.out.print(t + " ");
        }
    }
}
