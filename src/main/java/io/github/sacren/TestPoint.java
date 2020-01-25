/**
 * Test driver of Point class.
 */
public class TestPoint {
    /** Point test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Point of origin ===");
        System.out.println();
        Point origin = new Point();
        System.out.println(origin);
        System.out.println();
        System.out.printf(
                "Origin instance: (%d, %d)%n"
                        + "                 (%.2f, %.2f)%n",
                origin.getFirstInt(), origin.getSecondInt(),
                origin.getFirstDbl(), origin.getSecondDbl());
        System.out.println();
        System.out.println("=== Custom Point instances ===");
        System.out.println();
        System.out.println(new Point(11, 2));
        System.out.println(new Point((double) 11, (double) 2));
        System.out.println();
        System.out.println("=== Distance between Point instances ===");
        System.out.println();
        Point pnt = new Point(-3, -4);
        System.out.printf(
                "Point instance: %s%n", pnt);
        System.out.println(pnt.distance());
        System.out.println(pnt.distance(0, 0));
        System.out.println(pnt.distance(origin));
        System.out.println();
        System.out.println("=== Array of Point instances ===");
        System.out.println();
        Point[] points = new Point[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(i, i);
        }
        for (Point point : points) {
            System.out.println(point);
        }
    }
}
