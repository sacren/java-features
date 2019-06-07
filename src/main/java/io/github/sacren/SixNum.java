/**
 * SixNum class for sum and product of six integers.
 *
 * <p>Constructor:
 * +SixNum()
 *
 * <p>Public methods:
 * +getSum():int
 * +getProd():int
 * +toString():String
 */
import java.util.Arrays;

public class SixNum {
    /* public static data */
    public static final int[] LIST = {11, 22, 33, 44, 55, 66};

    /* private instance data */
    private int[] nums;

    /** SixNum constructor. */
    public SixNum(int[] nums) {
        this.nums = nums;
    }

    /** SixNum getter for the sum of numbers. */
    public int getSum() {
        int sum = 0;
        for (int i : LIST) {
            sum += i;
        }
        return sum;
    }

    /** SixNum getter for the product of numbers. */
    public int getProd() {
        int product = 1;
        for (int i : LIST) {
            product *= i;
        }
        return product;
    }

    /** SixNum string method. */
    public String toString() {
        return String.format(
                "List:    %s%n%n"
                        + "Sum:     %d%n"
                        + "Product: %d",
                Arrays.toString(LIST),
                getSum(),
                getProd());
    }
}
