/**
 * HourGlass class for the pattern of hourglass.
 *
 * <p>Private instance data:
 * -height:int
 * -width:int
 *
 * <p>Constructor:
 * +HourGlass()
 *
 * <p>Public methods:
 * +getPattern():String
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

    /** HourGlass getter for hourglass pattern. */
    public String getPattern() {
        final int rowColAlignment = (height - width) / 2;
        final int firstCount = 1;
        boolean crossed = false;
        StringBuffer sb = new StringBuffer();
        for (int row = firstCount; row <= height; row++) {
            for (int col = firstCount; col <= width; col++) {
                if (row % height < 2) {
                    if (col == width) {
                        sb.append(String.format("#%n"));
                        break;
                    }
                    sb.append("# ");
                    continue;
                }
                if (row % height <= rowColAlignment || row % height >= height - rowColAlignment) {
                    if (col == width) {
                        sb.append(String.format("#%n"));
                        break;
                    }
                    if (col == firstCount) {
                        sb.append("# ");
                        continue;
                    }
                }
                /* height / 2 + 1 for both odd and even numbers. */
                if (height / 2 + 1 == row) {
                    crossed = true;
                }
                if (col == row - rowColAlignment) {
                    if (crossed) {
                        sb.append(String.format("#%n"));
                        break;
                    }
                    sb.append("# ");
                    continue;
                }
                if (col == height - row + 1 - rowColAlignment) {
                    if (crossed) {
                        sb.append("# ");
                        continue;
                    }
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("  ");
            }
        }
        return sb.toString();
    }

    /** HourGlass string method. */
    public String toString() {
        return getPattern();
    }
}
