/**
 * Circle class
 *
 * <p>Two private instance variables:
 * Radius (of the type double) and color (of the type String), with default
 * value of 1.0 and "red", respectively.
 *
 * <p>Two overloaded constructors:
 * A default constructor with no argument, and a constructor which takes a
 * double argument for radius.
 *
 * <p>Two public methods:
 * getRadius() and getArea(), which return the radius and area of this
 * instance, respectively.
 */
public class Circle {
    private double radius;
    private String color;

    /** Default constructor initializing instance attributes. */
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    /**
     * Customized instructor initializing attributes both default and not
     * default.
     */
    public Circle(double size) {
        radius = size;
        color = "red";
    }

    /** Public instance method for radius. */
    public double getRadius() {
        return radius;
    }

    /** Public instance method for circle area. */
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
