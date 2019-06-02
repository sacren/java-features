/**
 * SymTri class for symmetric triangles.
 *
 * <p>* * * * * * *
 *     *         *
 *      *       *
 *       *     *
 *        *   *
 *         * *
 *          *
 *         (a)
 *
 *       <p>*
 *         * *
 *        *   *
 *       *     *
 *      *       *
 *     *         *
 *    * * * * * * *
 *         (b)
 *
 * <p>Private instance data:
 * -size:int
 *
 * <p>Constructor:
 * +SymTri(size:int)
 *
 * <p>Public methods:
 * +setSize(size:int):void
 * +getId(id:char):String
 * +getTriangle():String
 * +getRvsTri():String
 * +toString():String
 */
public class SymTri {
    /* private instance data */
    private int size;

    /** SymTri constructor. */
    public SymTri(int size) {
        setSize(size);
    }

    /** SymTri setter for the size of symmetric triangles. */
    public void setSize(int size) {
        if (size < 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", size));
        }
        this.size = size;
    }

    /** SymTri getter for triangle ID. */
    public String getId(char id) {
        StringBuffer sb = new StringBuffer();
        for (int col = 2; col < size; col++) {
            sb.append(' ');
        }
        sb.append(String.format("(%c)", id));
        return sb.toString();
    }

    /** SymTri getter for triangle. */
    public String getTriangle() {
        StringBuffer sb = new StringBuffer();
        for (int row = 1; row <= size; row++) {
            if (row == 1) {
                for (int col = 1; col < size; col++) {
                    sb.append("* ");
                }
                sb.append(String.format("*%n"));
                continue;
            }
            for (int col = 1; col < row; col++) {
                sb.append(' ');
            }
            if (row != size) {
                sb.append('*');
            }
            for (int col = row; col < size * 2 - 1 - row; col++) {
                sb.append(' ');
            }
            sb.append(String.format("*%n"));
        }
        return sb.toString();
    }

    /** SymTri getter for reverse triangle. */
    public String getRvsTri() {
        StringBuffer sb = new StringBuffer();
        for (int row = 1; row <= size; row++) {
            if (row == size) {
                for (int col = 1; col < size; col++) {
                    sb.append("* ");
                }
                sb.append(String.format("*%n"));
                break;
            }
            for (int col = 0; col < size - row; col++) {
                sb.append(' ');
            }
            if (row != 1) {
                sb.append('*');
            }
            for (int col = 1 + 1; col < row * 2 - 1; col++) {
                sb.append(' ');
            }
            sb.append(String.format("*%n"));
        }
        return sb.toString();
    }

    /** SymTri string method. */
    public String toString() {
        return String.format(
                "%s"
                        + "%s%n%n"
                        + "%s"
                        + "%s",
                getTriangle(),
                getId('a'),
                getRvsTri(),
                getId('b'));
    }
}
