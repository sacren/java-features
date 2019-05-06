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

    /** MovablePoint method to implement moving point up. */
    @Override
    public void moveUp() {
        axisY++;
    }

    /** MovablePoint method to implement moving point down. */
    @Override
    public void moveDown() {
        axisY--;
    }

    /** MovablePoint method to implement moving point left. */
    @Override
    public void moveLeft() {
        axisX--;
    }

    /** MovablePoint method to implement moving point right. */
    @Override
    public void moveRight() {
        axisX++;
    }

    /** MovablePoint instance printout. */
    public String toString() {
        return String.format("MovablePoint(%d, %d)", axisX, axisY);
    }
}
