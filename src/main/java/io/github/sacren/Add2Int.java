/**
 * Add2Int class.
 *
 * <p>Private data:
 * -num1:int
 * -num2:int
 *
 * <p>Constructor:
 * +Add2Int(num1:int, num2:int)
 *
 * <p>Public methods:
 * +toString():String
 */
public class Add2Int {
    /* private instance data */
    private int num1;
    private int num2;

    /** Add2int custom constructor. */
    public Add2Int(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /** Add2Int instance printout. */
    public String toString() {
        return String.format(
                "%d + %d = %d",
                num1, num2, num1 + num2);
    }
}
