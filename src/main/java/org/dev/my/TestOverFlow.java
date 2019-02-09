/** Overflow demo. */
public class TestOverFlow {
    /** Display various overflows. */
    public static void main(String[] args) {
        final int integerMax = Integer.MAX_VALUE;
        final int overFlowMax1 = integerMax + 1;
        final int overFlowMax2 = integerMax + 2;
        final int overFlowMax3 = integerMax * integerMax;
        final long longNumber1 = integerMax + 1L;
        final int integerMin = Integer.MIN_VALUE;
        final int overFlowMin1 = integerMin + 1;
        final int overFlowMin2 = integerMin + 2;
        final int overFlowMin3 = integerMin * integerMin;
        final long longNumber2 = integerMin - 1L;
        System.out.println("int(max) = " + integerMax);
        System.out.println("int(max) + 1 = " + overFlowMax1);
        System.out.println("int(max) + 2 = " + overFlowMax2);
        System.out.println("int(max) * int(max) = " + overFlowMax3);
        System.out.println("int(max) + 1L = " + longNumber1);
        System.out.println("int(min) = " + integerMin);
        System.out.println("int(min) - 1 = " + overFlowMin1);
        System.out.println("int(min) - 2 = " + overFlowMin2);
        System.out.println("int(min) * int(min) = " + overFlowMin3);
        System.out.println("int(min) - 1L = " + longNumber2);
    }
}
