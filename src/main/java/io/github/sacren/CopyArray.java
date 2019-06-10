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

    /** CopyArray instance printout. */
    public String toString() {
        return String.format(
                "Origin: %s%n"
                        + "Copy:   %s",
                Arrays.toString(origin),
                Arrays.toString(Arrays.copyOf(origin, origin.length)));
    }
}
