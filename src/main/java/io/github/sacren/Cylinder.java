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
    /* private instance data */
    private double height;

    /** Cylinder default constructor. */
    public Cylinder() {
        super();
        height = 1;
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
        return getBaseArea() * 2 + getPerimeter() * height;
    }

    /** Public method for cylinder volume. */
    public double getVolume() {
        return getBaseArea() * height;
    }

    /** Cylinder string method. */
    public String toString() {
        return String.format(
                "Radius:       %.2f%n"
                        + "Height:       %.2f%n"
                        + "Color:        %s%n"
                        + "Base area:    %.2f%n"
                        + "Surface area: %.2f%n"
                        + "Volume:       %.2f",
                getRadius(),
                getHeight(),
                getColor(),
                getBaseArea(),
                getArea(),
                getVolume());
    }
}
