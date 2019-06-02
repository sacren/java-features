/**
 * Swap class for the swap of two integers.
 *
 * <p>Private instance data:
 * -num1:int
 * -num2:int
 *
 * <p>Constructor:
 * +Swap(num1:int, num2:int)
 *
 * <p>Public methods:
 * +swap():void
 * +toString():String
 */
public class Swap {
    /* private instance data */
    private int num1;
    private int num2;

    /** Swap constructor. */
    public Swap(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /** Swap method to swap the values. */
    public void swap() {
        int tmp;
        tmp = num1;
        num1 = num2;
        num2 = tmp;
    }

    /** Swap string method. */
    public String toString() {
        return String.format(
                "First number:  %d%n"
                        + "Second number: %d",
                num1, num2);
    }
}
