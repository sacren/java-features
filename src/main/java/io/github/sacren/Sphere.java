/**
 * Sphere class extends Circle.
 *
 * <p>Constructor:
 * +Sphere()
 * +Sphere(radius:double)
 *
 * <p>Public methods:
 * +getArea():double
 * +getVolume():double
 * +getFavColor():String
 * +toString():String
 */
public class Sphere extends Circle {
    /* public static data */
    public static final String FAVORITE_COLOR = "blue";

    /** Sphere default constructor. */
    public Sphere() {
        /* super(); */
        /* above automatically inserted */
    }

    /** Sphere constructor with radius. */
    public Sphere(double radius) {
        super(radius);
    }

    /** Sphere getter for surface area. */
    @Override
    public double getArea() { /* hide getArea() in Circle superclass */
        return super.getArea() * 4; /* use getArea() from Circle superclass */
    }

    /** Sphere getter for volume. */
    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * getRadius() * 4 / 3;
    }

    /** Sphere getter for favorite color. */
    public String getFavColor() {
        return FAVORITE_COLOR; /* hide Circle FAVORITE_COLOR */
    }

    /** Sphere string method. */
    @Override
    public String toString() {
        return String.format(
                "Radius:        %.2f%n"
                        + "Diameter:      %.2f%n"
                        + "Circumference: %.2f%n"
                        + "Area:          %.2f%n"
                        + "Volume:        %.2f%n"
                        + "Color:         %s%n"
                        + "Center:        %s",
                getRadius(),
                getDiameter(),
                getCircum(),
                getArea(),
                getVolume(),
                getColor(),
                getCenter());
    }
}
