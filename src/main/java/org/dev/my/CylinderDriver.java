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
        System.out.println();
        System.out.print(userCylinder);
        System.out.println(":");
        System.out.printf(
                "The base area is %.2f%n"
                        + "The surface area is %.2f%n"
                        + "The volume is %.2f%n%n",
                userCylinder.getBaseArea(), /* custom cylinder base area */
                userCylinder.getSurfaceArea(), /* custome cylinder surface area */
                userCylinder.getVolume()); /* custome cylinder volume */
    }
}
