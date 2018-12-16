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
public class Rectangle {
    /* public static data */
    public static float DEFAULT_LENGTH = 2.0f;
    public static float DEFAULT_WIDTH = 1.0f;

    /* private instance data */
    private float length;
    private float width;

    /* default constructor */
    public Rectangle() {
        length = DEFAULT_LENGTH;
        width = DEFAULT_WIDTH;
    }

    /* constructor initializing one attribute */
    public Rectangle(Rectangle r) {
        this();
    }

    /* constructor initializing one of the attributes */
    public Rectangle(float length) {
        this();
        this.length = length;
    }

    /* custom constructor */
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    /** Public accessor for rectangle length. */
    public float getLength() {
        return length;
    }

    /** Public mutator for rectangle length. */
    public void setLength(float length) {
        this.length = length;
    }

    /** Public accessor for rectangle width. */
    public float getWidth() {
        return width;
    }

    /** Public mutator for rectangle width. */
    public void setWidth(float width) {
        this.width = width;
    }

    /** Public method for rectangle area. */
    public double getArea() {
        return length * width;
    }

    /** Public method for rectangle perimeter. */
    public double getPerimeter() {
        return (length + width) * 2;
    }

    /** Public method for Rectangle class description. */
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}
