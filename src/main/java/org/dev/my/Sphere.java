/**
 * Sphere class extends Circle class
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
public class Sphere extends Circle {
    public Sphere() {
        super();
    }

    public Sphere(double radius) {
        super(radius);
    }

    public double getSurfaceArea() {
        return getArea() * 4;
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * getRadius() * 4 / 3;
    }

    /** Public method for Sphere description. */
    public String toString() {
        return String.format("[Sphere (Radius=%.2f)]%n", getRadius());
    }
}
