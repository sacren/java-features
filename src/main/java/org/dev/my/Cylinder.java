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
 * +getBaseArea():double
 * +getArea():double
 * +getVolume():double
 * +toString():String
 */
public class Cylinder extends Circle {
    /* public static data */
    public static final double DEFAULT_HEIGHT = 1.0;

    /* private instance data */
    private double height;

    /** Default constructor for cylinder. */
    public Cylinder() {
        super(); /* execute Circle() */
        this.height = DEFAULT_HEIGHT;
    }

    /** Custom constructor for cylinder. */
    public Cylinder(double radius, double height) {
        super(radius); /* execute Circle(radius) */
        setHeight(height);
    }

    /** Custom constructor for cylinder with all parameters. */
    public Cylinder(double radius, double height, String color) {
        super(radius, color); /* execute Circle(radius, color) */
        setHeight(height);
    }

    /** getter for cylinder height. */
    public double getHeight() {
        return height;
    }

    /** setter for cylinder height. */
    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", height));
        }
        this.height = height;
    }

    /** Public method for cylinder base area. */
    public double getBaseArea() {
        return super.getArea();
    }

    /** Public method for cylinder surface area. */
    @Override
    public double getArea() {
        /* from Circle's area and circumference */
        return super.getArea() * 2 + getCircumference() * height;
    }

    /** Public method for cylinder volume. */
    public double getVolume() {
        return super.getArea() * height; /* from Circle's area */
    }

    /** Cylinder instance description. */
    public String toString() {
        return String.format(
                "[Cylinder (Radius=%.2f, Height=%.2f, Color=%s)]%n",
                getRadius(), height, getColor());
    }
}
