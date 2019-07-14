/**
 * Test driver for Sphere class.
 */
public class TestSphere {
    /** Sphere test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Default sphere ===");
        System.out.println();
        /* default sphere */
        System.out.println(new Sphere());
        System.out.println();
        System.out.println("=== Default sphere of Shape ===");
        System.out.println();
        Shape c1 = new Sphere();
        System.out.println(c1);
    }
}
