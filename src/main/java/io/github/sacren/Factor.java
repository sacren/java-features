/**
 * Factor class for a list of prime factors.
 *
 * <p>Private instance data:
 * -list:int[]
 * -prime:Prime
 *
 * <p>Constructor:
 * +Factor(num:int)
 *
 * <p>Public methods:
 * +setCount():void
 * +setList():void
 * +getFactor(int num):boolean
 * +toString():String
 */
import java.util.Arrays;

public class Factor {
    /* private instance data */
    private int[] list;
    private Prime prime;

    /** Factor constructor. */
    public Factor(int num) {
        prime = new Prime(num);
        setCount();
        setList();
    }

    /** Factor setter for how many factors. */
    public void setCount() {
        int count = 0;
        for (int i = 1; i <= prime.getNum(); i++) {
            if (getFactor(i)) {
                count++;
            }
        }
        list = new int[count];
    }

    /** Factor setter for the list of prime factors. */
    public void setList() {
        int count = 0;
        for (int i = 2; i <= prime.getNum(); i++) {
            if (getFactor(i)) {
                list[count++] = i;
            }
        }
    }

    /** Factor getter if it is the product of prime factors. */
    public boolean getFactor(int num) {
        int product = 1;
        for (int n : prime.getList()) {
            if (num % n == 0) {
                product *= n;
            }
        }
        if (prime.isPrime(num) || num == 1) {
            return false;
        }
        return product == num;
    }

    /** Factor string method. */
    public String toString() {
        return String.format(
                "%s%n%n"
                        + "Factor total:   %d%n"
                        + "Factor percent: %.2f%%",
                Arrays.toString(list),
                list.length,
                (double) list.length / prime.getNum() * 100);
    }
}
