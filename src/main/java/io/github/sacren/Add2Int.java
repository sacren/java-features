/**
 * Add2Int class.
 *
 * <p>Private data:
 * -n1:int
 * -n2:int
 *
 * <p>Constructor:
 * +Add2Int(n1:int, n2:int)
 *
 * <p>Public methods:
 * +toString():String
 */
public class Add2Int {
    /* private instance data */
    private int n1;
    private int n2;

    /** Add2int custom constructor. */
    public Add2Int(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    /** Add2Int instance printout. */
    public String toString() {
        return String.format(
                "%d + %d = %d",
                n1, n2, n1 + n2);
    }
}
