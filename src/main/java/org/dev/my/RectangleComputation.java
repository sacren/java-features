/** Print the area and perimeter of a rectangle. */
public class RectangleComputation {
    public static void main(String[] args) {
        final float length = 3.4f;
        final float width = 2.0f;
        Rectangle rectangleInstance = new Rectangle(length, width);
        System.out.println("The rectangle area is " + rectangleInstance.getArea());
        System.out.println("The rectangle perimeter is " + rectangleInstance.getPerimeter());
    }
}
