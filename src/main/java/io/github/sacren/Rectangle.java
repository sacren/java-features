/**
 * Rectangle subclass extends Shape superclass.
 *
 * <p>Private instance data with default values:
 * -length:double = 2.0f
 * -width:double = 1.0f
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
    private static final double DEFAULT_LENGTH = 2.0f;
    private static final double DEFAULT_WIDTH = 1.0f;

    /* private instance data */
    private double length;
    private double width;

    /** Rectangle default constructor. */
    public Rectangle() {
        super(DEFAULT_COLOR);
        length = DEFAULT_LENGTH;
        width = DEFAULT_WIDTH;
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
        super(DEFAULT_COLOR);
        setSides(length, width);
    }

    /** Rectangle constructor with Point instance. */
    public Rectangle(Point p) {
        super(DEFAULT_COLOR);
        setSides(p.getX(), p.getY());
    }

    /** Rectangle constructor with color, lenghth and width. */
    public Rectangle(String color, double length, double width) {
        super(color);
        setSides(length, width);
    }

    /** Rectangle constructor with color and Point instance. */
    public Rectangle(String color, Point p) {
        super(color);
        setSides(p.getX(), p.getY());
    }

    /** Rectangle getter for length. */
    public double getLength() {
        return length;
    }

    /** Rectangle setter for length. */
    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", length));
        }
        this.length = length;
    }

    /** Rectangle getter for width. */
    public double getWidth() {
        return width;
    }

    /** Rectangle setter for width. */
    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", width));
        }
        this.width = width;
    }

    /** Rectangle setter for both sides. */
    public void setSides(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    /** Rectangle method for area. */
    @Override
    public double getArea() {
        return length * width;
    }

    /** Rectangle method for perimeter. */
    @Override
    public double getPerimeter() {
        return (length + width) * 2;
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
                length,
                width,
                getArea(),
                getPerimeter());
    }
}
