/**
 * Fibonacci class.
 *
 * <p>The first 20 Fibonacci numbers and the average.
 *
 * <p>F(n) = F(n–1) + F(n–2) and F(1) = F(2) = 1
 *
 * <p>Private instance data:
 * -fibo:int[]
 *
 * <p>Constructor:
 * +Fibonacci()
 *
 * <p>Public methods:
 * +getAverage():double
 * +toString():String
 */
import java.util.Arrays;

public class Fibonacci {
    /* private instance data */
    private int[] fibo;

    /* instance initializer for first 20 fibonacci numbers */
    {
        fibo = new int[20];
        fibo[0] = 1;
        fibo[1] = 1;
        int i = 0;
        for (int num : fibo) {
            if (num == 0) {
                fibo[i] = fibo[i - 2] + fibo[i - 1];
            }
            i++;
        }
    }

    /** Fibonacci constructor. */
    public Fibonacci() {
    }

    /** Fibonacci getter for average. */
    public double getAverage() {
        double sum = 0;
        for (int num : fibo) {
            sum += num;
        }
        return sum / fibo.length;
    }

    /** Fibonacci string method. */
    public String toString() {
        return String.format(
                "Fibonacci: %s%n"
                        + "Average:   %.2f",
                Arrays.toString(fibo),
                getAverage());
    }
}
