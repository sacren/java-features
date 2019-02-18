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
        /* double upcast */
        CastTop doubleUp = new CastBottom();
        System.out.println(doubleUp);
    }
}
