/**
 * Point3D: subclass under Point2D.
 *
 * <p>Private data with default values:
 * -axisZ:int = 0
 *
 * <p>Constructor:
 * +Point3D()
 * +Point3D(axisX:int, axisY:int, axisZ:int)
 *
 * <p>Public methods:
 * +getZ():int
 * +setZ(axisZ:int):void
 * +toString():String
 */
public class Point3D extends Point2D {
    /* public static data */
    public static final int DEFAULT_Z = 0;

    /* private instance data */
    private int axisZ;

    /** Default constructor. */
    public Point3D() {
        /* super(); */
        /* above implicitly executed for default class */
        axisZ = DEFAULT_Z;
    }

    /** Custom constructor. */
    public Point3D(int axisX, int axisY, int axisZ) {
        super(axisX, axisY);
        this.axisZ = axisZ;
    }

    /** getter of axisZ. */
    public int getZ() {
        return axisZ;
    }

    /** setter of axisZ. */
    public void setZ(int axisZ) {
        this.axisZ = axisZ;
    }

    /** Point3D description. */
    @Override
    public String toString() {
        return String.format(
                "Point3D (%d, %d, %d)",
                getX(), getY(), axisZ);
    }
}
