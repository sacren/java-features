/**
 * OddEven class.
 *
 * <p>Private instance data:
 * -num:int
 *
 * <p>Constructor:
 * +OddEven(num:int)
 *
 * <p>Public methods:
 * +toString():String
 */
public class OddEven {
    /* private instance data */
    private int num;

    /** OddEven constructor. */
    public OddEven(int num) {
        this.num = num;
    }

    /** OddEven string method. */
    public String toString() {
        return String.format(
                "%d is %s",
                num,
                num % 2 == 0 ? "even" : "odd");
    }
}
