/**
 * Shape abstract superclass provides the common properties of Rectangle,
 * Triangle, Circle, etc.
 *
 * <p>Private instance variable:
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
    /* private instance variable */
    private String color;

    /** Shape custom constructor. */
    public Shape(String color) {
        setColor(color);
    }

    /** Shape getter for color of Rectangle, Triangle, Circle, etc. */
    public String getColor() {
        char firstChar = Character.toUpperCase(color.charAt(0));
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toString(firstChar)).append(color.substring(1));
        return sb.toString();
    }

    /** Shape setter for color of Rectangle, Triangle, Circle, etc. */
    public void setColor(String color) {
        this.color = color;
    }

    /** Shape interface for area of Rectangle, Triangle, Circle, etc. */
    public abstract double area();

    /** Shape interface for perimeter of Rectangle, Triangle, Circle, etc. */
    public abstract double perimeter();
}
