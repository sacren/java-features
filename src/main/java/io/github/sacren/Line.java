/**
 * Line class is composed of begin and end two points.
 *
 * <p>Private instance variables:
 * -begin:Point
 * -end:Point
 *
 * <p>Constructor:
 * +Line(begin:Point, end:Point)
 * +Line(beginX:double, beginY:double, endX:double, endY:double)
 *
 * <p>Public methods:
 * +setPoints():void
 * +setBeginX(axisX:double):void
 * +setBeginY(axisY:double):void
 * +setBegin(begin:Point):void
 * +setEndX(axisX):void
 * +setEndY(axisY):void
 * +setEnd(end:Point):void
 * +chkBeginEnd():void
 * +getBegin():Point
 * +getEnd():Point
 * +getDist():double
 * +getGradient():double
 * +getDistToLine():double
 * +toString():String
 */
public class Line {
    /* private instance variables */
    private Point begin;
    private Point end;

    /** Line constructor by begin and end points. */
    public Line(Point begin, Point end) {
        setPoints();
        setBegin(begin);
        setEnd(end);
        chkBeginEnd();
    }

    /** Line constructor by 4 numbers. */
    public Line(double beginX, double beginY, double endX, double endY) {
        setPoints();
        setBegin(new Point(beginX, beginY));
        setEnd(new Point(endX, endY));
        chkBeginEnd();
    }

    /** Line setter to initialize begin and end points. */
    public void setPoints() {
        begin = new Point();
        end = new Point();
    }

    /** Line setter for value on X-axis of begin point. */
    public void setBeginX(double axisX) {
        begin.setX(axisX);
    }

    /** Line setter for value on Y-axis of begin point. */
    public void setBeginY(double axisY) {
        begin.setY(axisY);
    }

    /** Line setter for begin point. */
    public void setBegin(Point begin) {
        setBeginX(begin.getX());
        setBeginY(begin.getY());
    }

    /** Line setter for value on X-axis of end point. */
    public void setEndX(double axisX) {
        end.setX(axisX);
    }

    /** Line setter for value on Y-axis of end point. */
    public void setEndY(double axisY) {
        end.setY(axisY);
    }

    /** Line setter for end point. */
    public void setEnd(Point end) {
        setEndX(end.getX());
        setEndY(end.getY());
    }

    /** Line checker for different begin and end points. */
    public void chkBeginEnd() {
        if (begin.getX() == end.getX() && begin.getY() == end.getY()) {
            throw new IllegalArgumentException(
                    String.format(
                        "Begin %s and End %s can't be the same!",
                        begin, end));
        }
    }

    /** Line getter for begin point. */
    public Point getBegin() {
        return begin;
    }

    /** Line getter for end point. */
    public Point getEnd() {
        return end;
    }

    /** Line getter for distance from begin point to end point. */
    public double getDist() {
        return begin.getDist(end);
    }

    /** Line getter for the gradient of Line object. */
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    /**
     * Line getter for the distance from given point to the line.
     *
     * <p>D = ρ * sin (φ - φ')
     *
     * <p>D: distance from the given point to the line
     * ρ: distance from begin to the given point
     * φ: gradient of the line
     * φ': gradient of the line from begin to the given point
     */
    public double getDistToLine(Point p) {
        double gradient = Math.atan2(p.getY() - begin.getY(), p.getX() - begin.getX());
        return begin.getDist(p) * Math.abs(Math.sin(getGradient() - gradient));
    }

    /** Line instance formatted string. */
    public String toString() {
        return String.format(
                "From %s to %s%n" /* invoke Point's toString() */
                        + "Start point: %s%n"
                        + "End point:   %s%n"
                        + "Distance:    %.2f%n"
                        + "Gradient:    %.2f",
                begin, end,
                begin,
                end,
                getDist(),
                getGradient());
    }
}
