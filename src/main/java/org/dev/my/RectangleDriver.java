/** Rectangle driver. */
import java.util.Scanner;

public class RectangleDriver {
    /** Prompt the user for input and test the driver. */
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
        Rectangle defaultRectangle = new Rectangle();
        Rectangle rectangleNull = new Rectangle(null);
        Rectangle rectangleOfLength = new Rectangle(length);
        Rectangle rectangleInstance = new Rectangle(length, width);
        System.out.println();
        System.out.print(defaultRectangle);
        System.out.printf(
                "Default rectangle area is %.2f%n"
                        + "Default rectangle perimeter is %.2f%n",
                defaultRectangle.getArea(),
                defaultRectangle.getPerimeter());
        System.out.println();
        System.out.print(rectangleInstance);
        System.out.printf(
                "The rectangle area is %.2f%n"
                        + "The rectangle perimeter is %.2f%n",
                rectangleInstance.getArea(),
                rectangleInstance.getPerimeter());
        System.out.println();
        System.out.print(rectangleNull);
        System.out.printf(
                "The rectangle area is %.2f%n"
                        + "The rectangle perimeter is %.2f%n",
                rectangleNull.getArea(),
                rectangleNull.getPerimeter());
        System.out.println();
        System.out.print(rectangleOfLength);
        System.out.printf(
                "The rectangle area is %.2f%n"
                        + "The rectangle perimeter is %.2f%n",
                rectangleOfLength.getArea(),
                rectangleOfLength.getPerimeter());
    }
}
