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
 * +init():void
 * +toString():String
 */
import java.util.Arrays;

public class Fibonacci {
    /* private instance data */
    private int[] fibo;
    private double average;

    /** Fibonacci constructor. */
    public Fibonacci() {
        init();
    }

    /** Fibonacci method to initialize first 20 fibonacci numbers. */
    public void init() {
        fibo = new int[20];
        fibo[0] = 1;
        fibo[1] = 1;
        int i = 0;
        average = 0;
        for (int num : fibo) {
            if (num == 0) {
                fibo[i] = fibo[i - 2] + fibo[i - 1];
            }
            average += fibo[i++];
        }
        average /= 20;
    }

    /** Fibonacci instance printout. */
    public String toString() {
        return String.format(
                "Fibonacci: %s%n"
                        + "Average:   %.2f",
                Arrays.toString(fibo),
                average);
    }
}
