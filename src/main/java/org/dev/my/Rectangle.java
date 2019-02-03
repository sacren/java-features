/**
 * Rectangle class
 *
 * <p>Private data with default values:
 * -length:float = 2.0f
 * -width:float = 1.0f
 *
 * <p>Constructor:
 * +Rectangle()
 * +Rectangle(length:float, width:float)
 *
 * <p>Public methods:
 * +getLength():float
 * +setLength(length:float):void
 * +getWidth():float
 * +setWidth(width:float):void
 * +getArea():double
 * +getPerimeter():double
 * +toString():String
 */
public class Rectangle extends Shape {
    /* public static data */
    public static float DEFAULT_LENGTH = 2.0f;
    public static float DEFAULT_WIDTH = 1.0f;

    /* private instance data */
    private float length;
    private float width;

    /** Default constructor. */
    public Rectangle() {
        length = DEFAULT_LENGTH;
        width = DEFAULT_WIDTH;
    }

    /** Default constructor with parameter place holder. */
    public Rectangle(Rectangle r) {
        this();
    }

    /** Constructor initializing one attribute. */
    public Rectangle(float length) {
        this();
        setLength(length);
    }

    /** Custom constructor. */
    public Rectangle(float length, float width) {
        setLength(length);
        setWidth(width);
    }

    /** Public accessor for rectangle length. */
    public float getLength() {
        return length;
    }

    /** Public mutator for rectangle length. */
    public void setLength(float length) {
        if (length <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", length));
        }
        this.length = length;
    }

    /** Public accessor for rectangle width. */
    public float getWidth() {
        return width;
    }

    /** Public mutator for rectangle width. */
    public void setWidth(float width) {
        if (width <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", width));
        }
        this.width = width;
    }

    /** Public method for rectangle area. */
    @Override
    public double getArea() {
        return length * width;
    }

    /** Public method for rectangle perimeter. */
    public double getPerimeter() {
        return (length + width) * 2;
    }

    /** Public method for Rectangle class description. */
    public String toString() {
        return String.format(
                "[Rectangle (Length=%.2f, Width=%.2f)]%n",
                length, width);
    }
}
