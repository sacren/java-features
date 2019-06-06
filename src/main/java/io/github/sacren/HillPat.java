/**
 * HillPat class for various hill patterns.
 *
 * <p>Private instance data:
 * -size:int
 *
 * <p>Constructor:
 * +HillPat(size:int)
 *
 * <p>Public methods:
 * +patA():String
 * +patB():String
 * +patC():String
 * +patD():String
 * +toString():String
 *
 *             <p>#
 *              # # #
 *            # # # # #
 *          # # # # # # #
 *        # # # # # # # # #
 *      # # # # # # # # # # #
 *    # # # # # # # # # # # # #
 *               (A)
 *
 * <p># # # # # # # # # # # # #
 *      # # # # # # # # # # #
 *        # # # # # # # # #
 *          # # # # # # #
 *            # # # # #
 *              # # #
 *                #
 *               (B)
 *
 *             <p>#
 *              # # #
 *            # # # # #
 *          # # # # # # #
 *        # # # # # # # # #
 *      # # # # # # # # # # #
 *    # # # # # # # # # # # # #
 *      # # # # # # # # # # #
 *        # # # # # # # # #
 *          # # # # # # #
 *            # # # # #
 *              # # #
 *                #
 *               (C)
 *
 * <p># # # # # # # # # # # # #
 *    # # # # # #   # # # # # #
 *    # # # # #       # # # # #
 *    # # # #           # # # #
 *    # # #               # # #
 *    # #                   # #
 *    #                       #
 *    # #                   # #
 *    # # #               # # #
 *    # # # #           # # # #
 *    # # # # #       # # # # #
 *    # # # # # #   # # # # # #
 *    # # # # # # # # # # # # #
 *               (D)
 */
public class HillPat {
    /* private instance data */
    private int size;

    /** HillPat constructor. */
    public HillPat(int size) {
        this.size = size;
        checkSize();
    }

    /** HillPat method for pattern size validation. */
    public void checkSize() {
        if (size < 3) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", size));
        }
    }

    /** HillPat method for pattern A. */
    public String patA() {
        StringBuffer sb = new StringBuffer();
        int width;
        for (int row = 1; row <= size; row++) {
            width = row * 2 - 1;
            for (int col = 1; col <= size - row; col++) {
                sb.append("  ");
            }
            for (int col = 1; col <= width; col++) {
                if (col == width) {
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("# ");
            }
        }
        return sb.toString();
    }

    /** HillPat method for pattern B. */
    public String patB() {
        StringBuffer sb = new StringBuffer();
        int width;
        for (int row = 1; row <= size; row++) {
            width = (size - row) * 2 + 1;
            for (int col = 1; col < row; col++) {
                sb.append("  ");
            }
            for (int col = 1; col <= width; col++) {
                if (col == width) {
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("# ");
            }
        }
        return sb.toString();
    }

    /** HillPat method for pattern C. */
    public String patC() {
        /* hill pattern for the top half */
        StringBuffer sb = new StringBuffer(patA());
        int width;
        /* reverse hill pattern for the bottom half */
        for (int row = 1; row <= size - 1; row++) {
            width = (size - 1 - row) * 2 + 1;
            /* offset for the bottom half */
            sb.append("  ");
            for (int col = 1; col < row; col++) {
                sb.append("  ");
            }
            for (int col = 1; col <= width; col++) {
                if (col == width) {
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("# ");
            }
        }
        return sb.toString();
    }

    /** HillPat method for pattern D. */
    public String patD() {
        StringBuffer sb = new StringBuffer();
        int sideTriangle;
        int midTriangle;

        for (int row = 1; row <= size; row++) {
            sideTriangle = size - row + 1;
            midTriangle = (row - 1) * 2 - 1;
            for (int col = 1; col <= sideTriangle; col++) {
                sb.append("# ");
            }
            for (int col = 1; col <= midTriangle; col++) {
                sb.append("  ");
            }
            for (int col = 1; col <= sideTriangle; col++) {
                if (row == 1 && col == 1) {
                    continue;
                }
                if (col == sideTriangle) {
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("# ");
            }
        }

        for (int row = 1 + 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                sb.append("# ");
            }
            for (int col = 1; col <= (size - row) * 2 - 1; col++) {
                sb.append("  ");
            }
            for (int col = 1; col <= row; col++) {
                if (row == size && col == 1) {
                    continue;
                }
                if (col == row) {
                    sb.append(String.format("#%n"));
                    break;
                }
                sb.append("# ");
            }
        }
        return sb.toString();
    }

    /* helper for pattern ID */
    private String addId(char id) {
        StringBuffer sb = new StringBuffer();
        for (int col = 1; col < size; col++) {
            if (col == size - 1) {
                sb.append(String.format("%c(%c)", ' ', id));
                break;
            }
            sb.append("  ");
        }
        return sb.toString();
    }

    /** HillPat instance printout. */
    public String toString() {
        return String.format(
                "%s%s%n%n"
                        + "%s%s%n%n"
                        + "%s%s%n%n"
                        + "%s%s",
                patA(), addId('A'),
                patB(), addId('B'),
                patC(), addId('C'),
                patD(), addId('D'));
    }
}
