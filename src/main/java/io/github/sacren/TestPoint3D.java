/**
 * Test driver for Point and Trio classes.
 */
public class TestPoint3D {
    /** Point and Trio test driver. */
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
        Trio p3D = new Trio();
        System.out.println();
        System.out.println("=== Point in 3-D ===");
        System.out.println();
        System.out.printf(
                "Default 3-D point: P%s%n%n"
                        + "Default 3-D point: P(%d, %d, %d)%n",
                p3D,
                p3D.getFirstInt(),
                p3D.getSecondInt(),
                p3D.getThirdInt());
        /* custom 3-D point */
        System.out.println();
        System.out.println("=== Custom 3-D point ===");
        System.out.println();
        Trio dbl3D = new Trio((double)1, (double)2, (double)3);
        System.out.printf(
                "Custom 3-D point: P%s%n%n"
                        + "Update 3-D point: P(%.2f, %.2f, %.2f)%n",
                dbl3D,
                dbl3D.getFirstDbl(),
                dbl3D.getSecondDbl(),
                dbl3D.getThirdDbl());
        /* update custom 3-D point */
        System.out.println();
        System.out.println("=== Change to 3-D point ===");
        System.out.println();
        dbl3D.setFirst((double)101);
        dbl3D.setSecond((double)102);
        dbl3D.setThird((double)103);
        System.out.printf(
                "Update 3-D point: P%s%n%n"
                        + "Update 3-D point: P(%.2f, %.2f, %.2f)%n",
                dbl3D,
                dbl3D.getFirstDbl(),
                dbl3D.getSecondDbl(),
                dbl3D.getThirdDbl());
    }
}
