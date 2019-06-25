/**
 * Prime class for a list of prime numbers.
 *
 * <p>Private instance data:
 * -num:int
 * -list:int[]
 * -factors:int[]
 *
 * <p>Constructor:
 * +Prime(num:int)
 *
 * <p>Public methods:
 * +setNum(num:int):void
 * +isPrime(num:int):boolean
 * +setCount():void
 * +setList():void
 * +getFactor(int num):boolean
 * +toString():String
 */
import java.util.Arrays;

public class Prime {
    /* private static data */
    private static final int MAX_NUM = 1000000;

    /* private instance data */
    private int num;
    private int[] list;
    private int[] factors;

    /** Prime constructor. */
    public Prime(int num) {
        setNum(num);
        setCount();
        setList();
        setFaCount();
        setFactors();
    }

    /** Prime setter for the range. */
    public void setNum(int num) {
        if (num < 0 || num > MAX_NUM) {
            throw new IllegalArgumentException(
                    String.format("%d is out of range!", num));
        }
        this.num = num;
    }

    /** Prime getter for the instance number. */
    public int getNum() {
        return num;
    }

    /** Prime getter if the number is prime. */
    private boolean isPrime(int num) {
        /* 6k ± 1 optimization */
        if (num <= 3) {
            return num > 1;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    /** Prime setter for how many prime numbers. */
    public void setCount() {
        int count = 0; /* for 0 and 1 */
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

    /** Prime getter for the list of prime numbers. */
    public int[] getList() {
        return list;
    }

    /** Prime setter for how many factors. */
    public void setFaCount() {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (getFactor(i)) {
                count++;
            }
        }
        factors = new int[count];
    }

    /** Prime setter for the list of prime factors. */
    public void setFactors() {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (getFactor(i)) {
                factors[count++] = i;
            }
        }
    }

    /** Prime getter if it is the product of prime factors. */
    public boolean getFactor(int num) {
        int product = 1;
        for (int prime : list) {
            if (num % prime == 0) {
                product *= prime;
            }
        }
        if (isPrime(num) || num == 1) {
            return false;
        }
        return product == num;
    }

    /** Prime string method. */
    public String toString() {
        return String.format(
                "%s%n%n"
                        + "=== Prime factors ===%n%n%s%n%n"
                        + "Prime number total:   %d%n"
                        + "Prime number percent: %.2f%%",
                Arrays.toString(list),
                Arrays.toString(factors),
                list.length,
                (double) list.length / num * 100);
    }
}
