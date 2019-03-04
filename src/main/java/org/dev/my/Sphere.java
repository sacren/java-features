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
        /* super(); */
        /* above automatically inserted */
    }

    /** Custom constructor by inheritance. */
    public Sphere(double radius) {
        super(radius);
    }

    /** Public method for sphere surface area. */
    @Override
    public double getArea() { /* hide getArea() in Circle superclass */
        return super.getArea() * 4; /* use getArea() from Circle superclass */
    }

    /** Public method using inheritance. */
    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * getRadius() * 4 / 3;
    }

    /** Sphere instance favorite color. */
    public String getFavoriteColor() {
        return FAVORITE_COLOR; /* hide Circle FAVORITE_COLOR */
    }

    /** Sphere instance description. */
    @Override
    public String toString() {
        return String.format(
                "[Sphere (Radius=%.2f, Area=%.2f, Volume=%.2f, Color=%s)]",
                getRadius(), getArea(), getVolume(), getColor());
    }
}
