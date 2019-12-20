/**
 * Point is the subclass of Duo class.
 *
 * <p>Constructor:
 * +Point()
 * +Point(axisX:int, axisY:int)
 * +Point(axisX:double, axisY:double)
 *
 * <p>Public methods:
 * +getIntX():double
 * +getIntY():double
 * +distance(axisX:int, axisY:int):double
 * +distance(axisX:double, axisY:double):double
 * +distance(another:Point):double
 * +distance():double
 * +toString():String
 */
public class Point extends Duo {
    /** Point default constructor. */
    public Point() {
        super();
    }

    /** Point constructor with a pair of integers for point. */
    public Point(int axisX, int axisY) {
        super((double) axisX, (double) axisY);
    }

    /** Point constructor with a pair of doubles for point. */
    public Point(double axisX, double axisY) {
        super(axisX, axisY);
    }

    /** Point getter for int variable on X-axis. */
    public double getIntX() {
        return getFirstInt();
    }

    /** Point getter for int variable on Y-axis. */
    public double getIntY() {
        return getSecondInt();
    }

    /** Point method for distance from this point to another. */
    public double distance(Point another) {
        return Math.hypot(another.getFirstDbl() - getFirstDbl(),
                another.getSecondDbl() - getSecondDbl());
    }

    /** Point method for distance to the point by a pair of integers. */
    public double distance(int axisX, int axisY) {
        return Math.hypot(axisX - getIntX(), axisY - getIntY());
    }

    /** Point method for distance to the point by a pair of doubles. */
    public double distance(double axisX, double axisY) {
        return Math.hypot(axisX - getFirstDbl(), axisY - getSecondDbl());
    }

    /** Point method for distance to the point of (0, 0). */
    public double distance() {
        return distance(new Point());
    }

    /** Point instance formatted string. */
    public String toString() {
        return String.format("(%.2f, %.2f)", getFirstDbl(), getSecondDbl());
    }
}
