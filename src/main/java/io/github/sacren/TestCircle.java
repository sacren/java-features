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
                c3.getDiameter(),
                c2.getPerimeter(), /* overridden */
                c2.getArea(), /* overridden */
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
        c4.setCenter(new Point(center.getX(), center.getY() + 1));
        c4.setRadius(c4.getRadius() + 1);
        c4.setColor("white");
        System.out.println(c4);
        System.out.println();
        System.out.println("=== Distance between circles ===");
        System.out.println();
        System.out.printf(
                "Green to White:   %.2f%n"
                        + "White to default: %.2f%n",
                c3.distance(c4),
                c4.distance(c1));
    }
}
