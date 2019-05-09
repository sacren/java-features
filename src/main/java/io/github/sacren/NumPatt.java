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
        String s = "";
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            for (int col = FIRST_COUNT; col <= row; col++) {
                if (col == row) {
                    s += String.format("%3d%n", col);
                    break;
                }
                s += String.format("%3d", col);
            }
        }
        return s;
    }

    /** NumPatt getter for top-right pattern. */
    public String getTopRight() {
        String s = "";
        int width;
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            width = SIZE - row + 1;
            for (int col = FIRST_COUNT; col < row; col++) {
                s += String.format("%3c", ' ');
            }
            for (int col = FIRST_COUNT; col <= width; col++) {
                if (col == width) {
                    s += String.format("%3d%n", col);
                    break;
                }
                s += String.format("%3d", col);
            }
        }
        return s;
    }

    /** NumPatt getter for bottom-right pattern. */
    public String getBotRight() {
        String s = "";
        int width;
        int number;
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            width = SIZE - row + 1;
            for (int col = FIRST_COUNT; col < width; col++) {
                s += String.format("%3c", ' ');
            }
            for (int col = FIRST_COUNT; col <= row; col++) {
                number = row - col + 1;
                if (col == row) {
                    s += String.format("%3d%n", number);
                    break;
                }
                s += String.format("%3d", number);
            }
        }
        return s;
    }

    /** NumPatt getter for top-left pattern. */
    public String getTopLeft() {
        String s = "";
        int sentinel;
        int number;
        for (int row = FIRST_COUNT; row <= SIZE; row++) {
            sentinel = SIZE - row + 1;
            for (int col = FIRST_COUNT; col <= SIZE; col++) {
                number = sentinel - col + 1;
                if (col == sentinel) {
                    s += String.format("%3d%n", number);
                    break;
                }
                s += String.format("%3d", number);
            }
        }
        return s;
    }

    /** NumPatt getter for centered ID. */
    public String getId(char id) {
        String s = String.format("(%c)%n", id);
        for (int i = 0; i < SIZE / 2; i++) {
            s = String.format("%3c", ' ') + s;
        }
        return s;
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
