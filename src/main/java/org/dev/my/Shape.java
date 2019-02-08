/**
 * Shape (abstract class)
 *
 * <p>Shape superclass provides the common properties of all shapes.
 *
 * <p>Private data:
 * -color:String
 *
 * <p>Constructor:
 * +Shape(color:String)
 *
 * <p>Abstract methods:
 * +getArea():double
 * +getPerimeter():double
 *
 * <p>Public method:
 * +getColor():String
 * +setColor(color:String):void
 */
public abstract class Shape {
    /* private static data */
    private String color;

    /** Shape custom constructor. */
    public Shape(String color) {
        this.color = color;
    }

    /** Public method for color of various shapes. */
    public String getColor() {
        return color;
    }

    /** setter for color of various shapes. */
    public void setColor(String color) {
        this.color = color;
    }

    /** Public interface for area of various shapes. */
    public abstract double getArea();

    /** Public interface for perimeter of various shapes. */
    public abstract double getPerimeter();
}
