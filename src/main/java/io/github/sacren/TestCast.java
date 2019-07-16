/**
 * Test driver for CastTop, CastMiddle and CastBottom.
 */
public class TestCast {
    /** Test driver for CastTop, CastMiddle and CastBottom. */
    public static void main(String[] args) {
        /* no cast */
        System.out.println();
        System.out.println("=== No cast ===");
        System.out.println();
        CastTop c1 = new CastTop();
        System.out.printf(
                "Reference: Top%n"
                        + "Instance:  Top%n%n"
                        + "Result:    %s%n",
                c1);
        /* upcast */
        System.out.println();
        System.out.println("=== Upcast ===");
        System.out.println();
        CastTop c2 = new CastMiddle();
        System.out.printf(
                "Reference: Top%n"
                        + "Instance:  Middle%n%n"
                        + "Result:    %s%n",
                c2);
        System.out.println();
        CastTop c3 = new CastBottom();
        System.out.printf(
                "Reference: Top%n"
                        + "Instance:  Bottom%n%n"
                        + "Result:    %s%n",
                c3);
        /* downcast */
        System.out.println();
        System.out.println("=== Downcast ===");
        System.out.println();
        System.out.println((CastMiddle)c2);
        /* double upcast */
        System.out.println();
        System.out.println("=== Double upcast ===");
        System.out.println();
        CastTop c4 = new CastBottom();
        System.out.printf(
                "Reference: Top%n"
                        + "Instance:  Bottom%n%n"
                        + "Result:    %s%n",
                c4);
        /* double downcast */
        System.out.println();
        System.out.println("=== Double downcast ===");
        System.out.println();
        System.out.println((CastBottom)c4);
        /* instanceof operator */
        System.out.println();
        System.out.println("=== instanceof operator ===");
        System.out.println();
        if (c1 instanceof CastTop) {
            System.out.println("TOP is an instance of CastTop class.");
        } else {
            System.out.println("TOP is not an instance of CastTop class.");
        }
        if (c2 instanceof CastTop) {
            System.out.println("MIDDLE is an instance of CastTop class.");
        } else {
            System.out.println("MIDDLE is not an instance of CastTop class.");
        }
        if (c3 instanceof CastTop) {
            System.out.println("BOTTOM is an instance of CastTop class.");
        } else {
            System.out.println("BOTTOM is not an instance of CastTop class.");
        }
        if (c1 instanceof CastMiddle) {
            System.out.println("TOP is an instance of CastMiddle class.");
        } else {
            System.out.println("TOP is not an instance of CastMiddle class.");
        }
        if (c2 instanceof CastBottom) {
            System.out.println("MIDDLE is an instance of CastBottom class.");
        } else {
            System.out.println("MIDDLE is not an instance of CastBottom class.");
        }
    }
}
