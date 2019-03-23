/**
 * Point2D: superclass over Point3D.
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
 * +toString():string
 */
public class Point2D {
    /* private static data */
    private static final int DEFAULT_X = 0;
    private static final int DEFAULT_Y = 0;

    /* private instance data */
    private int axisX;
    private int axisY;

    /* default constructor */
    public Point2D() {
        axisX = DEFAULT_X;
        axisY = DEFAULT_Y;
    }

    /* custom constructor */
    public Point2D(int axisX, int axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    /** getter of axisX. */
    public int getX() {
        return axisX;
    }

    /** setter of axisX. */
    public void setX(int axisX) {
        this.axisX = axisX;
    }

    /** getter of axisY. */
    public int getY() {
        return axisY;
    }

    /** setter of axisY. */
    public void setY(int axisY) {
        this.axisY = axisY;
    }

    /** Point2D description. */
    public String toString() {
        return String.format("Point2D (%d, %d)", axisX, axisY);
    }
}
