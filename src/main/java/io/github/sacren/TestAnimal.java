/**
 * Test dirver for Animal class.
 *
 *           <p>'__'
 *              (oo)
 *      +========\/
 *     / || %%% ||
 *    *  ||-----||
 *       ""     ""
 */
import static java.lang.System.out;

public class TestAnimal {
    /** Animal test driver. */
    public static void main(String[] args) {
        out.println();
        out.println("=== Animal ===");
        for (int i = 0; i < 4; i++) {
            out.println();
            out.println(new Animal());
        }
    }
}
