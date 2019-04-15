/**
 * CopyArray class.
 *
 * <p>Private instance data:
 * -origin:int[]
 * -dupe:int[]
 *
 * <p>Constructer:
 * +CopyArray(origin:int[])
 *
 * <p>Public methods:
 * +copy()
 * +toString():String
 */
import java.util.Arrays;

public class CopyArray {
    /* private instance data */
    private int[] origin;
    private int[] dupe;

    /** CopyArray constructer. */
    public CopyArray(int[] origin) {
        this.origin = origin;
        copy();
    }

    /** CopyArray method for duplicate array. */
    public void copy() {
        dupe = new int[origin.length];
        int index = 0;
        for (int number : origin) {
            dupe[index++] = number;
        }
    }

    /** CopyArray instance printout. */
    public String toString() {
        return String.format(
                "Origin: %s%n"
                        + "Copy:   %s",
                Arrays.toString(origin),
                Arrays.toString(dupe));
    }
}
