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
        double[] circleArray = computeCircle(radius);
        double[] sphereArray = computeSphere(radius);
        double[] cylinderArray = computeCylinder(radius, height);
        System.out.printf(
                "%nCircle:%n"
                        + "The diameter is %.2f%n"
                        + "The circumference is %.2f%n"
                        + "The area is %.2f%n"
                        + "%nSphere:%n"
                        + "The surface area is %.2f%n"
                        + "The volume is %.2f%n"
                        + "%nCylinder:%n"
                        + "The base area is %.2f%n"
                        + "The surface area is %.2f%n"
                        + "The volume is %.2f%n",
                circleArray[0], circleArray[1], circleArray[2], sphereArray[0], sphereArray[1],
                cylinderArray[0], cylinderArray[1], cylinderArray[2]);
    }

    /* Compute diameter, circumference, and area. */
    private static double[] computeCircle(double radius) {
        double[] circle = new double[3];
        circle[0] = radius * 2; /* diameter */
        circle[1] = circle[0] * Math.PI; /* circumference */
        circle[2] = Math.PI * radius * radius; /* area */
        return circle;
    }

    /* Compute sphere surface area and volume. */
    private static double[] computeSphere(double radius) {
        double[] sphere = new double[2];
        sphere[0] = Math.PI * radius * radius * 4; /* surface area */
        sphere[1] = Math.PI * radius * radius * radius * 4 / 3; /* volume */
        return sphere;
    }

    /* Compute cylinder base area, surface area and volume. */
    private static double[] computeCylinder(double radius, double height) {
        double[] cylinder = new double[3];
        cylinder[0] = Math.PI * radius * radius; /* base area */
        cylinder[1] = Math.PI * radius * 2 * height + cylinder[0] * 2; /* surface area */
        cylinder[2] = cylinder[0] * height; /* volume */
        return cylinder;
    }
}
