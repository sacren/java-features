/**
 * HourGlass class for the pattern of hourglass.
 *
 * <p>Private data:
 * -height:int
 * -width:int
 *
 * <p>Constructor:
 * +HourGlass()
 *
 * <p>Public methods:
 * +pattern():String
 * +toString():String
 *
 * <p># # # # # # #
 *    #           #
 *    #           #
 *      #       #
 *        #   #
 *          #
 *        #   #
 *      #       #
 *    #           #
 *    #           #
 *    # # # # # # #
 */
public class HourGlass {
    /* private static data */
    private static final int HEIGHT = 11;
    private static final int WIDTH = 7;

    /* private instance data */
    private int height;
    private int width;

    /** HourGlass constructor. */
    public HourGlass() {
        height = HEIGHT;
        width = WIDTH;
    }

    /** HourGlass method for hourglass pattern. */
    public String pattern() {
        final int rowColAlignment = (height - width) / 2;
        final int firstCount = 1;
        boolean crossed = false;
        String s = "";

        for (int row = firstCount; row <= height; row++) {
            for (int col = firstCount; col <= width; col++) {
                if (row % height < 2) {
                    if (col == width) {
                        s += String.format("#%n");
                        break;
                    }
                    s += String.format("# ");
                    continue;
                }
                if (row % height <= rowColAlignment || row % height >= height - rowColAlignment) {
                    if (col == width) {
                        s += String.format("#%n");
                        break;
                    }
                    if (col == firstCount) {
                        s += String.format("# ");
                        continue;
                    }
                }
                /* height / 2 + 1 for both odd and even numbers. */
                if (height / 2 + 1 == row) {
                    crossed = true;
                }
                if (col == row - rowColAlignment) {
                    if (crossed) {
                        s += String.format("#%n");
                        break;
                    }
                    s += String.format("# ");
                    continue;
                }
                if (col == height - row + 1 - rowColAlignment) {
                    if (crossed) {
                        s += String.format("# ");
                        continue;
                    }
                    s += String.format("#%n");
                    break;
                }
                s += String.format("  ");
            }
        }
        return s;
    }

    /** HourGlass instance in console. */
    public String toString() {
        return String.format("%s", pattern());
    }
}
