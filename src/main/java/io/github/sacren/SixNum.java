/**
 * SixNum class for sum and product of six integers.
 *
 * <p>Private intace data:
 * -sum:int
 * -product:int
 *
 * <p>Constructor:
 * +SixNum()
 *
 * <p>Public methods:
 * +set():void
 * +toString():String
 */
import java.util.Arrays;

public class SixNum {
    /* private static data */
    private static final int[] LIST = {11, 22, 33, 44, 55, 66};

    /* private instance data */
    private int sum;
    private int product;

    /** SixNum constructor. */
    public SixNum() {
        set();
    }

    /** SixNum setter for sum and product. */
    public void set() {
        sum = 0;
        product = 1;
        for (int i : LIST) {
            sum += i;
            product *= i;
        }
    }

    /** SixNum string method. */
    public String toString() {
        return String.format(
                          "List:    %s%n%n"
                        + "Sum:     %d%n"
                        + "Product: %d",
                Arrays.toString(LIST),
                sum,
                product);
    }
}
