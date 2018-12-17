/**
 * Driver for Cylinder.
 */
import java.util.Scanner;

public class CylinderDriver {
    /** Prompt the user for input and instantiate. */
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        double radius;
        for ( ; ; ) {
            System.out.print("Enter cylinder radius: ");
            radius = inputStream.nextDouble();
            if (radius >= 0) {
                break;
            }
            System.out.printf("%f is invalid. Try again.%n", radius);
        }
        double height;
        for ( ; ; ) {
            System.out.print("Enter cylinder height: ");
            height = inputStream.nextDouble();
            if (height >= 0) {
                break;
            }
            System.out.printf("%f is invalid. Try again.%n", height);
        }
        inputStream.close();
        Cylinder userCylinder = new Cylinder(radius, height);
        Cylinder defaultCylinder = new Cylinder();
        System.out.println();
        System.out.print(defaultCylinder);
        System.out.println(":");
        System.out.printf(
                "The default base area is %.2f%n"
                        + "The default surface area is %.2f%n"
                        + "The default volume is %.2f%n%n",
                defaultCylinder.getBaseArea(), /* default cylinder base area */
                defaultCylinder.getSurfaceArea(), /* default cylinder surface area */
                defaultCylinder.getVolume()); /* default cylinder volume */
        System.out.print(userCylinder);
        System.out.println(":");
        System.out.printf(
                "The custom base area is %.2f%n"
                        + "The custom surface area is %.2f%n"
                        + "The custom volume is %.2f%n",
                userCylinder.getBaseArea(), /* custom cylinder base area */
                userCylinder.getSurfaceArea(), /* custom cylinder surface area */
                userCylinder.getVolume()); /* custom cylinder volume */
    }
}
