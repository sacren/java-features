/**
 * Test driver for Point and Point3D classes.
 */
public class TestPoint3D {
    /** Point3D test driver. */
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
        Point3D p3D = new Point3D();
        System.out.println();
        System.out.println("=== Point in 3-D ===");
        System.out.println();
        System.out.printf(
                "Default 3-D point: P%s%n%n"
                        + "Default 3-D point: P(%.2f, %.2f, %.2f)%n",
                p3D,
                p3D.getX(),
                p3D.getY(),
                p3D.getZ());
        /* custom 3-D point */
        System.out.println();
        System.out.println("=== Custom 3-D point ===");
        System.out.println();
        Point3D custP3D = new Point3D(1, 2, 3);
        System.out.printf(
                "Custom 3-D point: P%s%n%n"
                        + "Custom 3-D point: P(%.2f, %.2f, %.2f)%n",
                custP3D,
                custP3D.getX(),
                custP3D.getY(),
                custP3D.getZ());
        /* update custom 3-D point */
        System.out.println();
        System.out.println("=== Change to 3-D point ===");
        System.out.println();
        custP3D.setX(101);
        custP3D.setY(102);
        custP3D.setZ(103);
        System.out.printf(
                "Update 3-D point: P%s%n%n"
                        + "Update 3-D point: P(%.2f, %.2f, %.2f)%n",
                custP3D,
                custP3D.getX(),
                custP3D.getY(),
                custP3D.getZ());
    }
}
