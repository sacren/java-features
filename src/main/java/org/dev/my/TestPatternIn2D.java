/**
 * Various 2-D patterns through nested loop.
 *
 * <p>#
 *    # #
 *    # # #
 *    # # # #
 *    # # # # #
 *    # # # # # #
 *    # # # # # # #
 *    # # # # # # # #
 *          (a)
 *
 * <p># # # # # # # #
 *    # # # # # # #
 *    # # # # # #
 *    # # # # #
 *    # # # #
 *    # # #
 *    # #
 *    #
 *          (b)
 *
 * <p># # # # # # # #
 *      # # # # # # #
 *        # # # # # #
 *          # # # # #
 *            # # # #
 *              # # #
 *                # #
 *                  #
 *          (c)
 *
 *               <p>#
 *                # #
 *              # # #
 *            # # # #
 *          # # # # #
 *        # # # # # #
 *      # # # # # # #
 *    # # # # # # # #
 *          (d)
 *
 * <p># # # # # # #
 *    #           #
 *    #           #
 *    #           #
 *    #           #
 *    #           #
 *    # # # # # # #
 *         (e)
 *
 * <p># # # # # # #
 *      #
 *        #
 *          #
 *            #
 *              #
 *    # # # # # # #
 *         (f)
 *
 * <p># # # # # # #
 *              #
 *            #
 *          #
 *        #
 *      #
 *    # # # # # # #
 *         (g)
 *
 * <p># # # # # # #
 *      #       #
 *        #   #
 *          #
 *        #   #
 *      #       #
 *    # # # # # # #
 *         (h)
 *
 * <p># # # # # # #
 *    # #       # #
 *    #   #   #   #
 *    #     #     #
 *    #   #   #   #
 *    # #       # #
 *    # # # # # # #
 *         (i)
 *
 *     <p># # # # # # # #
 *       # # # # # # # #
 *      # # # # # # # #
 *     # # # # # # # #
 *    # # # # # # # #
 *   # # # # # # # #
 *  # # # # # # # #
 * # # # # # # # #
 *       (j)
 *
 * <p># # # # # # # #
 *    # # # # # # # #
 *    # # # # # # # #
 *    # # # # # # # #
 *    # # # # # # # #
 *    # # # # # # # #
 *    # # # # # # # #
 *    # # # # # # # #
 *          (k)
 *
 * <p># # # # # # #
 *     # # # # # # #
 *    # # # # # # #
 *     # # # # # # #
 *    # # # # # # #
 *     # # # # # # #
 *    # # # # # # #
 *         (l)
 */
