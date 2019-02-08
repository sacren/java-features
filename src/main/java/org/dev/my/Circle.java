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
    public static final String FAVORITE_COLOR = "pink";

    /* private static data */
    private static final double DEFAULT_RADIUS = 1.0;
    private static final String DEFAULT_COLOR = "green";

    /* private instance data */
    private Point center;
    private double radius;
    private String color;

    /** Circle constructor with default data. */
    public Circle() {
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }

    /** Circle constructor with mixed default and customized data. */
    public Circle(double radius) {
        setRadius(radius);
        this.color = DEFAULT_COLOR;
    }

    /** Circle constructor with all customized data. */
    public Circle(double radius, String color) {
        setRadius(radius);
        this.color = color;
    }

    /** Circle constructor with int pair for Point data. */
    public Circle(int centerX, int centerY, double radius) {
        center = new Point(centerX, centerY);
        setRadius(radius);
    }

    /** Circle constructor directly using Point. */
    public Circle(Point center, double radius) {
        this.center = center;
        setRadius(radius);
    }

    /** getter for Circle radius. */
    public double getRadius() {
        return radius;
    }

    /** setter of Circle radius. */
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", radius));
        }
        this.radius = radius;
    }

    /** getter for Circle color. */
    public String getColor() {
        return color;
    }

    /** setter for Circle color. */
    public void setColor(String color) {
        this.color = color;
    }

    /** Circle public method for circle diameter. */
    public double getDiameter() {
        return radius * 2;
    }

    /** Circle public method for circle circumference. */
    public double getCircumference() {
        return radius * 2 * Math.PI;
    }

    /** Circle public method for circle area. */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /** getter for Circle center Point data. */
    public Point getCenter() {
        return center;
    }

    /** setter for Circle center Point data. */
    public void setCenter(Point center) {
        this.center = center;
    }

    /** Circle description. */
    public String toString() {
        return String.format(
                "[Circle (Radius=%.2f, Color=%s, Center=%s)]%n",
                radius, color, center);
    }
}
