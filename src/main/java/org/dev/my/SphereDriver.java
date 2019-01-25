/**
 * Sphere driver.
 */
import java.util.Scanner;

public class SphereDriver {
    /** Prompt the user for the radius and initialize object. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        double radius;
        System.out.print("Enter the sphere radius: ");
        radius = inStream.nextDouble();
        inStream.close();

        Sphere sphere = new Sphere(radius);
        System.out.println();
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
        /* shows the favorite color defined in superclass */
        System.out.printf(
                "Circle favorite color is %s.%n",
                sphere.getFavoriteColor());
    }
}
