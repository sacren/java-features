/**
 * Point class uses Duo object for the point.
 *
 * <p>Private instance variables with default values:
 * -point:Duo = {0, 0}
 *
 * <p>Constructor:
 * +Point()
 * +Point(axisX:int, axisY:int)
 * +Point(axisX:double, axisY:double)
 *
 * <p>Public methods:
 * +setX(axisX:int):void
 * +setX(axisX:double):void
 * +setY(axisY:int):void
 * +setY(axisY:double):void
 * +getX():double
 * +getY():double
 * +distance(axisX:int, axisY:int):double
 * +distance(axisX:double, axisY:double):double
 * +distance(another:Point):double
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

    /** Point constructor with a pair of integers for point. */
    public Point(int axisX, int axisY) {
        this();
        setX(axisX);
        setY(axisY);
    }

    /** Point constructor with a pair of doubles for point. */
    public Point(double axisX, double axisY) {
        point = new Duo(axisX, axisY);
    }

    /** Point setter for int variable on X-axis. */
    public void setX(int axisX) {
        point.setFirst(axisX);
    }

    /** Point setter for double variable on X-axis. */
    public void setX(double axisX) {
        point.setFirst(axisX);
    }

    /** Point setter for int variable on Y-axis. */
    public void setY(int axisY) {
        point.setSecond(axisY);
    }

    /** Point setter for double variable on Y-axis. */
    public void setY(double axisY) {
        point.setSecond(axisY);
    }

    /** Point getter for int variable on X-axis. */
    public double getIntX() {
        return point.getFirstInt();
    }

    /** Point getter for int variable on Y-axis. */
    public double getIntY() {
        return point.getSecondInt();
    }

    /** Point getter for variable on X-axis. */
    public double getX() {
        return point.getFirstDbl();
    }

    /** Point getter for variable on Y-axis. */
    public double getY() {
        return point.getSecondDbl();
    }

    /** Point method for distance to the point by a pair of integers. */
    public double distance(int axisX, int axisY) {
        return Math.hypot(axisX - getIntX(), axisY - getIntY());
    }

    /** Point method for distance to the point by a pair of doubles. */
    public double distance(double axisX, double axisY) {
        return Math.hypot(axisX - getX(), axisY - getY());
    }

    /** Point method for distance from this point to another. */
    public double distance(Point another) {
        double distance;
        Duo point = another.point;
        int type = point.getType();
        if (type != this.point.getType()) {
            throw new IllegalArgumentException("Point element type mismatch!");
        }
        switch (type) {
            case 1:
                distance = distance(point.getFirstInt(), point.getSecondInt());
                break;
            default:
                distance = distance(point.getFirstDbl(), point.getSecondDbl());
                break;
        }
        return distance;
    }

    /** Point method for distance to the point of (0, 0). */
    public double distance() {
        return distance(0, 0);
    }

    /** Point instance formatted string. */
    public String toString() {
        return String.format("%s", point);
    }
}
