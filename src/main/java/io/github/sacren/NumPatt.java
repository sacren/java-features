/**
 * NumPatt class for a list of numbers in 8 x 8 format.
 *
 * <p>1
 *    1  2
 *    1  2  3
 *    1  2  3  4
 *    1  2  3  4  5
 *    1  2  3  4  5  6
 *    1  2  3  4  5  6  7
 *    1  2  3  4  5  6  7  8
 *              (a)
 *
 * <p>1  2  3  4  5  6  7  8
 *       1  2  3  4  5  6  7
 *          1  2  3  4  5  6
 *             1  2  3  4  5
 *                1  2  3  4
 *                   1  2  3
 *                      1  2
 *                         1
 *              (b)
 *
 *                      <p>1
 *                      2  1
 *                   3  2  1
 *                4  3  2  1
 *             5  4  3  2  1
 *          6  5  4  3  2  1
 *       7  6  5  4  3  2  1
 *    8  7  6  5  4  3  2  1
 *              (c)
 *
 * <p>8  7  6  5  4  3  2  1
 *    7  6  5  4  3  2  1
 *    6  5  4  3  2  1
 *    5  4  3  2  1
 *    4  3  2  1
 *    3  2  1
 *    2  1
 *    1
 *              (d)
 *
 * <p>Public method:
 * +toString():String
 */
public class NumPatt {
    /* private static data */
    private static final int SIZE = 8;
    private static final int FIRST_COUNT = 1;

    /** NumPatt getter for bottom-left pattern. */
    public String getBotLeft() {
        StringBuffer sb = new StringBuffer();
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            for (int col = FIRST_COUNT; col <= row; col++) {
                if (col == row) {
                    sb.append(String.format("%3d%n", col));
                    break;
                }
                sb.append(String.format("%3d", col));
            }
        }
        return sb.toString();
    }

    /** NumPatt getter for top-right pattern. */
    public String getTopRight() {
        StringBuffer sb = new StringBuffer();
        int width;
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            width = SIZE - row + 1;
            for (int col = FIRST_COUNT; col < row; col++) {
                sb.append(String.format("%3c", ' '));
            }
            for (int col = FIRST_COUNT; col <= width; col++) {
                if (col == width) {
                    sb.append(String.format("%3d%n", col));
                    break;
                }
                sb.append(String.format("%3d", col));
            }
        }
        return sb.toString();
    }

    /** NumPatt getter for bottom-right pattern. */
    public String getBotRight() {
        StringBuffer sb = new StringBuffer();
        int width;
        int num;
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            width = SIZE - row + 1;
            for (int col = FIRST_COUNT; col < width; col++) {
                sb.append(String.format("%3c", ' '));
            }
            for (int col = FIRST_COUNT; col <= row; col++) {
                num = row - col + 1;
                if (col == row) {
                    sb.append(String.format("%3d%n", num));
                    break;
                }
                sb.append(String.format("%3d", num));
            }
        }
        return sb.toString();
    }

    /** NumPatt getter for top-left pattern. */
    public String getTopLeft() {
        StringBuffer sb = new StringBuffer();
        int sentinel;
        int num;
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            sentinel = SIZE - row + 1;
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                num = sentinel - col + 1;
                if (col == sentinel) {
                    sb.append(String.format("%3d%n", num));
                    break;
                }
                sb.append(String.format("%3d", num));
            }
        }
        return sb.toString();
    }

    /** NumPatt getter for centered ID. */
    public String getId(char id) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < SIZE / 2; i++) {
            sb.append(String.format("%3c", ' '));
        }
        sb.append(String.format("(%c)%n", id));
        return sb.toString();
    }

    /** NumPatt instance string method. */
    public String toString() {
        return String.format(
                "%s"
                        + "%s%n"
                        + "%s"
                        + "%s%n"
                        + "%s"
                        + "%s%n"
                        + "%s"
                        + "%s",
                getBotLeft(),
                getId('a'),
                getTopRight(),
                getId('b'),
                getBotRight(),
                getId('c'),
                getTopLeft(),
                getId('d'));
    }
}
