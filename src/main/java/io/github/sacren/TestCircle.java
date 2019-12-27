/**
 * Test driver for Circle class.
 */
public class TestCircle {
    /** Circle test driver. */
    public static void main(String[] args) {
        /* default circle by Shape */
        System.out.println();
        System.out.println("=== Default circle ===");
        System.out.println();
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println();
        System.out.println("=== Update default circle center ===");
        System.out.println();
        c1.setCenter(new Point(-3, 16));
        System.out.println(c1);
        /* circle with custom radius */
        System.out.println();
        System.out.println("=== Circle with radius ===");
        System.out.println();
        Shape c2 = new Circle(c1.getRadius() + 4);
        System.out.println(c2);
        /* downcast to Circle */
        System.out.println();
        System.out.println("=== Downcast to Circle ===");
        System.out.println();
        Circle c3 = (Circle) c2;
        c3.setColor("yellow");
        System.out.println(c3);
        System.out.println();
        System.out.println("=== Calling Circle methods ===");
        System.out.println();
        System.out.printf(
                "Circle radius:        %.2f%n"
                        + "Circle diameter:      %.2f%n"
                        + "Circle circumference: %.2f%n"
                        + "Circle area:          %.2f%n"
                        + "Circle color:         %s%n"
                        + "Circle center:        %s%n",
                c3.getRadius(),
                c3.diameter(),
                c2.perimeter(), /* overridden */
                c2.area(), /* overridden */
                c2.getColor(), /* Shape method */
                c3.getCenter());
        System.out.println();
        System.out.println("=== A pink circle ===");
        System.out.println();
        /* circle with custom center, radius and color */
        Point center = new Point(45, 101);
        Circle c4 = new Circle(center, 6, "pink");
        System.out.println(c4);
        System.out.println();
        System.out.println("=== Update pink circle ===");
        System.out.println();
        center.setSecond(center.getSecondDbl() + 1);
        c4.setCenter(center);
        c4.setRadius(c4.getRadius() + 1);
        c4.setColor("white");
        System.out.println(c4);
        System.out.println();
        System.out.println("=== Distance between circles ===");
        System.out.println();
        System.out.printf(
                "%s to %s: %.2f%n"
                        + "%s to %s: %.2f%n",
                c3.getColor(),
                c4.getColor(),
                c3.distance(c4),
                c4.getColor(),
                c1.getColor(),
                c4.distance(c1));
    }
}
