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
        System.out.println(new Circle());
        /* default circle by Shape */
        System.out.println();
        System.out.println("=== Default circle by Shape ===");
        System.out.println();
        Shape c1 = new Circle();
        System.out.println(c1);
        System.out.println();
        System.out.println("=== Calling default circle methods ===");
        System.out.println();
        System.out.printf(
                "Circle area:          %.2f%n"
                        + "Circle circumference: %.2f%n"
                        + "Circle color:         %s%n"
                        + "Circle center:        %s%n",
                c1.getArea(),
                c1.getPerimeter(),
                c1.getColor(),
                ((Circle)c1).getCenter());
        /* circle with custom radius */
        System.out.println();
        System.out.println("=== Circle with radius ===");
        System.out.println();
        Shape c2 = new Circle(98);
        System.out.println(c2);
        /* downcast to Circle */
        System.out.println();
        System.out.println("=== Downcast to Circle ===");
        System.out.println();
        Circle c3 = (Circle) c2;
        System.out.println(c3);
        System.out.println();
        System.out.println("=== Calling custom circle methods ===");
        System.out.println();
        System.out.printf(
                "Circle area:          %.2f%n"
                        + "Circle circumference: %.2f%n"
                        + "Circle color:         %s%n"
                        + "Circle center:        %s%n",
                c2.getArea(),
                c2.getPerimeter(),
                c2.getColor(),
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
        c4.setCenter(new Point(center.getX(), 202));
        c4.setRadius(7);
        System.out.println(c4);
        System.out.println();
        System.out.println("=== Calling circle methods after update ===");
        System.out.println();
        System.out.printf(
                "Circle radius:        %.2f%n"
                        + "Circle diameter:      %.2f%n"
                        + "Circle circumference: %.2f%n"
                        + "Circle area:          %.2f%n"
                        + "Circle color:         %s%n"
                        + "Circle center:        %s",
                c4.getRadius(),
                c4.getDiameter(),
                c4.getCircum(),
                c4.getArea(),
                c4.getColor(),
                c4.getCenter());
    }
}
