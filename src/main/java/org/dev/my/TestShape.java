/**
 * Test driver of Shape abstract superclass.
 */
public class TestShape {
    /** Test various shapes. */
    public static void main(String[] args) {
        double length = 3.0;
        double width = 2.0;
        String color = "red";
        Shape rectangle = new Rectangle(color, length, width);
        System.out.println(rectangle);
        System.out.printf(
                "Rectangle area is %.2f%n"
                        + "Rectangle perimeter is %.2f%n",
                rectangle.getArea(),
                rectangle.getPerimeter());
        Shape defRectangle = new Rectangle();
        System.out.println();
        System.out.println("Now showing default rectangle.");
        System.out.println();
        System.out.println(defRectangle);
        System.out.printf(
                "Default rectangle area is %.2f%n",
                defRectangle.getArea());
        double radius = 4.0;
        Shape circle = new Circle(radius, color);
        System.out.println();
        System.out.println(circle);
        System.out.printf(
                "Circle area is %.2f%n"
                        + "Circle circumference is %.2f%n",
                circle.getArea(),
                /* getPerimeter() is a wrapper for getCircumference() in Circle */
                circle.getPerimeter());
    }
}
