/**
 * Point class.
 *
 * <p>Private data with default values:
 * -axisX:int = 0
 * -axisY:int = 0
 *
 * <p>Constructor:
 * +Point()
 * +Point(x:int, y:int)
 *
 * <p>Public methods:
 * +getX():int
 * +setX(x:int):void
 * +getY():int
 * +setY(y:int):void
 * +toString():String
 * +getX_Y():int[2]
 * +setX_Y(x:int, y:int):void
 * +distance(x:int, y:int):double
 * +distance(another:Point):double
 * +distance():double
 */
public class Point {
    /* private static data */
    private static final int DEFAULT_X = 0;
    private static final int DEFAULT_Y = 0;

    /* private instance data */
    private int axisX;
    private int axisY;

    /** Default constructor. */
    public Point() {
        axisX = DEFAULT_X;
        axisY = DEFAULT_Y;
    }

    /** Custom constructor. */
    public Point(int x, int y) {
        axisX = x;
        axisY = y;
    }

    /** getter for axisX. */
    public int getX() {
        return axisX;
    }

    /** setter for axisX. */
    public void setX(int x) {
        axisX = x;
    }

    /** getter for axisY. */
    public int getY() {
        return axisY;
    }

    /** setter for axisY. */
    public void setY(int y) {
        axisY = y;
    }

    /** Point description. */
    public String toString() {
        return String.format("(%d, %d)", axisX, axisY);
    }

    /** getter for a specific point. */
    public int[] getX_Y() {
        int[] point = new int[2];
        point[0] = axisX;
        point[1] = axisY;
        return point;
    }

    /** setter for a specific point. */
    public void setX_Y(int x, int y) {
        axisX = x;
        axisY = y;
    }

    /** Method for distance from this point to (x, y). */
    public double distance(int x, int y) {
        return Math.sqrt((double) (
                    Math.abs(x - axisX) * Math.abs(x - axisX)
                    + Math.abs(y - axisY) * Math.abs(y - axisY)));
    }

    /** Method for distance from this point to another. */
    public double distance(Point another) {
        return Math.sqrt((double) (
                    Math.abs(another.getX() - axisX) * Math.abs(another.getX() - axisX)
                    + Math.abs(another.getY() - axisY) * Math.abs(another.getY() - axisY)));
    }

    /** Method for distance from this point to (0, 0). */
    public double distance() {
        return Math.sqrt((double) (
                    Math.abs(axisX) * Math.abs(axisX)
                    + Math.abs(axisY) * Math.abs(axisY)));
    }
}
