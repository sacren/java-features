/**
 * Cylinder class
 *
 * <p>Private data with default value:
 * -radius:double = 1.0
 * -height:double = 1.0
 *
 * <p>Constructor:
 * +Cylinder()
 * +Cylinder(radius:double, height:double)
 *
 * <p>Public methods:
 * +getBaseArea(radius:double):double
 * +getSurfaceArea(radius:double, height:double):double
 * +getVolume(radius:double):double
 * +toString():String
 */
public class Cylinder {
    /* public static data */
    public static final double DEFAULT_RADIUS = 1.0;
    public static final double DEFAULT_HEIGHT = 1.0;

    /* private data */
    private double radius;
    private double height;

    public Cylinder() {
        this.radius = DEFAULT_RADIUS;
        this.height = DEFAULT_HEIGHT;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /** Public accessor for radius. */
    public double getRadius() {
        return radius;
    }

    /** Public mutator for radius. */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    public double getSurfaceArea() {
        return getBaseArea() * 2 + height * Math.PI * radius * 2;
    }

    public double getVolume() {
        return getBaseArea() * height;
    }

    /** Public method for Cylinder description. */
    public String toString() {
        return "Cylinder[radius=" + radius + " height=" + height + "]";
    }
}
