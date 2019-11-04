/**
 * Point class uses Duo object for the point.
 *
 * <p>Private instance variables with default values:
 * -point:Duo = {0, 0}
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
 * +getDist(axisX:double, axisY:double):double
 * +getDist(p:Point):double
 * +getDist():double
 * +toString():String
 */
public class Point {
    /* private instance variable */
    private Duo point;

    /** Point default constructor. */
    public Point() {
        point = new Duo();
    }

    /** Point constructor with a pair of numbers for point. */
    public Point(double axisX, double axisY) {
        point = new Duo(axisX, axisY);
    }

    /** Point setter for variable on X-axis. */
    public void setX(double axisX) {
        point.setFirst(axisX);
    }

    /** Point setter for variable on Y-axis. */
    public void setY(double axisY) {
        point.setSecond(axisY);
    }

    /** Point getter for variable on X-axis. */
    public double getX() {
        return point.getFirstDbl();
    }

    /** Point getter for variable on Y-axis. */
    public double getY() {
        return point.getSecondDbl();
    }

    /** Point getter for distance from this point to another. */
    public double getDist(Point p) {
        return Math.hypot(p.getX() - getX(), p.getY() - getY());
    }

    /** Point getter for distance to the point by a pair of numbers. */
    public double getDist(double axisX, double axisY) {
        return Math.hypot(axisX - getX(), axisY - getY());
    }

    /** Point getter for distance to the point of (0, 0). */
    public double getDist() {
        return Math.hypot(getX(), getY());
    }

    /** Point instance formatted string. */
    public String toString() {
        return String.format("(%.2f, %.2f)", getX(), getY());
    }
}
