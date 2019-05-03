/**
 * Line class by Point begin and Point end.
 *
 * <p>Private data:
 * -begin:Point
 * -end:Point
 *
 * <p>Constructor:
 * +Line(beginX:int, beginY:int, endX:int, endY:int)
 * +Line(begin:Point, end:Point)
 *
 * <p>Public methods:
 * +getBegin():Point
 * +setBegin(begin:Point):void
 * +getEnd():Point
 * +setEnd(end:Point):void
 * +toString():String
 * +getBeginX():int
 * +setBeginX(axisX:int):void
 * +getBeginY():int
 * +setBeginY(axisY:int):void
 * +getEndX():int
 * +setEndX(axisX):void
 * +getEndY():int
 * +setEndY(axisY):void
 * +getLength():double
 */
public class Line {
    /* private instance data */
    private Point begin;
    private Point end;

    /** Line constructor by 4 integers. */
    public Line(int beginX, int beginY, int endX, int endY) {
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
    public int getBeginX() {
        return begin.getX();
    }

    /** Line method to set x-axis of Point begin. */
    public void setBeginX(int axisX) {
        begin.setX(axisX);
    }

    /** Line method for y-axis of Point begin. */
    public int getBeginY() {
        return begin.getY();
    }

    /** Line method to set y-axis of Point begin. */
    public void setBeginY(int axisY) {
        begin.setY(axisY);
    }

    /** Line method for x-axis of Point end. */
    public int getEndX() {
        return end.getX();
    }

    /** Line method to set x-axis of Point end. */
    public void setEndX(int axisX) {
        end.setX(axisX);
    }

    /** Line method for y-axis of Point end. */
    public int getEndY() {
        return end.getY();
    }

    /** Line method to set y-axis of Point end. */
    public void setEndY(int axisY) {
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
