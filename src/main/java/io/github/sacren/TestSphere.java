/**
 * Test driver for Sphere class.
 */
public class TestSphere {
    /** Sphere test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Default sphere not substituted ===");
        System.out.println();
        /* default sphere object not substituted */
        Sphere sp = new Sphere();
        System.out.println(sp);
        System.out.println();
        System.out.println("=== Default sphere substituted by Shape ===");
        System.out.println();
        /* substituted or upcast */
        Shape sp1 = new Sphere();
        System.out.println(sp1);
        System.out.println();
        System.out.println("=== Update sphere ===");
        System.out.println();
        /* downcast to Circle */
        Circle sp2 = (Circle) sp1;
        sp2.setRadius(sp2.getRadius() + 1);
        sp2.setColor("red");
        sp2.setCenter(new Point(1, 2));
        System.out.println(sp2);
        System.out.println();
        System.out.println("=== Update sphere again ===");
        System.out.println();
        /* downcast to Sphere */
        Sphere sp3 = (Sphere) sp1;
        sp3.setRadius(sp3.getRadius() + 1);
        sp3.setColor("scarlet");
        sp3.setCenter(new Point(3, 4));
        System.out.println(sp3);
        System.out.println();
        System.out.println("=== Favorite colors ===");
        System.out.println();
        Circle c = new Circle();
        Sphere s = new Sphere();
        System.out.printf(
                "Circle default color:  %s%n"
                        + "Circle favorite color: %S%n"
                        + "Sphere default color:  %s%n"
                        + "Sphere favorite color: %S%n"
                        + "Sphere favorite color: %s%n",
                c.getColor(),
                Circle.FAVORITE_COLOR,
                s.getColor(),
                Sphere.FAVORITE_COLOR,
                s.favColor());
    }
}
