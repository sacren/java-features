/**
 * Circle is composed of Point and extends Shape.
 *
 * <p>Private instance data with default values:
 * -center:Point = {0, 0}
 * -radius:double = 1.0
 *
 * <p>Constructor:
 * +Circle()
 * +Circle(radius:double)
 * +Circle(radius:double, color:String)
 * +Circle(centerX:int, centerY:int, radius:double)
 * +Circle(center:Point, radius:double)
 * +Circle(center:Point, radius:double, color:String)
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
    private static int count;

    /* private instance data */
    private Point center;
    private double radius;

    /** Circle constructor with default data. */
    public Circle() {
        super("green"); /* circle instance default color */
        center = new Point();
        radius = 1;
        count++;
    }

    /** Circle constructor with custom radius only. */
    public Circle(double radius) {
        this();
        setRadius(radius);
    }

    /** Circle constructor with custom color and radius. */
    public Circle(double radius, String color) {
        this(radius);
        setColor(color);
    }

    /** Circle constructor using Point. */
    public Circle(Point center, double radius) {
        this(radius);
        this.center = center;
    }

    /** Circle constructor with int pair for Point. */
    public Circle(int centerX, int centerY, double radius) {
        this(new Point(centerX, centerY), radius);
    }

    /** Circle constructor with center, color and radius. */
    public Circle(Point center, double radius, String color) {
        this(center, radius);
        setColor(color);
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
        return Math.PI * getDiameter();
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
                "Instance count: %d%n"
                        + "Radius:         %.2f%n"
                        + "Diameter:       %.2f%n"
                        + "Circumference:  %.2f%n"
                        + "Area:           %.2f%n"
                        + "Color:          %s%n"
                        + "Center:         %s",
                count,
                radius,
                getDiameter(),
                getCircum(),
                getArea(),
                getColor(),
                center);
    }
}
