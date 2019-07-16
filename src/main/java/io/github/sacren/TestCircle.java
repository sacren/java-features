/**
 * Test driver for Circle class.
 */
public class TestCircle {
    /** Circle test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Default circle ===");
        System.out.println();
        /* default circle */
        Circle dc = new Circle();
        System.out.println(dc);
        /* default circle by Shape */
        System.out.println();
        System.out.println("=== Default circle substituted to Shape ===");
        System.out.println();
        Shape c1 = new Circle();
        System.out.println(c1);
        System.out.println();
        System.out.println("=== Calling Circle methods ===");
        System.out.println();
        /* availabe in Shape */
        System.out.printf(
                "Circle area:          %.2f%n"
                        + "Circle circumference: %.2f%n"
                        + "Circle color:         %s%n",
                c1.getArea(),
                c1.getPerimeter(),
                c1.getColor());
        /* circle with custom radius */
        System.out.println();
        System.out.println("=== Circle with radius ===");
        System.out.println();
        Shape c2 = new Circle(dc.getRadius() + 4);
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
        System.out.println("=== Calling Circle methods after update ===");
        System.out.println();
        System.out.printf(
                "Circle radius:        %.2f%n"
                        + "Circle diameter:      %.2f%n"
                        + "Circle circumference: %.2f%n"
                        + "Circle area:          %.2f%n"
                        + "Circle color:         %s%n"
                        + "Circle center:        %s%n",
                c4.getRadius(),
                c4.getDiameter(),
                c4.getCircum(),
                c4.getArea(),
                c4.getColor(),
                c4.getCenter());
    }
}
