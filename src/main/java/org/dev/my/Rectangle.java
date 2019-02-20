/**
 * Rectangle subclass over Shape superclass
 *
 * <p>Private data with default values:
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
    private static double DEFAULT_LENGTH = 2.0f;
    private static double DEFAULT_WIDTH = 1.0f;

    /* private instance data */
    private double length;
    private double width;

    /** Default Rectangle constructor. */
    public Rectangle() {
        super(DEFAULT_COLOR);
        length = DEFAULT_LENGTH;
        width = DEFAULT_WIDTH;
    }

    /** Default Rectangle constructor with parameter place holder. */
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

    /** getter for rectangle length. */
    public double getLength() {
        return length;
    }

    /** setter for rectangle length. */
    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", length));
        }
        this.length = length;
    }

    /** getter for rectangle width. */
    public double getWidth() {
        return width;
    }

    /** setter for rectangle width. */
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

    /** Public method for rectangle area. */
    @Override
    public double getArea() {
        return length * width;
    }

    /** Public method for rectangle perimeter. */
    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    /** Rectangle description. */
    public String toString() {
        return String.format(
                "[Rectangle (Color=%s, Length=%.2f, Width=%.2f)]",
                /* retrieve color via substitution */
                getColor(), length, width);
    }
}
