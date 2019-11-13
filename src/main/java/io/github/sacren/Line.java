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
 * +setBeginEnd(begin:Point, end:Point):void
 * +getBegin():Point
 * +getEnd():Point
 * +getDist():double
 * +getGradient():double
 * +distToLine(p:Point):double
 * +distToLine(axisX:double, axisY:double):double
 * +hasIntersect(l:Line):boolean
 * +toString():String
 */
public class Line {
    /* private static constant */
    private static final Point GIVEN_POINT = new Point(20, 16);
    private static final Line GIVEN_LINE = new Line(new Point(1, 1), GIVEN_POINT);

    /* private instance variables */
    private Point begin;
    private Point end;

    /** Line constructor by begin and end points. */
    public Line(Point begin, Point end) {
        setBeginEnd(begin, end);
    }

    /** Line constructor by 4 numbers. */
    public Line(double beginX, double beginY, double endX, double endY) {
        this(new Point(beginX, beginY), new Point(endX, endY));
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

    /** Line setter for both begin and end points. */
    public void setBeginEnd(Point begin, Point end) {
        setPoints();
        setBegin(begin);
        setEnd(end);
        chkBeginEnd();
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
     * Line distance from given point to the line.
     *
     * <p>D = ρ * sin (φ - φ')
     *
     * <p>D: distance from the given point to the line
     * ρ: distance from begin to the given point
     * φ: gradient of the line
     * φ': gradient of the line from begin to the given point
     */
    public double distToLine(Point p) {
        double gradient = Math.atan2(p.getY() - begin.getY(), p.getX() - begin.getX());
        return begin.getDist(p) * Math.abs(Math.sin(getGradient() - gradient));
    }

    /** Line distance from given point to the line by pair of numbers. */
    public double distToLine(double axisX, double axisY) {
        return distToLine(new Point(axisX, axisY));
    }

    /** Line checker if this line intersects with the given line. */
    public boolean hasIntersect(Line l) {
        return getGradient() != l.getGradient();
    }

    /** Line instance formatted string. */
    public String toString() {
        return String.format(
                "From %s to %s%n" /* invoke Point's toString() */
                        + "Begin point:      %s%n"
                        + "End point:        %s%n"
                        + "Point distance:   %.2f%n"
                        + "Gradient:         %.2f%n"
                        + "Distance to line: %.2f%n"
                        + "Distance to line: %.2f%n"
                        + "Intersects with:  %s",
                begin, end,
                begin,
                end,
                getDist(),
                getGradient(),
                distToLine(GIVEN_POINT),
                distToLine(GIVEN_POINT.getX(), GIVEN_POINT.getY()),
                hasIntersect(GIVEN_LINE));
    }
}
