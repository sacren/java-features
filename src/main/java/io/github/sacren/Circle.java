/**
 * Circle is composed of Point object and extends Shape.
 *
 * <p>Private instance variables with default value:
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
 * +setCenter():void
 * +setCenter(center:Point):void
 * +setRadius():void
 * +setRadius(radius:double):void
 * +getRadius():double
 * +getDiameter():double
 * +getCircum():double
 * +getPerimeter():double
 * +getArea():double
 * +getCenter():Point
 * +distance(another:Circle):double
 * +toString():String
 */
public class Circle extends Shape {
    /* public static variable */
    public static final String FAVORITE_COLOR = "pink";

    /* private static variable */
    private static int count;

    /* private instance variables */
    private Point center;
    private double radius;

    /** Circle default constructor. */
    public Circle() {
        super("green"); /* circle instance default color */
        setCenter();
        setRadius();
        count++;
    }

    /** Circle constructor with radius for parameter. */
    public Circle(double radius) {
        this();
        setRadius(radius);
    }

    /** Circle constructor with color and radius for parameters. */
    public Circle(double radius, String color) {
        this(radius);
        setColor(color);
    }

    /** Circle constructor using Point object. */
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

    /** Circle setter for the default center of circle. */
    public void setCenter() {
        center = new Point();
    }

    /** Circle setter for the center of circle. */
    public void setCenter(Point center) {
        this.center = new Point(center.getX(), center.getY());
    }

    /** Circle setter for the defaul radius of circle. */
    public void setRadius() {
        radius = 1;
    }

    /** Circle setter for the radius of circle. */
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", radius));
        }
        this.radius = radius;
    }

    /** Circle getter for the radius of circle. */
    public double getRadius() {
        return radius;
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

    /** Circle method for distance from this circle to another. */
    public double distance(Circle another) {
        return center.getDist(another.center);
    }

    /** Circle instance formatted string. */
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
