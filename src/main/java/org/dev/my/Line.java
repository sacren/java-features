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

    /** Line description. */
    public String toString() {
        return String.format(
                "From %s to %s",
                begin, /* invoke begin.toString */
                end); /* invoke end.toString */
    }

    /** Line length from begin to end. */
    public double getLength() {
        return begin.distance(end);
    }
}
