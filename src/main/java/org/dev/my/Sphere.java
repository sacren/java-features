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
    /* public static data */
    public static final String FAVORITE_COLOR = "blue";

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

    /** Public method for favorite color of Circle superclass. */
    public String getFavoriteColor() {
        return super.FAVORITE_COLOR; /* hides FAVORITE_COLOR defined here */
    }

    /** Public method for Sphere favorite color. */
    @Override
    public String getColor() {
        return FAVORITE_COLOR;
    }

    /** Sphere description. */
    @Override
    public String toString() {
        return String.format(
                "[Sphere (Radius=%.2f, Area=%.2f)]%n",
                super.getRadius(), getArea());
    }
}
