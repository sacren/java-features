/**
 * Test driver for Triangle class.
 */
public class TestTriangle {
    /** Triangle test driver. */
    public static void main(String[] args) {
        /* default triangle */
        System.out.println();
        System.out.println("=== Default triangle ===");
        System.out.println();
        Triangle t1 = new Triangle();
        System.out.println(t1);
        System.out.println();
        System.out.println("=== Triangle with Point instance ===");
        System.out.println();
        /* custom triangle */
        Point p = new Point(t1.getBase() + 1, t1.getHeight());
        Triangle t2 = new Triangle(p);
        System.out.println(t2);
        System.out.println();
        System.out.println("=== Update triangle ===");
        System.out.println();
        t2.setBase(t2.getBase() + 1);
        t2.setColor("orange");
        System.out.println(t2);
    }
}
