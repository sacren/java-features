/**
 * Point class.
 *
 * <p>Private data with default values:
 * -axisX:double = 0
 * -axisY:double = 0
 *
 * <p>Constructor:
 * +Point()
 * +Point(axisX:double, axisY:double)
 *
 * <p>Public methods:
 * +getX():double
 * +setX(axisX:double):void
 * +getY():double
 * +setY(axisY:double):void
 * +toString():String
 * +distance(axisX:double, axisY:double):double
 * +distance(p:Point):double
 * +distance():double
 */
public class Point {
    /* private instance data */
    private double axisX;
    private double axisY;

    /** Point default constructor. */
    public Point() {
        axisX = 0;
        axisY = 0;
    }

    /** Point custom constructor. */
    public Point(double axisX, double axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    /** Point getter for axisX. */
    public double getX() {
        return axisX;
    }

    /** Point setter for axisX. */
    public void setX(double axisX) {
        this.axisX = axisX;
    }

    /** Point getter for axisY. */
    public double getY() {
        return axisY;
    }

    /** Point setter for axisY. */
    public void setY(double axisY) {
        this.axisY = axisY;
    }

    /** Point getter for distance from this point to Point (axisX, axisY). */
    public double distance(double axisX, double axisY) {
        return Math.hypot(axisX - this.axisX, axisY - this.axisY);
    }

    /** Point getter for distance from this point to another. */
    public double distance(Point p) {
        return Math.hypot(p.getX() - axisX, p.getY() - axisY);
    }

    /** Point getter for distance from this point to Point (0, 0). */
    public double distance() {
        return Math.hypot(axisX, axisY);
    }

    /** Point string method. */
    public String toString() {
        return String.format("(%.2f, %.2f)", axisX, axisY);
    }
}
