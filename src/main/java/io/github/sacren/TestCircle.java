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
        System.out.println();
        System.out.println("=== A pink circle ===");
        System.out.println();
        /* circle with custom center, radius and color */
        Point center = new Point(45, 101);
        System.out.println(new Circle(center, 6, "pink"));
    }
}
