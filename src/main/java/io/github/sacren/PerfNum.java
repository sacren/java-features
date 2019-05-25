/**
 * PerfNum class for a list of perfect numbers up to the bound.
 *
 * <p>Private instance data:
 * -num:int
 * -size:int
 * -defSize:int
 * -list:int[]
 * -nList:int[]
 *
 * <p>Constructor:
 * +PerfNum(num:int)
 *
 * <p>Public methods:
 * +isPerf(num:int):boolean
 * +isDef(num:int):boolean
 * +setSize():void
 * +setList():void
 * +toString():String
 */
import java.util.Arrays;

public class PerfNum {
    /* private instance data */
    private int num;
    private int size;
    private int defSize;
    private int[] list;
    private int[] nList;

    /** PerfNum constructor. */
    public PerfNum(int num) {
        setNum(num);
        setSize();
        setList();
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
    public boolean isPerf(int num) {
        int sum = 0;
        /* proper divisor doesn't go beyond the median of the number. */
        for (int i = 1; i <= num >> 1; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    /** PerfNum getter if the number is deficient. */
    public boolean isDef(int num) {
        int sum = 0;
        /* proper divisor doesn't go beyond the median of the number. */
        for (int i = 1; i <= num >> 1; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }

    /** PerfNum setter for perfect number count. */
    public void setSize() {
        size = 0;
        defSize = 0;
        for (int i = 1; i <= num; i++) {
            if (isPerf(i)) {
                size++;
                continue;
            }
            if (isDef(i)) {
                defSize++;
            }
        }
    }

    /** PerfNum setter for perfect number and neither array. */
    public void setList() {
        list = new int[size];
        nList = new int[num - size - defSize];
        int s1 = 0;
        int s2 = 0;
        for (int i = 1; i <= num; i++) {
            if (isPerf(i)) {
                list[s1++] = i;
                continue;
            }
            if (isDef(i)) {
                continue;
            }
            nList[s2++] = i;
        }
    }

    /** PerfNum string method. */
    public String toString() {
        return String.format(
                "List of perfect numbers:%n%s%n"
                        + "Perfect number count: %d (%.2f%%)%n%n"
                        + "List of numbers neither perfect nor deficient:%n%s%n"
                        + "Neither perfect nor deficient count: %d (%.2f%%)",
                Arrays.toString(list),
                size, (double) size / num * 100,
                Arrays.toString(nList),
                nList.length, (double) nList.length / num * 100);
    }
}
