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
        Duo p = new Duo(t1.getBase() + 1, t1.getHeight());
        Shape t2 = new Triangle(p);
        System.out.println(t2);
        System.out.println();
        System.out.println("=== Update triangle ===");
        System.out.println();
        Triangle t3 = (Triangle) t2;
        try {
            t3.setBase(t3.getBase() + 1);
            t3.setHeight(t3.getHeight() + 12);
        } catch (IllegalArgumentException excp) {
            excp.printStackTrace();
            System.out.println();
            System.out.println("=== Skip update ===");
            System.out.println();
        }
        t2.setColor("orange");
        System.out.println(t2);
        System.out.println();
        System.out.println("=== Different reference but same instance ===");
        System.out.println();
        System.out.println(t3);
    }
}
