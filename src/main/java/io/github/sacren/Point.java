/**
 * Point is the subclass of Duo class.
 *
 * <p>Constructor:
 * +Point()
 * +Point(axisX:int, axisY:int)
 * +Point(axisX:double, axisY:double)
 *
 * <p>Public methods:
 * +distance(axisX:double, axisY:double):double
 * +distance(axisX:int, axisY:int):double
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

    /** Point method for distance from this point to another. */
    public double distance(Point another) {
        return Math.hypot(another.getFirstDbl() - getFirstDbl(),
                another.getSecondDbl() - getSecondDbl());
    }

    /** Point method for distance to the point by a pair of doubles. */
    public double distance(double axisX, double axisY) {
        return Math.hypot(axisX - getFirstDbl(), axisY - getSecondDbl());
    }

    /** Point method for distance to the point by a pair of integers. */
    public double distance(int axisX, int axisY) {
        return distance((double) axisX, (double) axisY);
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
