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
        CastTop top = new CastTop();
        System.out.println(top);
        /* upcast */
        System.out.println();
        System.out.println("=== Upcast ===");
        System.out.println();
        CastTop middle = new CastMiddle();
        System.out.println(middle);
        CastMiddle bottom = new CastBottom();
        System.out.println(bottom);
        System.out.println((CastTop)bottom);
        /* downcast */
        System.out.println();
        System.out.println("=== Downcast ===");
        System.out.println();
        System.out.println((CastMiddle)middle);
        /* double upcast */
        System.out.println();
        System.out.println("=== Double upcast ===");
        System.out.println();
        CastTop doubleTop = new CastBottom();
        System.out.println(doubleTop);
        /* double downcast */
        System.out.println();
        System.out.println("=== Double downcast ===");
        System.out.println();
        System.out.println((CastBottom)doubleTop);
        /* instanceof operator */
        System.out.println();
        System.out.println("=== instanceof operator ===");
        System.out.println();
        if (top instanceof CastTop) {
            System.out.println("top is an instance of CastTop class.");
        } else {
            System.out.println("top is not an instance of CastTop class.");
        }
        if (middle instanceof CastTop) {
            System.out.println("middle is an instance of CastTop class.");
        } else {
            System.out.println("middle is not an instance of CastTop class.");
        }
        if (bottom instanceof CastTop) {
            System.out.println("bottom is an instance of CastTop class.");
        } else {
            System.out.println("bottom is not an instance of CastTop class.");
        }
        if (top instanceof CastMiddle) {
            System.out.println("top is an instance of CastMiddle class.");
        } else {
            System.out.println("top is not an instance of CastMiddle class.");
        }
        if (middle instanceof CastBottom) {
            System.out.println("middle is an instance of CastBottom class.");
        } else {
            System.out.println("middle is not an instance of CastBottom class.");
        }
    }
}
