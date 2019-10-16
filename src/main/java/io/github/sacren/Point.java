/**
 * Point class for object with a pair of variables.
 *
 * <p>We identify Point object by (axisX, axisY).  Broadly the pair could be
 * used for any object.  See Pension class for details.
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

    /** Point custom constructor. */
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
    public double distance(Point p) {
        return Math.hypot(p.getX() - point.getFirstDbl(), p.getY() - point.getSecondDbl());
    }

    /** Point getter for distance with different arguments. */
    public double distance(double axisX, double axisY) {
        return Math.hypot(axisX - point.getFirstDbl(), axisY - point.getSecondDbl());
    }

    /** Point getter for distance from this point to Point (0, 0). */
    public double distance() {
        return Math.hypot(point.getFirstDbl(), point.getSecondDbl());
    }

    /** Point instance formatted string. */
    public String toString() {
        return String.format("(%.2f, %.2f)", point.getFirstDbl(), point.getSecondDbl());
    }
}
