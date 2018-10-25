/**
 * Print 5 × 5 pattern using two nested loops.
 *
 * <p># # # # #
 *    # # # # #
 *    # # # # #
 *    # # # # #
 *    # # # # #
 */
public class SquareBoard {
    public static void main(String[] args) {
        printSquareBoard();
    }

    private static void printSquareBoard() {
        final int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == size) {
                    System.out.println('#');
                    break;
                }
                System.out.print("# ");
            }
        }
    }
}
