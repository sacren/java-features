/**
 * Rectangle subclass extends Shape superclass.
 *
 * <p>Private instance data with default values:
 * -sides:Point = {2.0f, 1.0f}
 *
 * <p>Constructor:
 * +Rectangle()
 * +Rectangle(r:Rectangle)
 * +Rectangle(length:double)
 * +Rectangle(length:double, width:double)
 * +Rectangle(p:Point)
 * +Rectangle(color:String, length:double, width:double)
 * +Rectangle(color:String, p:Point)
 *
 * <p>Public methods:
 * +getLength():double
 * +setLength(length:double):void
 * +getWidth():double
 * +setWidth(width:double):void
 * +setSides(length:double, width:double):void
 * +getArea():double
 * +getPerimeter():double
 * +toString():String
 */
public class Rectangle extends Shape {
    /* private static data */
    private static String DEFAULT_COLOR = "cyan";

    /* private instance data */
    private Point sides;

    /** Rectangle default constructor. */
    public Rectangle() {
        super(DEFAULT_COLOR);
        sides = new Point(2.0f, 1.0f);
    }

    /** Rectangle default constructor with parameter place holder. */
    public Rectangle(Rectangle r) {
        this();
    }

    /** Rectangle constructor with length only. */
    public Rectangle(double length) {
        this();
        setLength(length);
    }

    /** Rectangle constructor with length and width. */
    public Rectangle(double length, double width) {
        this();
        setSides(length, width);
    }

    /** Rectangle constructor with Point instance. */
    public Rectangle(Point p) {
        this();
        setSides(p.getX(), p.getY());
    }

    /** Rectangle constructor with color, lenghth and width. */
    public Rectangle(String color, double length, double width) {
        this();
        setColor(color);
        setSides(length, width);
    }

    /** Rectangle constructor with color and Point instance. */
    public Rectangle(String color, Point p) {
        this();
        setColor(color);
        setSides(p.getX(), p.getY());
    }

    /** Rectangle getter for length. */
    public double getLength() {
        return sides.getX();
    }

    /** Rectangle setter for length. */
    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", length));
        }
        sides.setX(length);
    }

    /** Rectangle getter for width. */
    public double getWidth() {
        return sides.getY();
    }

    /** Rectangle setter for width. */
    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", width));
        }
        sides.setY(width);
    }

    /** Rectangle setter for both sides. */
    public void setSides(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    /** Rectangle method for area. */
    @Override
    public double getArea() {
        return sides.getX() * sides.getY();
    }

    /** Rectangle method for perimeter. */
    @Override
    public double getPerimeter() {
        return (sides.getX() + sides.getY()) * 2;
    }

    /** Rectangle instance printout. */
    public String toString() {
        return String.format(
                "Color:     %s%n"
                        + "Length:    %.2f%n"
                        + "Width:     %.2f%n"
                        + "Area:      %.2f%n"
                        + "Perimeter: %.2f",
                getColor(),
                getLength(),
                getWidth(),
                getArea(),
                getPerimeter());
    }
}
