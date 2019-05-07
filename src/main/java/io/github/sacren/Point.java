/**
 * Point class.
 *
 * <p>Private data with default values:
 * -axisX:double = 0
 * -axisY:double = 0
 *
 * <p>Constructor:
 * +Point()
 * +Point(axisX:double, axisY:double)
 *
 * <p>Public methods:
 * +getX():double
 * +setX(axisX:double):void
 * +getY():double
 * +setY(axisY:double):void
 * +toString():String
 * +setX_Y(axisX:double, axisY:double):void
 * +distance(axisX:double, axisY:double):double
 * +distance(p:Point):double
 * +distance():double
 */
public class Point {
    /* private static data */
    private static final double DEFAULT_X = 0;
    private static final double DEFAULT_Y = 0;

    /* private instance data */
    private double axisX;
    private double axisY;
    private Point point;

    /** Point default constructor. */
    public Point() {
        axisX = DEFAULT_X;
        axisY = DEFAULT_Y;
    }

    /** Point custom constructor. */
    public Point(double axisX, double axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    /** Point getter for axisX. */
    public double getX() {
        return axisX;
    }

    /** Point setter for axisX. */
    public void setX(double axisX) {
        this.axisX = axisX;
    }

    /** Point getter for axisY. */
    public double getY() {
        return axisY;
    }

    /** Point setter for axisY. */
    public void setY(double axisY) {
        this.axisY = axisY;
    }

    /** Point instance printout. */
    public String toString() {
        return String.format(
                "P(%.2f, %.2f)",
                axisX, axisY);
    }

    /** Point setter for a specific point. */
    public void setX_Y(double axisX, double axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    /** Point method for distance from this point to P(axisX, axisY). */
    public double distance(double axisX, double axisY) {
        return Math.sqrt((double) (
                    Math.abs(axisX - this.axisX) * Math.abs(axisX - this.axisX)
                    + Math.abs(axisY - this.axisY) * Math.abs(axisY - this.axisY)));
    }

    /** Point method for distance from this point to another. */
    public double distance(Point p) {
        return Math.sqrt((double) (
                    Math.abs(p.getX() - axisX) * Math.abs(p.getX() - axisX)
                    + Math.abs(p.getY() - axisY) * Math.abs(p.getY() - axisY)));
    }

    /** Point method for distance from this point to P(0, 0). */
    public double distance() {
        return Math.sqrt((double) (
                    Math.abs(axisX) * Math.abs(axisX)
                    + Math.abs(axisY) * Math.abs(axisY)));
    }
}
