/**
 * Shape abstract superclass
 *
 * <p>Shape superclass provides the common properties of all shapes.
 *
 * <p>Private instance data:
 * -color:String
 *
 * <p>Constructor:
 * +Shape(color:String)
 *
 * <p>Abstract methods:
 * +area():double
 * +perimeter():double
 *
 * <p>Public methods:
 * +getColor():String
 * +setColor(color:String):void
 */
public abstract class Shape {
    /* private instance data */
    private String color;

    /** Shape custom constructor. */
    public Shape(String color) {
        this.color = color;
    }

    /** Shape getter for color of shapes. */
    public String getColor() {
        char firstChar = Character.toUpperCase(color.charAt(0));
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toString(firstChar)).append(color.substring(1));
        return sb.toString();
    }

    /** Shape setter for color of shapes. */
    public void setColor(String color) {
        this.color = color;
    }

    /** Shape interface for area of shapes. */
    public abstract double area();

    /** Shape interface for perimeter of shapes. */
    public abstract double perimeter();
}
