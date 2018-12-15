/** Print the area and perimeter of a rectangle. */
import java.util.Scanner;

public class RectangleComputation {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        float length;
        for ( ; ; ) {
            System.out.print("Enter rectangle length: ");
            length = inputStream.nextFloat();
            if (length >= 0) {
                break;
            }
            System.out.printf("%f is invalid. Try again.%n", length);
        }
        float width;
        for ( ; ; ) {
            System.out.print("Enter rectangle width: ");
            width = inputStream.nextFloat();
            if (width >= 0) {
                break;
            }
            System.out.printf("%f is invalid. Try again.%n", width);
        }
        inputStream.close();
        Rectangle rectangleInstance = new Rectangle(length, width);
        System.out.printf(
                "The rectangle area is %.2f%n"
                        + "The rectangle perimeter is %.2f%n",
                rectangleInstance.getArea(),
                rectangleInstance.getPerimeter());
    }
}
