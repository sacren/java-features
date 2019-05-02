/**
 * Point class.
 *
 * <p>Private data with default values:
 * -axisX:int = 0
 * -axisY:int = 0
 *
 * <p>Constructor:
 * +Point()
 * +Point(axisX:int, axisY:int)
 *
 * <p>Public methods:
 * +getX():int
 * +setX(axisX:int):void
 * +getY():int
 * +setY(axisY:int):void
 * +toString():String
 * +getX_Y():int[2]
 * +setX_Y(axisX:int, axisY:int):void
 * +distance(axisX:int, axisY:int):double
 * +distance(p:Point):double
 * +distance():double
 */
public class Point {
    /* private static data */
    private static final int DEFAULT_X = 0;
    private static final int DEFAULT_Y = 0;

    /* private instance data */
    private int axisX;
    private int axisY;

    /** Point default constructor. */
    public Point() {
        axisX = DEFAULT_X;
        axisY = DEFAULT_Y;
    }

    /** Point custom constructor. */
    public Point(int axisX, int axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    /** Point getter for axisX. */
    public int getX() {
        return axisX;
    }

    /** Point setter for axisX. */
    public void setX(int axisX) {
        this.axisX = axisX;
    }

    /** Point getter for axisY. */
    public int getY() {
        return axisY;
    }

    /** Point setter for axisY. */
    public void setY(int axisY) {
        this.axisY = axisY;
    }

    /** Point instance printout. */
    public String toString() {
        return String.format("(%d, %d)", axisX, axisY);
    }

    /** Point getter for a specific point. */
    public int[] getX_Y() {
        int[] point = new int[2];
        point[0] = axisX;
        point[1] = axisY;
        return point;
    }

    /** Point setter for a specific point. */
    public void setX_Y(int axisX, int axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    /** Point method for distance from this point to P(axisX, axisY). */
    public double distance(int axisX, int axisY) {
        return Math.sqrt((double) (
                    Math.abs(axisX - this.axisX) * Math.abs(axisX - this.axisX)
                    + Math.abs(axisY - this.axisY) * Math.abs(axisY - this.axisY)));
    }

    /** Point method for distance from this point to another. */
    public double distance(Point p) {
        return Math.sqrt((double) (
                    Math.abs(p.getX() - axisX) * Math.abs(p.getX() - axisX)
                    + Math.abs(p.getY() - axisY) * Math.abs(p.getY() - axisY)));
    }

    /** Point method for distance from this point to P(0, 0). */
    public double distance() {
        return Math.sqrt((double) (
                    Math.abs(axisX) * Math.abs(axisX)
                    + Math.abs(axisY) * Math.abs(axisY)));
    }
}
