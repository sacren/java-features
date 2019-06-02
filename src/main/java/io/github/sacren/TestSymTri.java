/**
 * Test driver for SymTri class.
 *
 * <p>* * * * * * *
 *     *         *
 *      *       *
 *       *     *
 *        *   *
 *         * *
 *          *
 *         (a)
 *
 *       <p>*
 *         * *
 *        *   *
 *       *     *
 *      *       *
 *     *         *
 *    * * * * * * *
 *         (b)
 */
import java.util.Scanner;

public class TestSymTri {
    /** SymTri test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of symmetric triangles: ");
        size = in.nextInt();
        in.close();
        System.out.println();
        System.out.println("=== Symmetric triangles ===");
        System.out.println();
        System.out.println(new SymTri(size));
    }
}
