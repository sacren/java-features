/**
 * Test driver for Cylinder class.
 */
import java.util.Scanner;

public class TestCylinder {
    /** Test driver for Cylinder. */
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        double radius;
        System.out.print("Enter cylinder radius: ");
        radius = inputStream.nextDouble();
        double height;
        System.out.print("Enter cylinder height: ");
        height = inputStream.nextDouble();
        inputStream.close();
        Cylinder yellowCylinder = new Cylinder(radius, height, "yellow");
        Cylinder userCylinder = new Cylinder(radius, height);
        Cylinder defaultCylinder = new Cylinder();
        System.out.println();
        System.out.print(defaultCylinder);
        System.out.printf(
                "Default cylinder base area is %.2f%n"
                        + "Default cylinder surface area is %.2f%n"
                        + "Default cylinder volume is %.2f%n"
                        + "Default cylinder color is %s%n",
                defaultCylinder.getBaseArea(), /* default cylinder base area */
                defaultCylinder.getArea(), /* default cylinder surface area */
                defaultCylinder.getVolume(), /* default cylinder volume */
                defaultCylinder.getColor());
        System.out.println();
        System.out.print(userCylinder);
        System.out.printf(
                "Custom cylinder base area is %.2f%n"
                        + "Custom cylinder surface area is %.2f%n"
                        + "Custom cylinder volume is %.2f%n"
                        + "Custom cylinder color is %s%n",
                userCylinder.getBaseArea(), /* custom cylinder base area */
                userCylinder.getArea(), /* custom cylinder surface area */
                userCylinder.getVolume(), /* custom cylinder volume */
                userCylinder.getColor());
        System.out.println();
        System.out.println("Now another cylinder with different color.");
        System.out.println();
        System.out.print(yellowCylinder);
        System.out.printf(
                "The cylinder base area is %.2f%n"
                        + "The cylinder surface area is %.2f%n"
                        + "The cylinder volume is %.2f%n"
                        + "The cylinder is %s%n",
                yellowCylinder.getBaseArea(),
                yellowCylinder.getArea(),
                yellowCylinder.getVolume(),
                yellowCylinder.getColor());
    }
}
