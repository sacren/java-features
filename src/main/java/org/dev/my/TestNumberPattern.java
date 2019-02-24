/**
 * Prompt the user for the size of a non-negative integer and print the pattern.
 *
 * <p>1
 *    1  2
 *    1  2  3
 *    1  2  3  4
 *    1  2  3  4  5
 *    1  2  3  4  5  6
 *    1  2  3  4  5  6  7
 *    1  2  3  4  5  6  7  8
 *              (a)
 *
 * <p>1  2  3  4  5  6  7  8
 *       1  2  3  4  5  6  7
 *          1  2  3  4  5  6
 *             1  2  3  4  5
 *                1  2  3  4
 *                   1  2  3
 *                      1  2
 *                         1
 *              (b)
 *
 * <p>                       1
 *                        2  1
 *                     3  2  1
 *                  4  3  2  1
 *               5  4  3  2  1
 *            6  5  4  3  2  1
 *         7  6  5  4  3  2  1
 *      8  7  6  5  4  3  2  1
 *                (c)
 *
 * <p>8  7  6  5  4  3  2  1
 *    7  6  5  4  3  2  1
 *    6  5  4  3  2  1
 *    5  4  3  2  1
 *    4  3  2  1
 *    3  2  1
 *    2  1
 *    1
 *              (d)
 */
import java.util.Scanner;

public class TestNumberPattern {
    /** Display number pattern. */
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.print("Enter the size (max 24, min 4) of number pattern: ");
        int size = inputStream.nextInt();
        inputStream.close();
        if (size < 4 || size > 24) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", size));
        }
        System.out.println();
        System.out.print(bottomLeft(size));
        System.out.println(centerId(size, 'a'));
        System.out.print(topRight(size));
        System.out.println(centerId(size, 'b'));
        System.out.print(bottomRight(size));
        System.out.println(centerId(size, 'c'));
        System.out.print(topLeft(size) + centerId(size, 'd'));
    }

    /* annotate pattern with centered ID */
    private static String centerId(int size, char id) {
        String s = String.format("(%c)%n", id);
        for (int i = 0; i < size / 2; i++) {
            s = String.format("%3c", ' ') + s;
        }
        return s;
    }

    /* right angle at bottom-left corner */
    private static String bottomLeft(int size) {
        final int firstCount = 1;
        String s = "";
        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= row; col++) {
                if (col == row) {
                    s += String.format("%3d%n", col);
                    break;
                }
                s += String.format("%3d", col);
            }
        }
        return s;
    }

    /* right angle at top-right corner */
    private static String topRight(int size) {
        final int firstCount = 1;
        String s = "";
        int width;
        for (int row = firstCount; row <= size; row++) {
            width = size - row + 1;
            for (int col = firstCount; col < row; col++) {
                s += String.format("%3c", ' ');
            }
            for (int col = firstCount; col <= width; col++) {
                if (col == width) {
                    s += String.format("%3d%n", col);
                    break;
                }
                s += String.format("%3d", col);
            }
        }
        return s;
    }

    /* right angle at bottom-right corner */
    private static String bottomRight(int size) {
        final int firstCount = 1;
        String s = "";
        int width;
        int number;
        for (int row = firstCount; row <= size; row++) {
            width = size - row + 1;
            for (int col = firstCount; col < width; col++) {
                s += String.format("%3c", ' ');
            }
            for (int col = firstCount; col <= row; col++) {
                number = row - col + 1;
                if (col == row) {
                    s += String.format("%3d%n", number);
                    break;
                }
                s += String.format("%3d", number);
            }
        }
        return s;
    }

    /* right angle at top-left corner */
    private static String topLeft(int size) {
        final int firstCount = 1;
        String s = "";
        int sentinel;
        int number;
        for (int row = firstCount; row <= size; row++) {
            sentinel = size - row + 1;
            for (int col = firstCount; col <= size; col++) {
                number = sentinel - col + 1;
                if (col == sentinel) {
                    s += String.format("%3d%n", number);
                    break;
                }
                s += String.format("%3d", number);
            }
        }
        return s;
    }
}