public class TestPatternIn2D {
    /** Display various 2-D patterns. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("List of various 2-D patterns.");
        System.out.println();
        System.out.print(triangleBottomLeft());
        System.out.printf("%9s%n%n", "(a)");
        System.out.print(triangleTopLeft());
        System.out.printf("%9s%n%n", "(b)");
        System.out.print(triangleTopRight());
        System.out.printf("%9s%n%n", "(c)");
        System.out.print(triangleBottomRight());
        System.out.printf("%9s%n%n", "(d)");
        System.out.print(emptySquare());
        System.out.printf("%8s%n%n", "(e)");
        System.out.print(mirrorLetterZ());
        System.out.printf("%8s%n%n", "(f)");
        System.out.print(letterZ());
        System.out.printf("%8s%n%n", "(g)");
        System.out.print(hourGlass());
        System.out.printf("%8s%n%n", "(h)");
        System.out.print(hourGlassInBox());
        System.out.printf("%8s%n%n", "(i)");
        System.out.print(parallelogram());
        System.out.printf("%9s%n%n", "(j)");
        System.out.print(solidSquare());
        System.out.printf("%9s%n%n", "(k)");
        System.out.print(checkerBoard());
        System.out.printf("%8s%n", "(l)");
    }

    /* Pattern of square with empty center. */
    private static String emptySquare() {
        final int size = 7;
        final int firstCount = 1;
        String s = "";
        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (row % size > 1 && col % size > 1) {
                    s += String.format("  ");
                    continue;
                }
                if (col == size) {
                    s += String.format("#%n");
                    continue;
                }
                s += String.format("# ");
            }
        }
        return s;
    }

    /* Pattern of triangle with right angle at bottom left. */
    private static String triangleBottomLeft() {
        final int size = 8;
        final int firstCount = 1;
        String s = "";
        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (col == row) {
                    s += String.format("#%n");
                    break;
                }
                s += String.format("# ");
            }
        }
        return s;
    }

    /* Pattern of triangle with right angle at top left. */
    private static String triangleTopLeft() {
        final int size = 8;
        final int firstCount = 1;
        String s = "";
        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (col + row > size) {
                    s += String.format("#%n");
                    break;
                }
                s += String.format("# ");
            }
        }
        return s;
    }

    /* Pattern of triangle with right angle at top right. */
    private static String triangleTopRight() {
        final int size = 8;
        final int firstCount = 1;
        String s = "";
        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (col == size) {
                    s += String.format("#%n");
                    break;
                }
                if (row > col) {
                    s += String.format("  ");
                    continue;
                }
                s += String.format("# ");
            }
        }
        return s;
    }

    /* Pattern of triangle with right angle at bottom right. */
    private static String triangleBottomRight() {
        final int size = 8;
        final int firstCount = 1;
        String s = "";
        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (col == size) {
                    s += String.format("#%n");
                    break;
                }
                if (col + row <= size) {
                    s += String.format("  ");
                    continue;
                }
                s += String.format("# ");
            }
        }
        return s;
    }

    /* Pattern of mirrored letter Z. */
    private static String mirrorLetterZ() {
        final int size = 7;
        final int firstCount = 1;
        String s = "";
        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (row % size < 2 && col != size) {
                    s += String.format("# ");
                    continue;
                }
                if (col == row || col == size) {
                    s += String.format("#%n");
                    break;
                }
                s += String.format("  ");
            }
        }
        return s;
    }

    /* Pattern of letter Z. */
    private static String letterZ() {
        final int size = 7;
        final int firstCount = 1;
        String s = "";
        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (row % size < 2 && col != size) {
                    s += String.format("# ");
                    continue;
                }
                if (col == size - row + 1 || col == size) {
                    s += String.format("#%n");
                    break;
                }
                s += String.format("  ");
            }
        }
        return s;
    }

    /* Pattern of hourglass. */
    private static String hourGlass() {
        final int size = 7;
        final int firstCount = 1;
        boolean crossed = false;
        String s = "";
        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (row % size < 2) {
                    if (col == size) {
                        s += String.format("#%n");
                        break;
                    }
                    s += String.format("# ");
                    continue;
                }
                /* size / 2 + 1 for both odd and even numbers. */
                if (size / 2 + 1 == row) {
                    crossed = true;
                }
                if (col == row) {
                    if (crossed) {
                        s += String.format("#%n");
                        break;
                    }
                    s += String.format("# ");
                    continue;
                }
                if (col == size - row + 1) {
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

    /* Pattern of hourglass inside a box. */
    private static String hourGlassInBox() {
        final int size = 7;
        final int firstCount = 1;
        String s = "";
        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (col == firstCount) {
                    s += String.format("# ");
                    continue;
                }
                if (col == size) {
                    s += String.format("#%n");
                    break;
                }
                if (row % size < 2) {
                    s += String.format("# ");
                    continue;
                }
                if (col == row) {
                    s += String.format("# ");
                    continue;
                }
                if (col == size - row + 1) {
                    s += String.format("# ");
                    continue;
                }
                s += String.format("  ");
            }
        }
        return s;
    }

    /* Pattern of parallelogram. */
    private static String parallelogram() {
        final int size = 8;
        final int firstCount = 1;
        String s = "";
        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (size == col) {
                    s += String.format("#%n");
                    break;
                }
                if (col == firstCount) {
                    for (int spaceCount = 0; spaceCount < size - row; spaceCount++) {
                        s += String.format(" ");
                    }
                }
                s += String.format("# ");
            }
        }
        return s;
    }

    /* Patter of solid square. The simplest pattern employing nested loop. All
     * other patterns are more or less adding extension to it.
     */
    private static String solidSquare() {
        final int size = 8;
        final int first = 1;
        String s = "";
        for (int row = first; row <= size; row++) {
            for (int col = first; col <= size; col++) {
                if (col == size) {
                    s += String.format("#%n");
                    break;
                }
                s += String.format("# ");
            }
        }
        return s;
    }

    /* Pattern of checker board. */
    private static String checkerBoard() {
        final int size = 7;
        final int first = 1;
        String s = "";
        for (int row = first; row <= size; row++) {
            if (row % 2 == 0) {
                s += String.format(" ");
            }
            for (int col = first; col < size; col++) {
                s += String.format("# ");
            }
            s += String.format("#%n");
        }
        return s;
    }
}
