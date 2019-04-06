/**
 * HillPat class for various hill patterns.
 *
 * <p>Private data:
 * -size:int
 * -patA:String
 * -patB:String
 * -patC:String
 * -patD:String
 *
 * <p>Constructor:
 * +HillPat(size:int)
 *
 * <p>Public method:
 * +patA():void
 * +patB():void
 * +patC():void
 * +patD():void
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
    private String patA;
    private String patB;
    private String patC;
    private String patD;

    /** HillPat constructor. */
    public HillPat(int size) {
        this.size = size;
        checkSize();
        patA();
        patB();
        patC();
        patD();
    }

    /** HillPat method for pattern size validation. */
    public void checkSize() {
        if (size < 3) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", size));
        }
    }

    /** HillPat method for pattern A. */
    public void patA() {
        patA = "";
        int width;
        for (int row = 1; row <= size; row++) {
            width = row * 2 - 1;
            for (int col = 1; col <= size - row; col++) {
                patA += "  ";
            }
            for (int col = 1; col <= width; col++) {
                if (col == width) {
                    patA += String.format("#%n");
                    break;
                }
                patA += "# ";
            }
        }
    }

    /** HillPat method for pattern B. */
    public void patB() {
        patB = "";
        int width;
        for (int row = 1; row <= size; row++) {
            width = (size - row) * 2 + 1;
            for (int col = 1; col < row; col++) {
                patB += "  ";
            }
            for (int col = 1; col <= width; col++) {
                if (col == width) {
                    patB += String.format("#%n");
                    break;
                }
                patB += "# ";
            }
        }
    }

    /** HillPat method for pattern C. */
    public void patC() {
        patC = patA; /* hill pattern for the top half */
        int width;
        /* reverse hill pattern for the bottom half */
        for (int row = 1; row <= size - 1; row++) {
            width = (size - 1 - row) * 2 + 1;
            /* offset for the bottom half */
            patC += "  ";
            for (int col = 1; col < row; col++) {
                patC += "  ";
            }
            for (int col = 1; col <= width; col++) {
                if (col == width) {
                    patC += String.format("#%n");
                    break;
                }
                patC += "# ";
            }
        }
    }

    /** HillPat method for pattern D. */
    public void patD() {
        patD = "";
        int sideTriangle;
        int midTriangle;

        for (int row = 1; row <= size; row++) {
            sideTriangle = size - row + 1;
            midTriangle = (row - 1) * 2 - 1;
            for (int col = 1; col <= sideTriangle; col++) {
                patD += "# ";
            }
            for (int col = 1; col <= midTriangle; col++) {
                patD += "  ";
            }
            for (int col = 1; col <= sideTriangle; col++) {
                if (row == 1 && col == 1) {
                    continue;
                }
                if (col == sideTriangle) {
                    patD += String.format("#%n");
                    break;
                }
                patD += "# ";
            }
        }

        for (int row = 1 + 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                patD += "# ";
            }
            for (int col = 1; col <= (size - row) * 2 - 1; col++) {
                patD += "  ";
            }
            for (int col = 1; col <= row; col++) {
                if (row == size && col == 1) {
                    continue;
                }
                if (col == row) {
                    patD += String.format("#%n");
                    break;
                }
                patD += "# ";
            }
        }
    }

    /** HillPat instance printout. */
    public String toString() {
        return String.format(
                "%s%s%n%n"
                        + "%s%s%n%n"
                        + "%s%s%n%n"
                        + "%s%s",
                patA, addId('A'),
                patB, addId('B'),
                patC, addId('C'),
                patD, addId('D'));
    }

    /* helper for pattern ID */
    private String addId(char id) {
        String s = "";
        for (int col = 1; col < size; col++) {
            if (col == size - 1) {
                s += String.format("%c(%c)", ' ', id);
                break;
            }
            s += "  ";
        }
        return s;
    }
}
