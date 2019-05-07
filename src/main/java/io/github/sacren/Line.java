/**
 * Line class by Point begin and Point end.
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

    /** Line method for x-axis of Point begin. */
    public double getBeginX() {
        return begin.getX();
    }

    /** Line method to set x-axis of Point begin. */
    public void setBeginX(double axisX) {
        begin.setX(axisX);
    }

    /** Line method for y-axis of Point begin. */
    public double getBeginY() {
        return begin.getY();
    }

    /** Line method to set y-axis of Point begin. */
    public void setBeginY(double axisY) {
        begin.setY(axisY);
    }

    /** Line method for x-axis of Point end. */
    public double getEndX() {
        return end.getX();
    }

    /** Line method to set x-axis of Point end. */
    public void setEndX(double axisX) {
        end.setX(axisX);
    }

    /** Line method for y-axis of Point end. */
    public double getEndY() {
        return end.getY();
    }

    /** Line method to set y-axis of Point end. */
    public void setEndY(double axisY) {
        end.setY(axisY);
    }

    /** Line length from begin to end. */
    public double getLength() {
        return begin.distance(end);
    }

    /** Line instance printout. */
    public String toString() {
        return String.format(
                "From %s to %s%n" /* invoke Point's toString() */
                        + "Start point: %s%n"
                        + "End point:   %s%n"
                        + "Line length is %.2f",
                begin, end,
                begin,
                end,
                getLength());
    }
}
