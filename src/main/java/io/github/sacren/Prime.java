/**
 * Prime class for a list of prime numbers.
 *
 * <p>Private instance data:
 * -num:int
 * -count:int
 * -list:int[]
 *
 * <p>Constructor:
 * +Prime(num:int)
 *
 * <p>Public methods:
 * +setNum(num:int):void
 * +isPrime(num:int):boolean
 * +setCount():void
 * +setList():void
 * +toString():String
 */
import java.util.Arrays;

public class Prime {
    /* private static data */
    private static final int MAX_NUM = 10000;

    /* private instance data */
    private int num;
    private int count;
    private int[] list;

    /** Prime constructor. */
    public Prime(int num) {
        setNum(num);
        setCount();
        setList();
    }

    /** Prime setter for the range. */
    public void setNum(int num) {
        if (num < 0 || num > MAX_NUM) {
            throw new IllegalArgumentException(
                    String.format("%d is out of range!", num));
        }
        this.num = num;
    }

    /** Prime getter if the number is prime. */
    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) { /* exclude divisor of 1 and num */
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /** Prime setter for how many prime numbers. */
    public void setCount() {
        count = 0; /* for 0 and 1 */
        if (num > 1) {
            count = 1; /* for 2 and above */
        }
        for (int i = 3; i <= num; i += 2) { /* from 3 and odd numbers */
            if (isPrime(i)) {
                count++;
            }
        }
        list = new int[count];
    }

    /** Prime setter for the list of prime numbers. */
    public void setList() {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                list[count++] = i;
            }
        }
    }

    /** Prime getter if it is the product of prime factors. */
    public boolean getFactor() {
        int product = 1;
        for (int prime : list) {
            if (num % prime == 0) {
                product *= prime;
            }
        }
        if (isPrime(num)) {
            product /= num;
        }
        return product == num;
    }

    /** Prime string method. */
    public String toString() {
        return String.format(
                "%s%n%n"
                        + "%d is%s equal to the product of prime factors of the list%n%n"
                        + "Prime number total:   %d%n"
                        + "Prime number percent: %.2f%%",
                Arrays.toString(list),
                num,
                getFactor() ? "" : " not",
                list.length,
                (double) list.length / num * 100);
    }
}
