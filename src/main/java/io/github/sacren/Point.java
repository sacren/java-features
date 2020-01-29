/**
 * Point is the subclass of Duo class.
 *
 * <p>Constructor:
 * +Point()
 * +Point(axisX:double, axisY:double)
 *
 * <p>Public methods:
 * +distance(another:Point):double
 * +distance(axisX:double, axisY:double):double
 * +distance():double
 * +isSame(another:Point):boolean
 * +toString():String
 */
public class Point extends Duo {
    /** Point default constructor. */
    public Point() {
        /* super(); */
    }

    /** Point constructor for point of a pair of double numbers. */
    public Point(double axisX, double axisY) {
        super(axisX, axisY);
    }

    /** Point method for distance from this point to another. */
    public double distance(Point another) {
        return Math.hypot(another.getFirstDbl() - getFirstDbl(),
                another.getSecondDbl() - getSecondDbl());
    }

    /** Point method for distance to the point by a pair of double numbers. */
    public double distance(double axisX, double axisY) {
        return distance(new Point(axisX, axisY));
    }

    /** Point method for distance to the point of (0, 0). */
    public double distance() {
        return distance(new Point());
    }

    /** Point method checks if the point is the same as another. */
    public boolean isSame(Point another) {
        boolean same = false;
        if (another.getFirstDbl() == getFirstDbl() && another.getSecondDbl() == getSecondDbl()) {
            same = true;
        }
        return same;
    }

    /** Point instance formatted string. */
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", getFirstDbl(), getSecondDbl());
    }
}
