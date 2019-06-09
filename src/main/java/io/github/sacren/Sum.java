/**
 * Sum class for the odd numbers from 1 to 100 and the average.
 *
 * <p>Sum numbers from 1 to 100 divisible by 7 and the average.
 *
 * <p>Sum of the squares from 1 to 100.
 *
 * <p>Private instance data:
 * -oddSum:int
 * -oddAvg:double
 * -divSum:int
 * -divAvg:double
 * -sqSum:int
 *
 * <p>Public methods:
 * +setSum():void
 * +toString():String
 */
public class Sum {
    /* private instance data */
    private int oddSum;
    private double oddAvg;
    private int divSum;
    private double divAvg;
    private int sqSum;

    /** Sum constructor. */
    public Sum() {
        setSum();
    }

    /** Sum getter for odd numbers from 1 to 100. */
    public void setSum() {
        int count1 = 0;
        int count2 = 0;
        oddSum = 0;
        divSum = 0;
        sqSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                oddSum += i;
                count1++;
            }
            if (i % 7 == 0) {
                divSum += i;
                count2++;
            }
            sqSum += i * i;
        }
        oddAvg = (double) oddSum / count1;
        divAvg = (double) divSum / count2;
    }

    /** Sum string method. */
    public String toString() {
        return String.format(
                "Sum of odd numbers: %d%n"
                        + "Average:            %.2f%n"
                        + "Sum of division:    %d%n"
                        + "Average:            %.2f%n"
                        + "Sum of squares:     %d",
                oddSum,
                oddAvg,
                divSum,
                divAvg,
                sqSum);
    }
}
