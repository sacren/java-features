/**
 * MovablePoint subclass by Movable interface.
 *
 * <p>Private data:
 * -mp:Point
 *
 * <p>Constructor:
 * +MovablePoint()
 * +MovablePoint(mp:Point)
 *
 * <p>Public methods:
 * +moveUp():void
 * +movdeDown():void
 * +moveLeft():void
 * +moveRight():void
 * +toString():String
 */
public class MovablePoint implements Movable {
    /* private instance data */
    private Point mp;

    /** MovablePoint default constructor. */
    public MovablePoint() {
        mp = new Point();
    }

    /** MovablePoint custom constructor. */
    public MovablePoint(Point mp) {
        this.mp = mp;
    }

    /** MovablePoint method to move up the point. */
    @Override
    public void moveUp() {
        mp.setY(mp.getY() + 1);
    }

    /** MovablePoint method to move down the point. */
    @Override
    public void moveDown() {
        mp.setY(mp.getY() - 1);
    }

    /** MovablePoint method to move the point left. */
    @Override
    public void moveLeft() {
        mp.setX(mp.getX() - 1);
    }

    /** MovablePoint method to move the point right. */
    @Override
    public void moveRight() {
        mp.setX(mp.getX() + 1);
    }

    /** MovablePoint string method. */
    public String toString() {
        return String.format("%s", mp);
    }
}
