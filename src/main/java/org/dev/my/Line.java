/**
 * Line class as composed of Point class.
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

    /** getter of begin point. */
    public Point getBegin() {
        return begin;
    }

    /** setter of begin point. */
    public void setBegin(Point begin) {
        this.begin = begin;
    }

    /** getter of end point. */
    public Point getEnd() {
        return end;
    }

    /** setter of end point. */
    public void setEnd(Point end) {
        this.end = end;
    }

    /** Method for x-axis value of Point begin. */
    public int getBeginX() {
        return begin.getX();
    }

    /** Method to set x-axis value of Point begin. */
    public void setBeginX(int axisX) {
        begin.setX(axisX);
    }

    /** Method for y-axis value of Point begin. */
    public int getBeginY() {
        return begin.getY();
    }

    /** Method to set y-axis value of Point begin. */
    public void setBeginY(int axisY) {
        begin.setY(axisY);
    }

    /** Method for x-axis value of Point end. */
    public int getEndX() {
        return end.getX();
    }

    /** Method to set x-axis value of Point end. */
    public void setEndX(int axisX) {
        end.setX(axisX);
    }

    /** Method for y-axis value of Point end. */
    public int getEndY() {
        return end.getY();
    }

    /** Method to set y-axis value of Point end. */
    public void setEndY(int axisY) {
        end.setY(axisY);
    }

    /** Line description. */
    public String toString() {
        return String.format(
                "From %s to %s", /* invoke Point's toString() */
                begin, end);
    }

    /** Line length from begin to end. */
    public double getLength() {
        return begin.distance(end);
    }
}
