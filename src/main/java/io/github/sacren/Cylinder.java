/**
 * Cylinder subclass extends Circle superclass.
 *
 * <p>Private instance variable with default value:
 * -height:double = 1.0
 *
 * <p>Constructor:
 * +Cylinder()
 * +Cylinder(radius:double)
 * +Cylinder(radius:double, color:String)
 * +Cylinder(radius:double, height:double)
 * +Cylinder(radius:double, height:double, color:String)
 *
 * <p>Public methods:
 * +getHeight():double
 * +setHeight(height:double):void
 * +circleArea():double
 * +area():double
 * +getVolume():double
 * +toString():String
 */
public class Cylinder extends Circle {
    /* private instance variable */
    private double height;

    /** Cylinder default constructor. */
    public Cylinder() {
        super();
        height = 1;
    }

    /** Cylinder constructor with radius. */
    public Cylinder(double radius) {
        super(radius); /* execute Circle(radius) */
        height = 1;
    }

    /** Cylinder constructor with radius and color. */
    public Cylinder(double radius, String color) {
        super(radius, color);
        height = 1;
    }

    /** Cylinder constructor with radius and height. */
    public Cylinder(double radius, double height) {
        this(radius);
        setHeight(height);
    }

    /** Cylinder constructor with all parameters. */
    public Cylinder(double radius, double height, String color) {
        this(radius, color);
        setHeight(height);
    }

    /** Cylinder getter for height. */
    public double getHeight() {
        return height;
    }

    /** Cylinder setter for height. */
    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", height));
        }
        this.height = height;
    }

    /** Cylinder method for cylinder circle area. */
    public double circleArea() {
        return super.area();
    }

    /** Cylinder method for surface area. */
    @Override
    public double area() {
        return circleArea() * 2 + perimeter() * height;
    }

    /** Cylinder getter for volume. */
    public double getVolume() {
        return circleArea() * height;
    }

    /** Cylinder string method. */
    @Override
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
                circleArea(),
                area(),
                getVolume());
    }
}
