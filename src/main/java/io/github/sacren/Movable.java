/**
 * Movable interface for MovablePoint subclass.
 *
 * <p>Public abstract methods:
 * +moveUp():void
 * +moveDown():void
 * +moveLeft():void
 * +moveRight():void
 */
public interface Movable {
    /** Movable interface method to move up the point. */
    void moveUp();

    /** Movable interface method to move down the point. */
    void moveDown();

    /** Movable interface method to move left the point. */
    void moveLeft();

    /** Movable interface method to move right the point. */
    void moveRight();
}
