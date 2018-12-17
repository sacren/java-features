/**
 * Circle class
 *
 * <p>Private data with default values:
 * -radius:double = 1.0
 * -color:String = "red"
 *
 * <p>Constructor:
 * +Circle()
 * +Circle(radius:double)
 * +Circle(radius:double, color:String)
 *
 * <p>Public methods:
 * +getRadius():double
 * +getArea():double
 * +setRadius(radius:double):void
 * +toString():String
 */
public class Circle {
    /* public static data */
    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR = "green";
    public static final String FAVORITE_COLOR = "pink";

    /* private data */
    private double radius;
    private String color;

    /** Default constructor initializing instance attributes. */
    public Circle() {
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }

    /** Constructor initializing attributes both default and customized. */
    public Circle(double radius) {
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }

    /** Constructor for fully customized instance. */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /** Public accessor for private radius. */
    public double getRadius() {
        return radius;
    }

    /** Public mutator for private radius. */
    public void setRadius(double radius) {
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

    /** Public method for Circle description. */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
