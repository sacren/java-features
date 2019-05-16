/**
 * Test driver for Point and Point3D classes.
 */
public class TestPoint2D3D {
    /** Initialize and run Point2D class. */
    public static void main(String[] args) {
        /* point in 2-D */
        Point p2D = new Point();
        System.out.println();
        System.out.println("=== Point in 2-D ===");
        System.out.println();
        System.out.printf(
                "Default 2-D point: P%s%n%n"
                        + "Default 2-D point: P(%.2f, %.2f)%n",
                p2D,
                p2D.getX(),
                p2D.getY());
        /* point in 3-D */
        Point3D point3D = new Point3D();
        System.out.println();
        System.out.println("=== Point in 3-D ===");
        System.out.println();
        System.out.println(point3D);
        System.out.printf(
                "Default Point3D at (%d, %d, %d)%n",
                point3D.getX(), point3D.getY(), point3D.getZ());
        System.out.println();
        Point3D customPoint3D = new Point3D(1, 2, 3);
        System.out.println(customPoint3D);
        System.out.printf(
                "Custom Point3D at (%d, %d, %d)%n",
                customPoint3D.getX(),
                customPoint3D.getY(),
                customPoint3D.getZ());
        System.out.println();
        System.out.println("=== Change to point in 3-D ===");
        System.out.println();
        customPoint3D.setX(101);
        customPoint3D.setY(102);
        customPoint3D.setZ(103);
        System.out.println(customPoint3D);
        System.out.printf(
                "Custom Point3D at (%d, %d, %d)%n",
                customPoint3D.getX(),
                customPoint3D.getY(),
                customPoint3D.getZ());
    }
}
