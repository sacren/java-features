/**
 * Test driver for Point, Trio and Quad classes.
 */
public class Test4D {
    /** Point, Trio and Quad test driver. */
    public static void main(String[] args) {
        /* 2-D */
        Point p2D = new Point();
        System.out.println();
        System.out.println("=== Default 2-D ===");
        System.out.println();
        System.out.printf(
                "Default 2-D: P%s%n%n"
                        + "Default 2-D: P(%.2f, %.2f)%n",
                p2D,
                p2D.getX(),
                p2D.getY());
        /* 3-D */
        Trio p3D = new Trio();
        System.out.println();
        System.out.println("=== Default 3-D ===");
        System.out.println();
        System.out.printf(
                "Default 3-D: P%s%n%n"
                        + "Default 3-D: P(%d, %d, %d)%n",
                p3D,
                p3D.getFirstInt(),
                p3D.getSecondInt(),
                p3D.getThirdInt());
        /* custom 3-D */
        Trio dbl3D = new Trio((double)1, (double)2, (double)3);
        System.out.println();
        System.out.println("=== Custom 3-D ===");
        System.out.println();
        System.out.printf(
                "Custom 3-D: P%s%n%n"
                        + "Custom 3-D: P(%.2f, %.2f, %.2f)%n",
                dbl3D,
                dbl3D.getFirstDbl(),
                dbl3D.getSecondDbl(),
                dbl3D.getThirdDbl());
        /* update custom 3-D */
        dbl3D.setFirst((double)101);
        dbl3D.setSecond((double)102);
        dbl3D.setThird((double)103);
        System.out.println();
        System.out.println("=== Update 3-D ===");
        System.out.println();
        System.out.printf(
                "Update 3-D: P%s%n%n"
                        + "Update 3-D: P(%.2f, %.2f, %.2f)%n",
                dbl3D,
                dbl3D.getFirstDbl(),
                dbl3D.getSecondDbl(),
                dbl3D.getThirdDbl());
        /* custom 4-D */
        Quad int4D = new Quad(1, 2, 3, 4);
        System.out.println();
        System.out.println("=== Custom 4-D ===");
        System.out.println();
        System.out.printf(
                "Custom 4-D: P%s%n%n"
                        + "Update 4-D: P(%d, %d, %d, %d)%n",
                int4D,
                int4D.getFirstInt(),
                int4D.getSecondInt(),
                int4D.getThirdInt(),
                int4D.getFourthInt());
        /* update custom 4-D */
        System.out.println();
        System.out.println("=== Update 4-D ===");
        System.out.println();
        int4D.setFirst(101);
        int4D.setSecond(102);
        int4D.setThird(103);
        int4D.setFourth(104);
        System.out.printf(
                "Update 4-D: P%s%n%n"
                        + "Update 4-D: P(%d, %d, %d, %d)%n",
                int4D,
                int4D.getFirstInt(),
                int4D.getSecondInt(),
                int4D.getThirdInt(),
                int4D.getFourthInt());
    }
}
