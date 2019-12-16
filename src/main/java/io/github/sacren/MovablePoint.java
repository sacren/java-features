/**
 * MovablePoint subclass by Movable interface.
 *
 * <p>Private data:
 * -mp:Duo
 *
 * <p>Constructor:
 * +MovablePoint()
 * +MovablePoint(mp:Duo)
 *
 * <p>Public methods:
 * +setMovablePoint(mp:Duo):void
 * +moveUp():void
 * +movdeDown():void
 * +moveLeft():void
 * +moveRight():void
 * +toString():String
 */
public class MovablePoint implements Movable {
    /* private instance data */
    private Duo mp;

    /** MovablePoint default constructor. */
    public MovablePoint() {
        mp = new Duo();
    }

    /** MovablePoint custom constructor. */
    public MovablePoint(Duo mp) {
        this();
        setMovablePoint(mp);
    }

    /** MovalbePoint setter for mp. */
    public void setMovablePoint(Duo mp) {
        this.mp.setFirst(mp.getFirstInt());
        this.mp.setSecond(mp.getSecondInt());
    }

    /** MovablePoint method to move up the point. */
    @Override
    public void moveUp() {
        mp.setSecond(mp.getSecondInt() + 1);
    }

    /** MovablePoint method to move down the point. */
    @Override
    public void moveDown() {
        mp.setSecond(mp.getSecondInt() - 1);
    }

    /** MovablePoint method to move the point left. */
    @Override
    public void moveLeft() {
        mp.setFirst(mp.getFirstInt() - 1);
    }

    /** MovablePoint method to move the point right. */
    @Override
    public void moveRight() {
        mp.setFirst(mp.getFirstInt() + 1);
    }

    /** MovablePoint string method. */
    public String toString() {
        return String.format("%s", mp);
    }
}
