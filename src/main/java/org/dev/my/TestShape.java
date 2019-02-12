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
                        + "Rectangle perimeter is %.2f%n"
                        + "Rectangle color is %s%n",
                rectangle.getArea(),
                rectangle.getPerimeter(),
                rectangle.getColor());
        Shape defRectangle = new Rectangle();
        System.out.println();
        System.out.println("=== Now showing default Rectangle ===");
        System.out.println();
        System.out.println(defRectangle);
        System.out.printf(
                "Default rectangle area is %.2f%n"
                        + "Default rectangle perimeter is %.2f%n"
                        + "Default rectangle color is %s%n",
                defRectangle.getArea(),
                defRectangle.getPerimeter(),
                defRectangle.getColor());
        Shape nullRectangle = new Rectangle(null);
        System.out.println();
        System.out.println("=== Now showing null Rectangle ===");
        System.out.println();
        System.out.println(nullRectangle);
        System.out.printf(
                "The null rectangle area is %.2f%n"
                        + "The null rectangle perimeter is %.2f%n"
                        + "The null rectangle color is %s%n",
                nullRectangle.getArea(),
                nullRectangle.getPerimeter(),
                nullRectangle.getColor());
        Shape lengthRectangle = new Rectangle(length);
        System.out.println();
        System.out.println("=== Now showing Rectangle by length ===");
        System.out.println();
        System.out.println(lengthRectangle);
        System.out.printf(
                "The length rectangle area is %.2f%n"
                        + "The length rectangle perimeter is %.2f%n"
                        + "The length rectangle color is %s%n",
                lengthRectangle.getArea(),
                lengthRectangle.getPerimeter(),
                lengthRectangle.getColor());
        double radius = 4.0;
        Shape circle = new Circle(radius, color);
        System.out.println();
        System.out.println("=== Now showing Circle ===");
        System.out.println();
        System.out.println(circle);
        System.out.printf(
                "Circle area is %.2f%n"
                        + "Circle circumference is %.2f%n"
                        + "Circle color is %s%n",
                circle.getArea(),
                /* getPerimeter() is a wrapper for getCircumference() in Circle */
                circle.getPerimeter(),
                circle.getColor());
    }
}
