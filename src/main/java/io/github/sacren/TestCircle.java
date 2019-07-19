/**
 * Test driver for Circle class.
 */
public class TestCircle {
    /** Circle test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Default circle ===");
        System.out.println();
        /* default circle */
        System.out.println(new Circle());
        System.out.println();
        System.out.println("=== A pink circle ===");
        System.out.println();
        /* circle with custom center, radius and color */
        Point center = new Point(45, 101);
        System.out.println(new Circle(center, 6, "pink"));
    }
}
