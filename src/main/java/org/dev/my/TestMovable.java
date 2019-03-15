/**
 * Test driver for Movable interface.
 */
public class TestMovable {
    /** Movable point driver. */
    public static void main(String[] args) {
        final int axisX = 4;
        final int axisY = 18;
        Movable movablePoint = new MovablePoint(axisX, axisY);
        System.out.println();
        System.out.println(movablePoint);
        System.out.println();
        System.out.println("=== Move up ===");
        System.out.println();
        movablePoint.moveUp();
        System.out.println(movablePoint);
        System.out.println();
        System.out.println("=== Move right ===");
        System.out.println();
        movablePoint.moveRight();
        System.out.println(movablePoint);
        System.out.println();
        System.out.println("=== Move down ===");
        System.out.println();
        movablePoint.moveDown();
        System.out.println(movablePoint);
        System.out.println();
        System.out.println("=== Move left ===");
        System.out.println();
        movablePoint.moveLeft();
        System.out.println(movablePoint);
    }
}
