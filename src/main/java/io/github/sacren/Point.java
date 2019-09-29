/**
 * Point class for object with a pair of variables.
 *
 * <p>We identify Point object by (axisX, axisY).  Broadly the pair could be
 * used for any object.  See Pension class for details.
 *
 * <p>Private instance variables with default values:
 * -axisX:double = 0
 * -axisY:double = 0
 *
 * <p>Constructor:
 * +Point()
 * +Point(axisX:double, axisY:double)
 *
 * <p>Public methods:
 * +setX(axisX:double):void
 * +setY(axisY:double):void
 * +getX():double
 * +getY():double
 * +distance(axisX:double, axisY:double):double
 * +distance(p:Point):double
 * +distance():double
 * +toString():String
 */
public class Point {
    /* private instance variables */
    private double axisX;
    private double axisY;

    /** Point default constructor. */
    public Point() {
        setX(0);
        setY(0);
    }

    /** Point custom constructor. */
    public Point(double axisX, double axisY) {
        setX(axisX);
        setY(axisY);
    }

    /** Point setter for variable on X-axis. */
    public void setX(double axisX) {
        this.axisX = axisX;
    }

    /** Point setter for variable on Y-axis. */
    public void setY(double axisY) {
        this.axisY = axisY;
    }

    /** Point getter for variable on X-axis. */
    public double getX() {
        return axisX;
    }

    /** Point getter for variable on Y-axis. */
    public double getY() {
        return axisY;
    }

    /** Point getter for distance from this point to another. */
    public double distance(Point p) {
        return Math.hypot(p.getX() - axisX, p.getY() - axisY);
    }

    /** Point getter for distance with different arguments. */
    public double distance(double axisX, double axisY) {
        return Math.hypot(axisX - this.axisX, axisY - this.axisY);
    }

    /** Point getter for distance from this point to Point (0, 0). */
    public double distance() {
        return Math.hypot(axisX, axisY);
    }

    /** Point instance formatted string. */
    public String toString() {
        return String.format("(%.2f, %.2f)", axisX, axisY);
    }
}
