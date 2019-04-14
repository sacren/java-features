/**
 * OddEven class.
 *
 * <p>Private instance data:
 * -number:int
 * -oddEven:String
 *
 * <p>Constructor:
 * +OddEven(number:int)
 *
 * <p>Public methods:
 * +toString():String
 */
public class OddEven {
    /* private instance data */
    private int number;
    private String oddEven;

    /** OddEven constructor. */
    public OddEven(int number) {
        this.number = number;
        oddEven = number % 2 == 0 ? "even" : "odd";
    }

    /** OddEven instance printout. */
    public String toString() {
        return String.format(
                "%d is %s",
                number, oddEven);
    }
}
