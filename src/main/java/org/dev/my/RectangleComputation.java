/** Print the area and perimeter of a rectangle. */
public class RectangleComputation {
    public static void main(String[] args) {
        printRectangle();
    }

    private static void printRectangle() {
        final double length = 3.4;
        final double width = 2.0;
        double area;
        double perimeter;

        area = length * width;
        perimeter = (length + width) * 2;

        System.out.println("The rectangle area is " + area);
        System.out.println("The rectangle perimeter is " + perimeter);
    }
}
