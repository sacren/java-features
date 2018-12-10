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
        Circle defaultCircle = new Circle();
        Circle userCircle = new Circle(radius);
        double[] sphereArray = computeSphere(radius);
        double[] cylinderArray = computeCylinder(radius, height);
        System.out.printf(
                "%nCircle:%n"
                        + "The default diameter is %.2f%n"
                        + "The user diameter is %.2f%n"
                        + "The default circumference is %.2f%n"
                        + "The user circumference is %.2f%n"
                        + "The default area is %.2f%n"
                        + "The user area is %.2f%n%n"
                        + "Sphere:%n"
                        + "The surface area is %.2f%n"
                        + "The volume is %.2f%n%n"
                        + "Cylinder:%n"
                        + "The base area is %.2f%n"
                        + "The surface area is %.2f%n"
                        + "The volume is %.2f%n%n",
                defaultCircle.getDiameter(), /* default circle diameter */
                userCircle.getDiameter(), /* custome circle diameter */
                defaultCircle.getCircumference(), /* default circle circumference */
                userCircle.getCircumference(), /* custome circle circumference */
                defaultCircle.getArea(), /* default circle area */
                userCircle.getArea(), /* custome circle area */
                sphereArray[0], sphereArray[1],
                cylinderArray[0], cylinderArray[1], cylinderArray[2]);
        /* Triple the radius. */
        userCircle.setRadius(radius * 3);
        System.out.printf(
                "After the radius is trippled:%n"
                        + "The user diameter is %.2f%n"
                        + "The user circumference is %.2f%n"
                        + "The user area is %.2f%n",
                userCircle.getDiameter(),
                userCircle.getCircumference(),
                userCircle.getArea());
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
