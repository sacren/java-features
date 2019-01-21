/**
 * Circle driver
 *
 * Prompt user for the radius of a circle in floating point number, compute the
 * diameter, circumference, and area of the circle in double and print the
 * values rounded to 2 decimal places.
 *
 * This driver also uses Sphere and Cylinder instances.
 */
import java.util.Scanner;

public class CircleDriver {
    /** Prompt the user for input. */
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = inputStream.nextDouble();
        System.out.print("Enter the height: ");
        double height = inputStream.nextDouble();
        inputStream.close();
        runCircle(radius, height);
    }

    private static void runCircle(double radius, double height) {
        Circle defaultCircle = new Circle();
        Circle userCircle = new Circle(radius);
        Sphere userSphere = new Sphere(radius);
        Cylinder userCylinder = new Cylinder(radius, height);
        System.out.println();
        System.out.print(userCircle);
        System.out.printf(
                "The default circle color is %s%n"
                        + "The user circle color is %s%n"
                        + "The default diameter is %.2f%n"
                        + "The user diameter is %.2f%n"
                        + "The default circumference is %.2f%n"
                        + "The user circumference is %.2f%n"
                        + "The default area is %.2f%n"
                        + "The user area is %.2f%n%n",
                defaultCircle.getColor(),
                userCircle.getColor(),
                defaultCircle.getDiameter(), /* default circle diameter */
                userCircle.getDiameter(), /* custome circle diameter */
                defaultCircle.getCircumference(), /* default circle circumference */
                userCircle.getCircumference(), /* custome circle circumference */
                defaultCircle.getArea(), /* default circle area */
                userCircle.getArea()); /* custome circle area */
        System.out.print(userSphere);
        System.out.printf(
                "The surface area is %.2f%n"
                        + "The volume is %.2f%n%n",
                userSphere.getSurfaceArea(), /* custom sphere surface area */
                userSphere.getVolume()); /* custom sphere volume */
        System.out.print(userCylinder);
        System.out.printf(
                "The base area is %.2f%n"
                        + "The surface area is %.2f%n"
                        + "The volume is %.2f%n%n",
                userCylinder.getArea(), /* custom cylinder base area */
                userCylinder.getSurfaceArea(), /* custome cylinder surface area */
                userCylinder.getVolume()); /* custome cylinder volume */
        /* Triple the radius and change circle color. */
        userCircle.setRadius(radius * 3);
        userSphere.setRadius(radius * 3);
        userCylinder.setRadius(radius * 3);
        userCircle.setColor(Circle.FAVORITE_COLOR);
        System.out.printf("[After circle radius and color are reset]%n%n");
        System.out.print(userCircle);
        System.out.printf(
                "The circle color now is %s%n"
                        + "The user diameter is %.2f%n"
                        + "The user circumference is %.2f%n"
                        + "The user area is %.2f%n%n",
                userCircle.getColor(),
                userCircle.getDiameter(),
                userCircle.getCircumference(),
                userCircle.getArea());
        System.out.print(userSphere);
        System.out.printf(
                "The surface area is %.2f%n"
                        + "The volume is %.2f%n%n",
                userSphere.getSurfaceArea(),
                userSphere.getVolume());
        System.out.print(userCylinder);
        System.out.printf(
                "The base area is %.2f%n"
                        + "The surface area is %.2f%n"
                        + "The volume is %.2f%n",
                userCylinder.getArea(),
                userCylinder.getSurfaceArea(),
                userCylinder.getVolume());
    }
}
