/**
 * Shape (abstract class)
 *
 * <p>Shape superclass provides the common properties of all shapes.
 *
 * <p>Private data with default values:
 * -color:String
 *
 * <p>Constructor:
 * +Shape(color:String)
 *
 * <p>Abstract methods:
 * +getArea():double
 *
 * <p>Public method:
 * +getColor():String
 */
public abstract class Shape {
    /* private instance data */
    private String color;

    /** Shape custom constructor. */
    public Shape(String color) {
        this.color = color;
    }

    /** Public interface for calculating area of particular shape. */
    public abstract double getArea();

    /** Public method for color of various shapes. */
    public String getColor() {
        return color;
    }
}
