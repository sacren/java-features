/** Rectangle driver. */
import java.util.Scanner;

public class RectangleDriver {
    /** Prompt the user for input and test the driver. */
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.print("Enter rectangle length: ");
        float length = inputStream.nextFloat();
        System.out.print("Enter rectangle width: ");
        float width = inputStream.nextFloat();
        inputStream.close();
        printRectangle(length, width);
    }

    private static void printRectangle(float length, float width) {
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
