/**
 * Prompt user for the radius of a circle in floating point number, compute the diameter,
 * circumference, and area of the circle in double and print the values rounded to 2 decimal places.
 *
 * <p>Compute the same way for sphere and cylinder.
 */
import java.util.Scanner;

public class CircleComputation {
    /** Entry point to CircleComputation. */
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        double radius;
        for ( ; ; ) {
            System.out.print("Enter the radius: ");
            radius = inputStream.nextDouble();
            if (radius >= 0) {
                break;
            }
            System.out.printf("%f is invalid. Try again.%n", radius);
        }
        double height;
        for ( ; ; ) {
            System.out.print("Enter the height: ");
            height = inputStream.nextDouble();
            if (height >= 0) {
                break;
            }
            System.out.printf("%f is invalid. Try again.%n", height);
        }
        inputStream.close();
        computeCircle(radius);
        computeSphere(radius);
        computeCylinder(radius, height);
    }

    /** Compute diameter, circumference, and area. */
    public static void computeCircle(double radius) {
        double diameter = radius * 2;
        double circumference = diameter * Math.PI;
        double area = Math.PI * radius * radius;

        System.out.printf(
                "%nCircle:%n"
                        + "The diameter is %.2f%n"
                        + "The circumference is %.2f%n"
                        + "The area is %.2f%n",
                diameter, circumference, area);
    }

    /** Compute sphere surface area and volume. */
    public static void computeSphere(double radius) {
        double surfaceArea = Math.PI * radius * radius * 4;
        double volume = Math.PI * radius * radius * radius * 4 / 3;

        System.out.printf(
                "%nSphere:%n" + "The surface area is %.2f%n" + "The volume is %.2f%n",
                surfaceArea, volume);
    }

    /** Compute cylinder base area, surface area and volume. */
    public static void computeCylinder(double radius, double height) {
        double baseArea = Math.PI * radius * radius;
        double surfaceArea = Math.PI * radius * 2 * height + baseArea * 2;
        double volume = baseArea * height;

        System.out.printf(
                "%nCylinder:%n"
                        + "The base area is %.2f%n"
                        + "The surface area is %.2f%n"
                        + "The volume is %.2f%n",
                baseArea, surfaceArea, volume);
    }
}
