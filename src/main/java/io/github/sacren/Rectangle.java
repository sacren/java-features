/**
 * Rectangle subclass extends Shape superclass
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
 * +Rectangle(color:String, length:double, width:double)
 *
 * <p>Public methods:
 * +getLength():double
 * +setLength(length:double):void
 * +getWidth():double
 * +setWidth(width:double):void
 * +getArea():double
 * +getPerimeter():double
 * +toString():String
 *
 * <p>Private helper methods:
 * -setLengthWidth(length:double, width:double):void
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

    /** Rectangle constructor initializing length only. */
    public Rectangle(double length) {
        this();
        setLength(length);
    }

    /** Rectangle constructor initializing both length and width. */
    public Rectangle(double length, double width) {
        super(DEFAULT_COLOR);
        setLengthWidth(length, width);
    }

    /** Rectangle constructor initializing color, lenght and width. */
    public Rectangle(String color, double length, double width) {
        super(color);
        setLengthWidth(length, width);
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

    /* helper method for both setLength() and setWidth() */
    private void setLengthWidth(double length, double width) {
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
                "[Rectangle (Color=%s, Length=%.2f, Width=%.2f)]",
                getColor(), length, width);
    }
}
