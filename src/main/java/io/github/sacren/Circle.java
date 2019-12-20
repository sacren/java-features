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
 * +getCenter():Point
 * +diameter():double
 * +circumference():double
 * +perimeter():double
 * +area():double
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
        center = new Point(0, 0);
    }

    /** Circle setter for the center of circle. */
    public void setCenter(Point center) {
        this.center.setFirst(center.getFirstDbl());
        this.center.setSecond(center.getSecondDbl());
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

    /** Circle getter for the center of circle. */
    public Point getCenter() {
        return center;
    }

    /** Circle method for circle diameter. */
    public double diameter() {
        return radius * 2;
    }

    /** Circle method for circle circumference. */
    public double circumference() {
        return perimeter();
    }

    /** Circle method for circle circumference by diameter. */
    @Override
    public double perimeter() {
        return Math.PI * diameter();
    }

    /** Circle method for circle area. */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /** Circle method for distance from this circle to another. */
    public double distance(Circle another) {
        return center.distance(another.center);
    }

    /** Circle instance formatted string. */
    public String toString() {
        return String.format(
                "Center:         %s%n"
                        + "Radius:         %.2f%n"
                        + "Diameter:       %.2f%n"
                        + "Circumference:  %.2f%n"
                        + "Area:           %.2f%n"
                        + "Color:          %s%n"
                        + "Instance count: %d",
                center,
                radius,
                diameter(),
                circumference(),
                area(),
                getColor(),
                count);
    }
}
