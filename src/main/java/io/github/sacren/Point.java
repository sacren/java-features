/**
 * Point is the subclass of Duo class.
 *
 * <p>Constructor:
 * +Point()
 * +Point(axisX:double, axisY:double)
 * +Point(axisX:int, axisY:int)
 *
 * <p>Public methods:
 * +distance(another:Point):double
 * +distance(axisX:double, axisY:double):double
 * +distance(axisX:int, axisY:int):double
 * +distance():double
 * +toString():String
 */
public class Point extends Duo {
    /* private Point instance variable */
    private boolean isOrigin;

    /** Point default constructor. */
    public Point() {
        /* super(); */
        isOrigin = true;
    }

    /** Point constructor for point of a pair of double numbers. */
    public Point(double axisX, double axisY) {
        super(axisX, axisY);
    }

    /** Point constructor for point derived from a pair of integers. */
    public Point(int axisX, int axisY) {
        this((double) axisX, (double) axisY);
        if (axisX == 0 && axisY == 0) {
            setFirst(0);
            setSecond(0);
            isOrigin = true;
        }
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
        StringBuilder sb = new StringBuilder();
        if (isOrigin) {
            sb.append(String.format("(%d, %d)", getFirstInt(), getSecondInt()));
        } else {
            sb.append(String.format("(%.2f, %.2f)", getFirstDbl(), getSecondDbl()));
        }
        return sb.toString();
    }
}
