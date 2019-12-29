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
        System.out.println("=== Update cylinder of Cylinder ===");
        System.out.println();
        /* inheritance */
        c1.setRadius(c1.getRadius() + 1);
        c1.setHeight(c1.getHeight() + 1);
        c1.setColor("black");
        System.out.println(c1);
        System.out.println();
        System.out.println("=== Show cylinder base area ===");
        System.out.println();
        System.out.printf("Cylinder base area: %.2f%n", c1.circleArea());
        System.out.println();
        System.out.println("=== Default cylinder of Shape ===");
        System.out.println();
        /* default Cylinder by Shape */
        Shape c2 = new Cylinder();
        System.out.println(c2);
        System.out.println();
        System.out.println("=== Update cylinder of Shape ===");
        System.out.println();
        /* polymorphism */
        c2.setColor("white");
        /*
         * this breaks:
         *
         * c2.setHeight(c2.getHeight() + 1);
         */
        System.out.println(c2);
    }
}
