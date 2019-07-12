/**
 * Test driver for Cylinder class.
 */
public class TestCylinder {
    /** Cylinder test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Default cylinder ===");
        System.out.println();
        /* default Cylinder */
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println();
        System.out.println("=== Default cylinder by Shape ===");
        System.out.println();
        /* default Cylinder by Shape */
        Shape c2 = new Cylinder();
        System.out.println(c2);
    }
}
