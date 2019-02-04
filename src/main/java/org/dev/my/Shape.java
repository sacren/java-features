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
 * <p>Public methods:
 * +getArea():int
 * +toString():String
 */
public abstract class Shape {
    /* private instance data */
    private String color;

    /** Shape default constructor. */
    public Shape() {
        color = "cyan";
    }

    /** Shape custom constructor. */
    public Shape(String color) {
        this.color = color;
    }

    /** Public interface for calculating area of particular shape. */
    public abstract double getArea();

    /** Shape description. */
    public String toString() {
        return String.format("Shape[color=%s]", color);
    }
}
