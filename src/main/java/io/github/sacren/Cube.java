/**
 * Cube class extends Point class.
 *
 * <p>We use Cube for 3-D pointers.  Broadly Cube could represent any object
 * that requires conceptual three dimensions.  See Time class for details.
 *
 * <p>Private data with default value:
 * -axisZ:double = 0
 *
 * <p>Constructor:
 * +Cube()
 * +Cube(axisX:double, axisY:double, axisZ:double)
 *
 * <p>Public methods:
 * +getZ():double
 * +setDefZ():void
 * +setZ(axisZ:double):void
 * +toString():String
 */
public class Cube extends Point {
    /* private instance data */
    private double axisZ;

    /** Cube default constructor. */
    public Cube() {
        /* super(); */
        /* above implicitly executed for default class */
        setDefZ();
    }

    /** Cube custom constructor. */
    public Cube(double axisX, double axisY, double axisZ) {
        super(axisX, axisY);
        setZ(axisZ);
    }

    /** Cube getter for axisZ. */
    public double getZ() {
        return axisZ;
    }

    /** Cube setter for default value of axisZ. */
    public void setDefZ() {
        axisZ = 0;
    }

    /** Cube setter for axisZ. */
    public void setZ(double axisZ) {
        this.axisZ = axisZ;
    }

    /** Cube string method. */
    @Override
    public String toString() {
        return String.format(
                "(%.2f, %.2f, %.2f)",
                getX(), getY(), axisZ);
    }
}
