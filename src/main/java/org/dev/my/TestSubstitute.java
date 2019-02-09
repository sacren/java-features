/**
 * Substitutability.
 *
 * <p>(1) Subclass instance can substitute superclass reference.
 *
 * <p>(2) Superclass methods can be invoked but not those of subclass.
 *
 * <p>(3) If superclass methods are overridden, subclass methods are used.
 */
public class TestSubstitute {
    /** Substitutability. */
    public static void main(String[] args) {
        double radius = 1;
        double height = 2;
        Circle circle = new Circle(radius);
        /* Subclass instance is converted to that of superclass */
        Circle substituteCircle = new Cylinder(radius, height);
        System.out.printf(
                "The circle radius is %.2f%n"
                        + "The substituted circle radius is %.2f%n%n"
                        + "The circle area is %.2f%n"
                        + "The substituted circle area is %.2f%n",
                circle.getRadius(),
                substituteCircle.getRadius(),
                circle.getArea(),
                substituteCircle.getArea());
    }
}
