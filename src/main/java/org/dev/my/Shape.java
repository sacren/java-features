/**
 * Shape superclass provides the common properties of all shapes.
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
public class Shape {
    /* private instance data */
    private String color;

    /** Shape custom constructor. */
    public Shape(String color) {
        this.color = color;
    }

    /** Calculate area of shape. */
    public int getArea() {
        System.out.println("Error!");
        return 0;
    }

    /** Shape description. */
    public String toString() {
        return String.format("Shape[color=%s]", color);
    }
}
