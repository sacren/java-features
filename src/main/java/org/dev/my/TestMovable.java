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
        /* downcast to MovablePoint */
        MovablePoint p = (MovablePoint)movablePoint;
        System.out.println();
        System.out.println("=== Downcast ===");
        System.out.println();
        System.out.println(p);
        System.out.println();
        System.out.println("=== Move up ===");
        System.out.println();
        p.moveUp();
        System.out.println(p);
        /* upcast to Movable again */
        Movable p1 = (Movable)p;
        System.out.println();
        System.out.println("=== Upcast ===");
        System.out.println();
        System.out.println(p1);
        System.out.println();
        System.out.println("=== Move right ===");
        System.out.println();
        p1.moveRight();
        System.out.println(p1);
    }
}
