/**
 * Point3D: subclass under Point superclass.
 *
 * <p>Private data with default values:
 * -axisZ:double = 0
 *
 * <p>Constructor:
 * +Point3D()
 * +Point3D(axisX:double, axisY:double, axisZ:double)
 *
 * <p>Public methods:
 * +getZ():double
 * +setZ(axisZ:double):void
 * +toString():String
 */
public class Point3D extends Point {
    /* public static data */
    public static final double DEFAULT_Z = 0;

    /* private instance data */
    private double axisZ;

    /** Default constructor. */
    public Point3D() {
        /* super(); */
        /* above implicitly executed for default class */
        axisZ = DEFAULT_Z;
    }

    /** Custom constructor. */
    public Point3D(double axisX, double axisY, double axisZ) {
        super(axisX, axisY);
        this.axisZ = axisZ;
    }

    /** getter of axisZ. */
    public double getZ() {
        return axisZ;
    }

    /** setter of axisZ. */
    public void setZ(double axisZ) {
        this.axisZ = axisZ;
    }

    /** Point3D description. */
    @Override
    public String toString() {
        return String.format(
                "Point3D (%.2f, %.2f, %.2f)",
                getX(), getY(), axisZ);
    }
}
