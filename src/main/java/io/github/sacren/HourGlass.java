/**
 * HourGlass class for the pattern of hourglass.
 *
 * <p>Private data:
 * -height:int
 * -width:int
 * -pattern:String
 *
 * <p>Constructor:
 * +HourGlass()
 *
 * <p>Public methods:
 * +pattern():void
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
    private String pattern;

    /** HourGlass constructor. */
    public HourGlass() {
        height = HEIGHT;
        width = WIDTH;
        pattern();
    }

    /** HourGlass method for hourglass pattern. */
    public void pattern() {
        final int rowColAlignment = (height - width) / 2;
        final int firstCount = 1;
        boolean crossed = false;
        pattern = "";

        for (int row = firstCount; row <= height; row++) {
            for (int col = firstCount; col <= width; col++) {
                if (row % height < 2) {
                    if (col == width) {
                        pattern += String.format("#%n");
                        break;
                    }
                    pattern += String.format("# ");
                    continue;
                }
                if (row % height <= rowColAlignment || row % height >= height - rowColAlignment) {
                    if (col == width) {
                        pattern += String.format("#%n");
                        break;
                    }
                    if (col == firstCount) {
                        pattern += String.format("# ");
                        continue;
                    }
                }
                /* height / 2 + 1 for both odd and even numbers. */
                if (height / 2 + 1 == row) {
                    crossed = true;
                }
                if (col == row - rowColAlignment) {
                    if (crossed) {
                        pattern += String.format("#%n");
                        break;
                    }
                    pattern += String.format("# ");
                    continue;
                }
                if (col == height - row + 1 - rowColAlignment) {
                    if (crossed) {
                        pattern += String.format("# ");
                        continue;
                    }
                    pattern += String.format("#%n");
                    break;
                }
                pattern += String.format("  ");
            }
        }
    }

    /** HourGlass instance in console. */
    public String toString() {
        return pattern;
    }
}
