/**
 * ArrayByStars class.
 *
 * <p>Visualize an array by asterisks.
 *
 * <p>Private data:
 * -array:int[]
 * -list:String
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
    private String list;

    /** ArrayByStars constructor. */
    public ArrayByStars(int[] array) {
        this.array = array;
    }

    /** ArrayByStars instance printout. */
    public String toString() {
        list = "";
        for (int row = 0; row < array.length; row++) {
            list += String.format("%d: ", row);
            for (int col = 0; col < array[row]; col++) {
                list += String.format("%c", '*');
            }
            list += String.format("(%d)%n", array[row]);
        }
        return list;
    }
}
