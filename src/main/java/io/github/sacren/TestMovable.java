/**
 * Test driver for Movable interface.
 */
public class TestMovable {
    /** Movable interface test driver. */
    public static void main(String[] args) {
        /* default MovablePoint */
        Movable p = new MovablePoint();
        System.out.println();
        System.out.println("=== Start point ===");
        System.out.println();
        System.out.println(p);
        System.out.println();
        System.out.println("=== Move up ===");
        System.out.println();
        p.moveUp();
        System.out.println(p);
        System.out.println();
        System.out.println("=== Move right ===");
        System.out.println();
        p.moveRight();
        System.out.println(p);
        /* custom MovablePoint */
        Movable p4 = new MovablePoint(new Duo(1, 2));
        System.out.println();
        System.out.println("=== Start point ===");
        System.out.println();
        System.out.println(p4);
        System.out.println();
        System.out.println("=== Move down ===");
        System.out.println();
        p4.moveDown();
        System.out.println(p4);
        System.out.println();
        System.out.println("=== Move left ===");
        System.out.println();
        p4.moveLeft();
        System.out.println(p4);
        /* downcast to MovablePoint */
        MovablePoint p1 = (MovablePoint)p;
        System.out.println();
        System.out.println("=== Downcast ===");
        System.out.println();
        System.out.println(p1);
        System.out.println();
        System.out.println("=== Move up ===");
        System.out.println();
        p1.moveUp();
        System.out.println(p1);
        /* upcast to Movable again */
        Movable p2 = (Movable)p1;
        System.out.println();
        System.out.println("=== Upcast ===");
        System.out.println();
        System.out.println(p2);
        System.out.println();
        System.out.println("=== Move right ===");
        System.out.println();
        p2.moveRight();
        System.out.println(p2);
    }
}
