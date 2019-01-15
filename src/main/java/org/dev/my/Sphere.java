/**
 * Sphere extends Circle.
 *
 * <p>Constructor:
 * +Sphere()
 * +Sphere(radius:double)
 *
 * <p>Public methods:
 * +getArea():double
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

    /** Public method for sphere surface area. */
    @Override
    public double getArea() { /* override getArea() from super class */
        return super.getArea() * 4; /* use getArea() from super class */
    }

    /** Public method using inheritance. */
    public double getVolume() {
        return Math.PI * super.getRadius() * super.getRadius() * super.getRadius() * 4 / 3;
    }

    /** Public method for Sphere description. */
    public String toString() {
        return String.format("[Sphere (Radius=%.2f)]%n", super.getRadius());
    }
}
