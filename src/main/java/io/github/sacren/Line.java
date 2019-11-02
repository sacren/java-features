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
 * +getBegin():Point
 * +getEnd():Point
 * +getLength():double
 * +getGradient():double
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
    }

    /** Line constructor by 4 numbers. */
    public Line(double beginX, double beginY, double endX, double endY) {
        setPoints();
        setBegin(new Point(beginX, beginY));
        setEnd(new Point(endX, endY));
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

    /** Line getter for begin point. */
    public Point getBegin() {
        return begin;
    }

    /** Line getter for end point. */
    public Point getEnd() {
        return end;
    }

    /** Line getter for length from begin point to end point. */
    public double getLength() {
        return begin.distance(end);
    }

    /** Line getter for the gradient of Line object. */
    public double getGradient() {
        return (end.getY() - begin.getY()) / (end.getX() - begin.getX());
    }

    /** Line instance formatted string. */
    public String toString() {
        return String.format(
                "From %s to %s%n" /* invoke Point's toString() */
                        + "Start point: %s%n"
                        + "End point:   %s%n"
                        + "Line length: %.2f%n"
                        + "Gradient:    %.2f",
                begin, end,
                begin,
                end,
                getLength(),
                getGradient());
    }
}
