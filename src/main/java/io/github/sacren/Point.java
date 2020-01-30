/**
 * Point object is determined by two numbers.  It is the subclass of Duo class.
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
 */
public class Point extends Duo {
    /** Point default constructor. */
    public Point() {
        this(0, 0);
    }

    /** Point constructor instantiates the point of two numbers. */
    public Point(double axisX, double axisY) {
        super(axisX, axisY);
    }

    /**
     * Point distance method calculates the distance from this point to
     * another.
     */
    public double distance(Point another) {
        return Math.hypot(another.getFirstDbl() - getFirstDbl(),
                another.getSecondDbl() - getSecondDbl());
    }

    /**
     * Point distance method calculates the distance from this point to
     * another point by a pair of numbers.
     */
    public double distance(double axisX, double axisY) {
        return distance(new Point(axisX, axisY));
    }

    /**
     * Point distance method calculates the distance from this point to origin
     * (0, 0).
     */
    public double distance() {
        return distance(new Point());
    }

    /** Point isSame method checks if two points are the same. */
    public boolean isSame(Point another) {
        return another.getFirstDbl() == getFirstDbl() && another.getSecondDbl() == getSecondDbl();
    }
}
