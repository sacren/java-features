/**
 * Test driver for Triangle class.
 */
public class TestTriangle {
    /** Triangle test driver. */
    public static void main(String[] args) {
        /* default Triangle */
        System.out.println();
        System.out.println("=== Default Triangle ===");
        System.out.println();
        Triangle t1 = new Triangle();
        System.out.println(t1);
        System.out.println();
        System.out.println("=== Triangle with Point instance ===");
        System.out.println();
        Point p = new Point(t1.getBase() + 1, t1.getHeight());
        Triangle t2 = new Triangle(p);
        System.out.println(t2);
    }
}
