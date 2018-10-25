/**
 * Print 2-D patterns using nested loop.
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
 */
public class PrintPattern {
    /** Entry point. */
    public static void main(String[] args) {
        triangleBottomLeft();
        System.out.printf("%9s%n%n", "(a)");
        triangleTopLeft();
        System.out.printf("%9s%n%n", "(b)");
        triangleTopRight();
        System.out.printf("%9s%n%n", "(c)");
        triangleBottomRight();
        System.out.printf("%9s%n%n", "(d)");
        emptySquare();
        System.out.printf("%8s%n%n", "(e)");
        mirrorLetterZ();
        System.out.printf("%8s%n%n", "(f)");
        letterZ();
        System.out.printf("%8s%n%n", "(g)");
        hourGlass();
        System.out.printf("%8s%n%n", "(h)");
        hourGlassInBox();
        System.out.printf("%8s%n%n", "(i)");
        parallelogram();
        System.out.printf("%9s%n%n", "(j)");
    }

    /* Pattern of square with empty enter. */
    private static void emptySquare() {
        final int size = 7;
        final int firstCount = 1;

        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (row % size > 1 && col % size > 1) {
                    System.out.print("  ");
                    continue;
                }

                if (col == size) {
                    System.out.println('#');
                    continue;
                }

                System.out.print("# ");
            }
        }
    }

    /* Pattern of triangle with right angle at bottom left. */
    private static void triangleBottomLeft() {
        final int size = 8;
        final int firstCount = 1;

        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (col == row) {
                    System.out.println("#");
                    break;
                }

                System.out.print("# ");
            }
        }
    }

    /* Pattern of triangle with right angle at top left. */
    private static void triangleTopLeft() {
        final int size = 8;
        final int firstCount = 1;

        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (col + row > size) {
                    System.out.println("#");
                    break;
                }

                System.out.print("# ");
            }
        }
    }

    /* Pattern of triangle with right angle at top right. */
    private static void triangleTopRight() {
        final int size = 8;
        final int firstCount = 1;

        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (col == size) {
                    System.out.println("#");
                    break;
                }

                if (row > col) {
                    System.out.print("  ");
                    continue;
                }

                System.out.print("# ");
            }
        }
    }

    /* Pattern of triangle with right angle at bottom right. */
    private static void triangleBottomRight() {
        final int size = 8;
        final int firstCount = 1;

        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (col == size) {
                    System.out.println("#");
                    break;
                }

                if (col + row <= size) {
                    System.out.print("  ");
                    continue;
                }

                System.out.print("# ");
            }
        }
    }

    /* Pattern of mirrored letter Z. */
    private static void mirrorLetterZ() {
        final int size = 7;
        final int firstCount = 1;

        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (row % size < 2 && col != size) {
                    System.out.print("# ");
                    continue;
                }

                if (col == row || col == size) {
                    System.out.println('#');
                    break;
                }

                System.out.print("  ");
            }
        }
    }

    /* Pattern of letter Z. */
    private static void letterZ() {
        final int size = 7;
        final int firstCount = 1;

        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (row % size < 2 && col != size) {
                    System.out.print("# ");
                    continue;
                }

                if (col == size - row + 1 || col == size) {
                    System.out.println('#');
                    break;
                }

                System.out.print("  ");
            }
        }
    }

    /* Pattern of hourglass. */
    private static void hourGlass() {
        final int size = 7;
        final int firstCount = 1;
        boolean crossed = false;

        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (row % size < 2) {
                    if (col == size) {
                        System.out.println('#');
                        break;
                    }

                    System.out.print("# ");
                    continue;
                }

                /* size / 2 + 1 for both odd and even numbers. */
                if (size / 2 + 1 == row) {
                    crossed = true;
                }

                if (col == row) {
                    if (crossed) {
                        System.out.println('#');
                        break;
                    }

                    System.out.print("# ");
                    continue;
                }

                if (col == size - row + 1) {
                    if (crossed) {
                        System.out.print("# ");
                        continue;
                    }

                    System.out.println('#');
                    break;
                }

                System.out.print("  ");
            }
        }
    }

    /* Pattern of hourglass inside a box. */
    private static void hourGlassInBox() {
        final int size = 7;
        final int firstCount = 1;

        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (col == firstCount) {
                    System.out.print("# ");
                    continue;
                }

                if (col == size) {
                    System.out.println('#');
                    break;
                }

                if (row % size < 2) {
                    System.out.print("# ");
                    continue;
                }

                if (col == row) {
                    System.out.print("# ");
                    continue;
                }

                if (col == size - row + 1) {
                    System.out.print("# ");
                    continue;
                }

                System.out.print("  ");
            }
        }
    }

    /* Pattern of parallelogram. */
    private static void parallelogram() {
        final int size = 8;
        final int firstCount = 1;

        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= size; col++) {
                if (size == col) {
                    System.out.println('#');
                    break;
                }

                if (col == firstCount) {
                    for (int spaceCount = 0; spaceCount < size - row; spaceCount++) {
                        System.out.print(' ');
                    }
                }

                System.out.print("# ");
            }
        }
    }
}
