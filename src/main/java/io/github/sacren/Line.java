/**
 * Line class by two points of begin and end.
 *
 * <p>Private data:
 * -begin:Point
 * -end:Point
 *
 * <p>Constructor:
 * +Line(beginX:double, beginY:double, endX:double, endY:double)
 * +Line(begin:Point, end:Point)
 *
 * <p>Public methods:
 * +getBegin():Point
 * +setBegin(begin:Point):void
 * +getEnd():Point
 * +setEnd(end:Point):void
 * +toString():String
 * +getBeginX():double
 * +setBeginX(axisX:double):void
 * +getBeginY():double
 * +setBeginY(axisY:double):void
 * +getEndX():double
 * +setEndX(axisX):void
 * +getEndY():double
 * +setEndY(axisY):void
 * +getLength():double
 */
public class Line {
    /* private instance data */
    private Point begin;
    private Point end;

    /** Line constructor by 4 integers. */
    public Line(double beginX, double beginY, double endX, double endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    /** Line constructor by begin and end points. */
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    /** Line getter for begin point. */
    public Point getBegin() {
        return begin;
    }

    /** Line setter for begin point. */
    public void setBegin(Point begin) {
        this.begin = begin;
    }

    /** Line getter for end point. */
    public Point getEnd() {
        return end;
    }

    /** Line setter for end point. */
    public void setEnd(Point end) {
        this.end = end;
    }

    /** Line getter for x-axis of begin point. */
    public double getBeginX() {
        return begin.getX();
    }

    /** Line setter for x-axis of begin point. */
    public void setBeginX(double axisX) {
        begin.setX(axisX);
    }

    /** Line getter for y-axis of begin point. */
    public double getBeginY() {
        return begin.getY();
    }

    /** Line setter for y-axis of begin point. */
    public void setBeginY(double axisY) {
        begin.setY(axisY);
    }

    /** Line getter for x-axis of end point. */
    public double getEndX() {
        return end.getX();
    }

    /** Line setter for x-axis of end point. */
    public void setEndX(double axisX) {
        end.setX(axisX);
    }

    /** Line getter for y-axis of end point. */
    public double getEndY() {
        return end.getY();
    }

    /** Line setter for y-axis of end point. */
    public void setEndY(double axisY) {
        end.setY(axisY);
    }

    /** Line length from begin point to end point. */
    public double getLength() {
        return begin.distance(end);
    }

    /** Line instance printout. */
    public String toString() {
        return String.format(
                "From P%s to P%s%n" /* invoke Point's toString() */
                        + "Start point: P%s%n"
                        + "End point:   P%s%n"
                        + "Line length is %.2f",
                begin, end,
                begin,
                end,
                getLength());
    }
}
