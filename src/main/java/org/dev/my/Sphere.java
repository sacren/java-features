/**
 * Sphere class
 *
 * <p>Private variable:
 * -radius:double = 1.0
 *
 * <p>Constructor:
 * +Sphere()
 * +Sphere(radius:double)
 *
 * <p>Public methods:
 * +getSurfaceArea():double
 * +getVolume():double
 * +setRadius(radius:double):void
 * +toString():String
 */
public class Sphere {
    /* public static data */
    public static final double DEFAULT_RADIUS = 1.0;

    /* private data */
    private double radius;

    public Sphere() {
        this.radius = DEFAULT_RADIUS;
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    /** Public accessor for private radius. */
    public double getRadius() {
        return radius;
    }

    /** Public mutator for private radius. */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return Math.PI * radius * radius * 4;
    }

    public double getVolume() {
        return Math.PI * radius * radius * radius * 4 / 3;
    }

    /** Public method for Sphere description. */
    public String toString() {
        return "Sphere[radius=" + radius + "]";
    }
}
