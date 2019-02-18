/**
 * Test driver for Sphere class.
 */
import java.util.Scanner;

public class TestSphere {
    /** Test driver for Sphere. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        double radius;
        System.out.print("Enter the sphere radius: ");
        radius = inStream.nextDouble();
        inStream.close();

        /* default sphere */
        Sphere defaultSphere = new Sphere();
        System.out.println();
        System.out.printf("Default Sphere instance:%n%s%n", defaultSphere);

        /* custom sphere */
        Sphere sphere = new Sphere(radius);
        System.out.print(sphere);
        System.out.printf(
                "Sphere radius is %.2f%n"
                        + "Sphere surface area is %.2f%n"
                        + "Sphere volume is %.2f%n%n",
                sphere.getRadius(), sphere.getArea(), sphere.getVolume());

        System.out.printf("After sphere radius is doubled.%n%n");
        sphere.setRadius(radius * 2);
        System.out.print(sphere);
        System.out.printf(
                "Sphere radius is %.2f%n"
                        + "Sphere surface area is %.2f%n"
                        + "Sphere volume is %.2f%n%n",
                sphere.getRadius(), sphere.getArea(), sphere.getVolume());
        /* more examples of variable hide and override */
        System.out.printf(
                "Circle favorite color is %s.%n"
                        + "Sphere favorite color is %s.%n",
                sphere.getFavoriteColor(), /* favorite color defined in superclass */
                sphere.getColor());
    }
}
