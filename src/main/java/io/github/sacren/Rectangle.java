/**
 * Rectangle subclass extends Shape superclass.
 *
 * <p>Private instance data with default values:
 * -sides:Duo = {2.0f, 1.0f}
 *
 * <p>Constructor:
 * +Rectangle()
 * +Rectangle(r:Rectangle)
 * +Rectangle(length:double)
 * +Rectangle(length:double, width:double)
 * +Rectangle(sides:Duo)
 * +Rectangle(color:String, length:double, width:double)
 * +Rectangle(color:String, sides:Duo)
 *
 * <p>Public methods:
 * +getLength():double
 * +setLength(length:double):void
 * +getWidth():double
 * +setWidth(width:double):void
 * +setSides(length:double, width:double):void
 * +setSides(sides:Duo):void
 * +area():double
 * +perimeter():double
 * +toString():String
 */
public class Rectangle extends Shape {
    /* private instance variable */
    private Duo sides = new Duo();

    /** Rectangle default constructor. */
    public Rectangle() {
        super("cyan"); /* rectangle instance default color */
        setSides(new Duo(2.0f, 1.0f));
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

    /** Rectangle constructor with both length and width. */
    public Rectangle(double length, double width) {
        this();
        setSides(length, width);
    }

    /** Rectangle constructor with Duo object. */
    public Rectangle(Duo sides) {
        this();
        setSides(sides);
    }

    /** Rectangle constructor with color, lenghth and width. */
    public Rectangle(String color, double length, double width) {
        this();
        setColor(color);
        setSides(length, width);
    }

    /** Rectangle constructor with color and Duo object. */
    public Rectangle(String color, Duo sides) {
        this();
        setColor(color);
        setSides(sides);
    }

    /** Rectangle getter for rectangle length. */
    public double getLength() {
        return sides.getFirstDbl();
    }

    /** Rectangle setter for rectangle length. */
    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", length));
        }
        sides.setFirst(length);
    }

    /** Rectangle getter for rectangle width. */
    public double getWidth() {
        return sides.getSecondDbl();
    }

    /** Rectangle setter for rectangle width. */
    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", width));
        }
        sides.setSecond(width);
    }

    /** Rectangle setter for both sides. */
    public void setSides(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    /** Rectangle setter using Duo for both sides. */
    public void setSides(Duo sides) {
        setSides(sides.getFirstDbl(), sides.getSecondDbl());
    }

    /** Rectangle method for rectangle area. */
    @Override
    public double area() {
        return getLength() * getWidth();
    }

    /** Rectangle method for rectangle perimeter. */
    @Override
    public double perimeter() {
        return (getLength() + getWidth()) * 2;
    }

    /** Rectangle instance formatted string. */
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
                area(),
                perimeter());
    }
}
