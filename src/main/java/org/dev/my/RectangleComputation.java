/** Print the area and perimeter of a rectangle. */
public class RectangleComputation {
    public static void main(String[] args) {
        final float length = 3.4f;
        final float width = 2.0f;
        Rectangle rectangleInstance = new Rectangle(length, width);
        System.out.printf(
                "The rectangle area is %.2f%n"
                        + "The rectangle perimeter is %.2f%n",
                rectangleInstance.getArea(),
                rectangleInstance.getPerimeter());
    }
}
