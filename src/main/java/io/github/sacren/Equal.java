/**
 * Equal class shows if two integer arrays are equal.
 *
 * <p>Private instance data:
 * -array1:int[]
 * -array2:int[]
 *
 * <p>Equal constructor:
 * +Equal(array1:int[], array2:int[])
 *
 * <p>Public methods:
 * +setArray():void
 * +toString():String
 */
import java.util.Arrays;

public class Equal {
    /* private instance data */
    private int[] array1;
    private int[] array2;

    /** Equal constructor. */
    public Equal(int[] array1, int[] array2) {
        this.array1 = new int[array1.length];
        this.array2 = new int[array2.length];
        setArray(array1, this.array1);
        setArray(array2, this.array2);
    }

    /** Equal setter for both instance arrays. */
    public void setArray(int[] from, int[] to) {
        int i = 0;
        for (int n : from) {
            to[i++] = n;
        }
    }

    /** Equal instance formatted string. */
    public String toString() {
        return String.format(
                "%s %s %s",
                Arrays.toString(array1),
                Arrays.equals(array1, array2) ? "equals" : "doesn't equal",
                Arrays.toString(array2));
    }
}
