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
 * +distance(axisX:double, axisY:double):double
 * +distance(p:Point):double
 * +distance():double
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

    /** Point method for distance from this point to another. */
    public double distance(Point another) {
        return Math.hypot(another.getX() - getX(), another.getY() - getY());
    }

    /** Point method for distance to the point by a pair of numbers. */
    public double distance(double axisX, double axisY) {
        return distance(new Point(axisX, axisY));
    }

    /** Point method for distance to the point of (0, 0). */
    public double distance() {
        return distance(0, 0);
    }

    /** Point instance formatted string. */
    public String toString() {
        return String.format("(%.2f, %.2f)", getX(), getY());
    }
}
