/**
 * Sphere extends Circle.
 *
 * <p>Constructor:
 * +Sphere()
 * +Sphere(radius:double)
 *
 * <p>Public methods:
 * +getSurfaceArea():double
 * +getVolume():double
 * +toString():String
 */
public class Sphere extends Circle {
    /** Default constructor by inheritance. */
    public Sphere() {
        super();
    }

    /** Custom constructor by inheritance. */
    public Sphere(double radius) {
        super(radius);
    }

    /** Public method using inheritance. */
    public double getSurfaceArea() {
        return getArea() * 4;
    }

    /** Public method using inheritance. */
    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * getRadius() * 4 / 3;
    }

    /** Public method for Sphere description. */
    public String toString() {
        return String.format("[Sphere (Radius=%.2f)]%n", getRadius());
    }
}
