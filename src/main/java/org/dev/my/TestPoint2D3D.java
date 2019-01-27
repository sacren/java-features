/**
 * Test driver for Point2D and Point3D classes.
 */
public class TestPoint2D3D {
    /** Initialize and run Point2D class. */
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        System.out.printf(
                "Default Point2D at (%d, %d)%n",
                point2D.getX(), point2D.getY());
        System.out.println();
        Point3D point3D = new Point3D();
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
    }
}
