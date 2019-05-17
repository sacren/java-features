/**
 * Prime class for a list of prime numbers.
 *
 * <p>Private instance data:
 * -num:int
 *
 * <p>Constructor:
 * +Prime(num:int)
 *
 * <p>Public methods:
 * +setNum(num:int):void
 * +isPrime(num:int):boolean
 * +getCount():int
 * +getList():int[]
 * +toString():String
 */
import java.util.Arrays;

public class Prime {
    /* private instance data */
    private int num;

    /** Prime constructor. */
    public Prime(int num) {
        setNum(num);
    }

    /** Prime setter for the range. */
    public void setNum(int num) {
        if (num < 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", num));
        }
        this.num = num;
    }

    /** Prime getter if the number is prime. */
    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) { /* exclude divisor of 1 and number */
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /** Prime getter for how many prime numbers. */
    public int getCount() {
        int count = 0;
        for (int i = 2; i <= num; i++) { /* prime number starts from 2 */
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    /** Prime getter for the list of prime numbers. */
    public int[] getList() {
        int[] list = new int[getCount()];
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                list[count++] = i;
            }
        }
        return list;
    }

    /** Prime string method. */
    public String toString() {
        return Arrays.toString(getList());
    }
}
