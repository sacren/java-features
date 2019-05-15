/**
 * PerfNum class for a list of perfect numbers up to the bound.
 *
 * <p>Private instance data:
 * -num:int
 * -perfCount:int
 * -defiCount:int
 * -perf:int[]
 * -neither:int[]
 *
 * <p>Constructor:
 * +PerfNum(num:int)
 *
 * <p>Public methods:
 * +isPerfNum(num:int):boolean
 * +isDefiNum(num:int):boolean
 * +count():void
 * +add():void
 * +toString():String
 */
import java.util.Arrays;

public class PerfNum {
    /* private instance data */
    private int num;
    private int perfCount;
    private int defiCount;
    private int[] perf;
    private int[] neither;

    /** PerfNum constructor. */
    public PerfNum(int num) {
        setNum(num);
        count();
        add();
    }

    /** PerfNum setter for the range. */
    public void setNum(int num) {
        if (num < 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", num));
        }
        this.num = num;
    }

    /** PerfNum getter if the number is perfect. */
    public boolean isPerfNum(int num) {
        int sum = 0;
        /* proper divisor doesn't go beyond the median of the number. */
        for (int i = 1; i <= num >> 1; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return true;
        }
        return false;
    }

    /** PerfNum getter if the number is deficient. */
    public boolean isDefiNum(int num) {
        int sum = 0;
        /* proper divisor doesn't go beyond the median of the number. */
        for (int i = 1; i <= num >> 1; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum < num) {
            return true;
        }
        return false;
    }

    /** PerfNum setter for perfect number count. */
    public void count() {
        perfCount = 0;
        defiCount = 0;
        for (int i = 1; i <= num; i++) {
            if (isPerfNum(i)) {
                perfCount++;
                continue;
            }
            if (isDefiNum(i)) {
                defiCount++;
            }
        }
    }

    /** PerfNum setter for perfect number and neither array. */
    public void add() {
        perf = new int[perfCount];
        neither = new int[num - perfCount - defiCount];
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i <= num; i++) {
            if (isPerfNum(i)) {
                perf[count1++] = i;
                continue;
            }
            if (isDefiNum(i)) {
                continue;
            }
            neither[count2++] = i;
        }
    }

    /** PerfNum string method. */
    public String toString() {
        return String.format(
                "List of perfect numbers:%n%s%n"
                        + "Perfect number count: %d (%.2f%%)%n%n"
                        + "List of numbers neither perfect nor deficient:%n%s%n"
                        + "Neither perfect nor deficient count: %d (%.2f%%)",
                Arrays.toString(perf),
                perfCount, (double) perfCount / num * 100,
                Arrays.toString(neither),
                neither.length, (double) neither.length / num * 100);
    }
}
