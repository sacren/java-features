/**
 * Test driver for Quad class.
 */
public class TestQuad {
    /** Quad test driver. */
    public static void main(String[] args) {
        Quad defQuad = new Quad();
        System.out.println();
        System.out.println("=== Default Quad instance ===");
        System.out.println();
        System.out.println(defQuad);
        System.out.println();
        System.out.printf(
                "Default Quad instance: (%d, %d, %d, %d)%n",
                defQuad.getFirstInt(),
                defQuad.getSecondInt(),
                defQuad.getThirdInt(),
                defQuad.getFourthInt());
        System.out.println();
        System.out.println("=== Custom Quad instance ===");
        System.out.println();
        Quad quad = new Quad((double) 1, 2, 3, (double) 4);
        System.out.println(quad);
        System.out.println();
        System.out.printf(
                "Quad of mixed types: (%.2f, %d, %d, %.2f)%n",
                quad.getFirstDbl(),
                quad.getSecondInt(),
                quad.getThirdInt(),
                quad.getFourthDbl());
        System.out.println();
        System.out.println("=== Update Quad instance ===");
        System.out.println();
        quad.setFirst((double) 101);
        quad.setSecond(102);
        quad.setThird(103);
        quad.setFourth((double) 104);
        System.out.println(quad);
        System.out.println();
        System.out.printf(
                "Quad of mixed types: (%.2f, %d, %d, %.2f)%n",
                quad.getFirstDbl(),
                quad.getSecondInt(),
                quad.getThirdInt(),
                quad.getFourthDbl());
    }
}
