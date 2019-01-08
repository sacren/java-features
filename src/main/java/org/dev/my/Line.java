/**
 * Line class is composed of Point class.
 *
 * <p>Private data with default values:
 * -begin:Point
 * -end:Point
 *
 * <p>Constructor:
 * +Line(begin:Point, end:Point)
 *
 * <p>Public methods:
 * +getBegin():Point
 * +setBegin(begin:Point):void
 * +getEnd():Point
 * +setEnd(end:Point):void
 * +toString():String
 */
public class Line {
    /* private instance data */
    private Point begin;
    private Point end;

    /** Custom constructor. */
    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

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

    /** getter of Point begin x-axis. */
    public int getBeginX() {
        return begin.getX();
    }

    /** setter of Point begin x-axis. */
    public void setBeginX(int x) {
        begin.setX(x);
    }

    /** getter of Point begin y-axis. */
    public int getBeginY() {
        return begin.getY();
    }

    /** setter of Point begin y-axis. */
    public void setBeginY(int y) {
        begin.setY(y);
    }

    /** getter of Point end x-axis. */
    public int getEndX() {
        return end.getX();
    }

    /** setter of Point end x-axis. */
    public void setEndX(int x) {
        end.setX(x);
    }

    /** getter of Point end y-axis. */
    public int getEndY() {
        return end.getY();
    }

    /** setter of Point end y-axis. */
    public void setEndY(int y) {
        end.setY(y);
    }

    /** Line description. */
    public String toString() {
        return String.format(
                "From %s to %s",
                begin, /* invoke Point's toString() */
                end); /* invoke Point's toString() */
    }

    /** Line length from begin to end. */
    public double getLength() {
        return begin.distance(end);
    }
}
