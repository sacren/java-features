/**
 * Test driver for CastTop, CastMiddle and CastBottom.
 */
public class TestCast {
    /** Test driver for CastTop, CastMiddle and CastBottom. */
    public static void main(String[] args) {
        CastTop top = new CastTop();
        System.out.println(top);
        CastTop middle = new CastMiddle();
        System.out.println(middle);
        CastMiddle downCast = (CastMiddle)middle;
        System.out.println(downCast);
        CastMiddle bottom = new CastBottom();
        System.out.println(bottom);
    }
}
