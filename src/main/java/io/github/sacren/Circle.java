/**
 * Circle class is composed of Point class.
 * Circle subclass extends Shape superclass.
 *
 * <p>Private data with default values:
 * -center:Point = {0, 0}
 * -radius:double = 1.0
 *
 * <p>Constructor:
 * +Circle()
 * +Circle(radius:double)
 * +Circle(radius:double, color:String)
 * +Circle(centerX:int, centerY:int, radius:double)
 * +Circle(center:Point, radius:double)
 *
 * <p>Public methods:
 * +getRadius():double
 * +setRadius(radius:double):void
 * +getDiameter():double
 * +getCircum():double
 * +getPerimeter():double
 * +getArea():double
 * +getCenter():Point
 * +setCenter(center:Point):void
 * +toString():String
 */
public class Circle extends Shape {
    /* public static data */
    public static final String FAVORITE_COLOR = "pink";

    /* private static data */
    private static final double DEFAULT_RADIUS = 1.0;
    private static final String DEFAULT_COLOR = "green";
    private static final Point DEFAULT_CENTER = new Point(0, 0);

    /* private instance data */
    private Point center;
    private double radius;

    /** Circle constructor with default data. */
    public Circle() {
        super(DEFAULT_COLOR);
        center = DEFAULT_CENTER;
        radius = DEFAULT_RADIUS;
    }

    /** Circle constructor with customized radius. */
    public Circle(double radius) {
        this();
        setRadius(radius);
    }

    /** Circle constructor with customized color and radisu. */
    public Circle(double radius, String color) {
        super(color);
        center = DEFAULT_CENTER;
        setRadius(radius);
    }

    /** Circle constructor with int pair for Point data. */
    public Circle(int centerX, int centerY, double radius) {
        super(DEFAULT_COLOR);
        center = new Point(centerX, centerY);
        setRadius(radius);
    }

    /** Circle constructor using Point. */
    public Circle(Point center, double radius) {
        super(DEFAULT_COLOR);
        this.center = center;
        setRadius(radius);
    }

    /** Circle constructor with center, color and radisu. */
    public Circle(Point center, double radius, String color) {
        super(color);
        this.center = center;
        setRadius(radius);
    }

    /** Circle getter for the radius of circle. */
    public double getRadius() {
        return radius;
    }

    /** Circle setter for the radius of circle. */
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", radius));
        }
        this.radius = radius;
    }

    /** Circle getter for circle diameter. */
    public double getDiameter() {
        return radius * 2;
    }

    /** Circle getter for circle circumference. */
    public double getCircum() {
        return getPerimeter();
    }

    /** Circle getter for circle perimeter. */
    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    /** Circle getter for circle area. */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /** Circle getter for the center of circle. */
    public Point getCenter() {
        return center;
    }

    /** Circle setter for the center of circle. */
    public void setCenter(Point center) {
        this.center = center;
    }

    /** Circle string method. */
    public String toString() {
        return String.format(
                "Radius: %.2f%n"
                        + "Color:  %s%n"
                        + "Center: %s",
                radius,
                getColor(),
                center);
    }
}
