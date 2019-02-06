/**
 * Rectangle class
 *
 * <p>Private data with default values:
 * -length:double = 2.0f
 * -width:double = 1.0f
 *
 * <p>Constructor:
 * +Rectangle()
 * +Rectangle(length:double, width:double)
 *
 * <p>Public methods:
 * +getLength():float
 * +setLength(length:double):void
 * +getWidth():float
 * +setWidth(width:double):void
 * +setLengthWidth(length:double, width:double):void
 * +getArea():double
 * +getPerimeter():double
 * +toString():String
 */
public class Rectangle extends Shape {
    /* public static data */
    public static float DEFAULT_LENGTH = 2.0f;
    public static float DEFAULT_WIDTH = 1.0f;

    /* private static data */
    private static String DEFAULT_COLOR = "cyan";

    /* private instance data */
    private double length;
    private double width;

    /** Default constructor. */
    public Rectangle() {
        super(DEFAULT_COLOR);
        length = DEFAULT_LENGTH;
        width = DEFAULT_WIDTH;
    }

    /** Default constructor with parameter place holder. */
    public Rectangle(Rectangle r) {
        this();
    }

    /** Constructor initializing one attribute. */
    public Rectangle(double length) {
        this();
        setLength(length);
    }

    /** Custom constructor. */
    public Rectangle(double length, double width) {
        super(DEFAULT_COLOR);
        setLengthWidth(length, width);
    }

    /** Custom rectangle constructor with color. */
    public Rectangle(String color, double length, double width) {
        super(color);
        setLengthWidth(length, width);
    }

    /** Public accessor for rectangle length. */
    public double getLength() {
        return length;
    }

    /** Public mutator for rectangle length. */
    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", length));
        }
        this.length = length;
    }

    /** Public accessor for rectangle width. */
    public double getWidth() {
        return width;
    }

    /** Public mutator for rectangle width. */
    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", width));
        }
        this.width = width;
    }

    /** Helper method for both setLength() and setWidth(). */
    public void setLengthWidth(double length, double width) {
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

    /** Public method for Rectangle class description. */
    public String toString() {
        return String.format(
                "[Rectangle (Color=%s, Length=%.2f, Width=%.2f)]",
                /* retrieve color via substitution */
                getColor(), length, width);
    }
}
