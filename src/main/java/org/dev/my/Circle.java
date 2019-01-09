/**
 * Circle class composed of Point class
 *
 * <p>Private data with default values:
 * -center:Point = {0, 0}
 * -radius:double = 1.0
 * -color:String = "red"
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
 * +getColor():String
 * +setColor(color:String):void
 * +getDiameter():double
 * +getCircumference():double
 * +getArea():double
 * +getCenter():Point
 * +setCenter(center:Point):void
 * +toString():String
 */
public class Circle {
    /* public static data */
    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR = "green";
    public static final String FAVORITE_COLOR = "pink";

    /* private data */
    private Point center;
    private double radius;
    private String color;

    /** Default constructor initializing instance attributes. */
    public Circle() {
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }

    /** Constructor initializing attributes both default and customized. */
    public Circle(double radius) {
        setRadius(radius);
        this.color = DEFAULT_COLOR;
    }

    /** Constructor for fully customized instance. */
    public Circle(double radius, String color) {
        setRadius(radius);
        this.color = color;
    }

    /** Custom constructor with values for Point. */
    public Circle(int centerX, int centerY, double radius) {
        center = new Point(centerX, centerY);
        this.radius = radius;
    }

    /** Custom constructor composed of Point. */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /** Public accessor for private radius. */
    public double getRadius() {
        return radius;
    }

    /** Public mutator for private radius. */
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", radius));
        }
        this.radius = radius;
    }

    /** Public accessor for private color. */
    public String getColor() {
        return color;
    }

    /** Public mutator for private color. */
    public void setColor(String color) {
        this.color = color;
    }

    /** Public method for circle diameter. */
    public double getDiameter() {
        return radius * 2;
    }

    /** Public method for circumference. */
    public double getCircumference() {
        return radius * 2 * Math.PI;
    }

    /** Public instance method for circle area. */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /** getter for center. */
    public Point getCenter() {
        return center;
    }

    /** setter for center. */
    public void setCenter(Point center) {
        this.center = center;
    }

    /** Public method for Circle description. */
    public String toString() {
        return String.format(
                "[Circle (Radius=%.2f, Color=%s, Center=%s)]%n",
                radius, color, center);
    }
}
