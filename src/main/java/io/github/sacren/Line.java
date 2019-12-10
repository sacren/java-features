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
 * +setBegin(begin:Point):void
 * +setEnd(end:Point):void
 * +setPoints(begin:Point, end:Point):void
 * +getBegin():Point
 * +getEnd():Point
 * +distance():double
 * +gradient():double
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
        setPoints();
        setPoints(begin, end);
    }

    /** Line constructor by 4 numbers. */
    public Line(double beginX, double beginY, double endX, double endY) {
        this(new Point(beginX, beginY), new Point(endX, endY));
    }

    /** Line setter to initialize begin and end points. */
    public void setPoints() {
        begin = new Point((double) 0, (double) 0);
        end = new Point((double) 0, (double) 0);
    }

    /** Line setter for begin point. */
    public void setBegin(Point begin) {
        this.begin.setPoint(begin.getPoint());
    }

    /** Line setter for end point. */
    public void setEnd(Point end) {
        this.end.setPoint(end.getPoint());
    }

    /** Line setter for both begin and end points. */
    public void setPoints(Point begin, Point end) {
        setBegin(begin);
        setEnd(end);
    }

    /** Line getter for begin point. */
    public Point getBegin() {
        return begin;
    }

    /** Line getter for end point. */
    public Point getEnd() {
        return end;
    }

    /** Line method for distance from begin point to end point. */
    public double distance() {
        return begin.distance(end);
    }

    /** Line method for gradient of Line object. */
    public double gradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    /**
     * Line method for distance from given point to this line.
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
        return begin.distance(p) * Math.abs(Math.sin(gradient() - gradient));
    }

    /** Line distance from given point to the line by pair of numbers. */
    public double distToLine(double axisX, double axisY) {
        return distToLine(new Point(axisX, axisY));
    }

    /** Line checker if this line intersects with the given line. */
    public boolean hasIntersect(Line l) {
        return gradient() != l.gradient();
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
                distance(),
                gradient(),
                distToLine(GIVEN_POINT),
                distToLine(GIVEN_POINT.getX(), GIVEN_POINT.getY()),
                hasIntersect(GIVEN_LINE));
    }
}
