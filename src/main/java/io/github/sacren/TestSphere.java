/**
 * Test driver for Sphere class.
 */
public class TestSphere {
    /** Sphere test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Default sphere ===");
        System.out.println();
        /* default sphere of Sphere */
        System.out.println(new Sphere());
        System.out.println();
        System.out.println("=== Default sphere of Shape ===");
        System.out.println();
        /* substituted or upcast */
        Shape sp1 = new Sphere();
        System.out.println(sp1);
        System.out.println();
        System.out.println("=== Update sphere ===");
        System.out.println();
        /* downcast */
        Circle sp2 = (Circle) sp1;
        sp2.setRadius(sp2.getRadius() + 1);
        sp2.setColor("red");
        sp2.setCenter(new Point(1, 2));
        System.out.println(sp2);
        System.out.println();
        Sphere sp3 = (Sphere) sp1;
        sp3.setRadius(sp3.getRadius() + 1);
        sp3.setColor("scarlet");
        sp3.setCenter(new Point(3, 4));
        System.out.println(sp3);
    }
}
