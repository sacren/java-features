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
                "Rectangle area is %.2f%n",
                rectangle.getArea());
    }
}
