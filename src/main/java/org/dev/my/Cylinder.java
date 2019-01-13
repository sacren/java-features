/**
 * Cylinder class extends Circle class
 *
 * <p>Private data with default value:
 * -height:double = 1.0
 *
 * <p>Constructor:
 * +Cylinder()
 * +Cylinder(radius:double, height:double)
 * +Cylinder(radius:double, height:double, color:String)
 *
 * <p>Public methods:
 * +getHeight():double
 * +setHeight(height:double):void
 * +getSurfaceArea():double
 * +getVolume():double
 * +toString():String
 */
public class Cylinder extends Circle {
    /* public static data */
    public static final double DEFAULT_HEIGHT = 1.0;

    /* private instance data */
    private double height;

    public Cylinder() {
        super(); /* execute Circle() */
        this.height = DEFAULT_HEIGHT;
    }

    public Cylinder(double radius, double height) {
        super(radius); /* execute Circle(radius) */
        setHeight(height);
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color); /* execute Circle(radius, color) */
        setHeight(height);
    }

    /** Public accessor for height attribute. */
    public double getHeight() {
        return height;
    }

    /** Public mutator for height attribute. */
    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", height));
        }
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
        return String.format(
                "[Cylinder (Radius=%.2f, Height=%.2f)]%n",
                getRadius(), height);
    }
}
