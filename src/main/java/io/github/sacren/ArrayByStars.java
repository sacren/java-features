/**
 * ArrayByStars class.
 *
 * <p>Visualize an array by asterisks.
 *
 * <p>Private data:
 * -array:int[]
 *
 * <p>Constructor:
 * +ArrayByStars(array:int[])
 *
 * <p>ArrayByStars methods:
 * +toString():String
 */
public class ArrayByStars {
    /* private instance data */
    private int[] array;

    /** ArrayByStars constructor. */
    public ArrayByStars(int[] array) {
        this.array = array;
    }

    /** ArrayByStars instance printout. */
    public String toString() {
        String s = "";
        for (int row = 0; row < array.length; row++) {
            s += String.format("%d: ", row);
            for (int col = 0; col < array[row]; col++) {
                s += String.format("%c", '*');
            }
            s += String.format("(%d)%n", array[row]);
        }
        return s;
    }
}
