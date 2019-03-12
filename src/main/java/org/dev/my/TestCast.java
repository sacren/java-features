/**
 * Test driver for CastTop, CastMiddle and CastBottom.
 */
public class TestCast {
    /** Test driver for CastTop, CastMiddle and CastBottom. */
    public static void main(String[] args) {
        /* no cast */
        CastTop top = new CastTop();
        System.out.println(top);
        /* upcast */
        CastTop middle = new CastMiddle();
        System.out.println(middle);
        /* downcast */
        System.out.println((CastMiddle)middle);
        /* upcast */
        CastMiddle bottom = new CastBottom();
        System.out.println(bottom);
        System.out.println((CastTop)bottom);
        /* double upcast */
        CastTop anotherTop = new CastBottom();
        System.out.println(anotherTop);
        /* double downcast */
        System.out.println((CastBottom)anotherTop);
        /* instanceof operator */
        System.out.println(top instanceof CastTop);
        System.out.println(middle instanceof CastTop);
        System.out.println(bottom instanceof CastTop);
        System.out.println(top instanceof CastMiddle);
        System.out.println(middle instanceof CastBottom);
    }
}
