/**
 * Cylinder class extends Circle class
 *
 * <p>Private data with default value:
 * -height:double = 1.0
 *
 * <p>Constructor:
 * +Cylinder()
 * +Cylinder(radius:double, height:double)
 *
 * <p>Public methods:
 * +getSurfaceArea(radius:double, height:double):double
 * +getVolume(radius:double):double
 * +toString():String
 */
public class Cylinder extends Circle {
    /* public static data */
    public static final double DEFAULT_HEIGHT = 1.0;

    /* private data */
    private double height;

    public Cylinder() {
        super(); /* execute Circle() */
        this.height = DEFAULT_HEIGHT;
    }

    public Cylinder(double radius, double height) {
        super(radius); /* execute Circle(radius) */
        this.height = height;
    }

    public double getSurfaceArea() {
        /* from Circle's area and circumference */
        return getArea() * 2 + getCircumference() * height;
    }

    public double getVolume() {
        return getArea() * height; /* from Circle's area */
    }

    /** Public method for Cylinder description. */
    public String toString() {
        return "Cylinder extends Circle";
    }
}
