/**
 * MovablePoint subclass implements Movable interface.
 *
 * <p>Private data:
 * -axisX:int
 * -axisY:int
 *
 * <p>Constructor:
 * +MovablePoint(axisX:int, axisY:int)
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
    private int axisX;
    private int axisY;

    /** MovablePoint constructor. */
    public MovablePoint(int axisX, int axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    /** MovablePoint implementation of moving point up. */
    @Override
    public void moveUp() {
        axisY++;
    }

    /** MovablePoint implementation of moving point down. */
    @Override
    public void moveDown() {
        axisY--;
    }

    /** MovablePoint implementation of moving point left. */
    @Override
    public void moveLeft() {
        axisX--;
    }

    /** MovablePoint implementation of moving point right. */
    @Override
    public void moveRight() {
        axisX++;
    }

    /** MovablePoint instance description. */
    public String toString() {
        return String.format("MovablePoint(%d, %d)", axisX, axisY);
    }
}
