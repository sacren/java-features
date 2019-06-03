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

    /** ArrayByStars string method. */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int row = 0; row < array.length; row++) {
            sb.append(row + 1);
            sb.append(": ");
            for (int col = 0; col < array[row]; col++) {
                sb.append('*');
            }
            sb.append(String.format("(%d)%n", array[row]));
        }
        return sb.toString();
    }
}
