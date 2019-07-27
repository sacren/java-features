/**
 * CopyArray class.
 *
 * <p>Private instance data:
 * -origin:int[]
 *
 * <p>Constructer:
 * +CopyArray(origin:int[])
 *
 * <p>Public methods:
 * +getCopy():int[]
 * +toString():String
 */
import java.util.Arrays;

public class CopyArray {
    /* private instance data */
    private int[] origin;

    /** CopyArray constructer. */
    public CopyArray(int[] origin) {
        this.origin = origin;
    }

    /** CopyArray getter for a copy of integer array. */
    public int[] getCopy() {
        return Arrays.copyOf(origin, origin.length);
    }

    /** CopyArray instance printout. */
    public String toString() {
        return String.format(
                "Origin: %s%n"
                        + "Copy:   %s",
                Arrays.toString(origin),
                Arrays.toString(getCopy()));
    }
}
