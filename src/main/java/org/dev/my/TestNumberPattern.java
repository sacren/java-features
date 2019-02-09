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
    /** Ask the user for the size and print the pattern. */
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.print("Enter the size (max 24, min 4) of number pattern: ");
        int size = inputStream.nextInt();
        if (size < 4 || size > 24) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", size));
        }
        System.out.println();
        bottomLeft(size);
        centerId(size, 'a');
        System.out.println();
        topRight(size);
        centerId(size, 'b');
        System.out.println();
        bottomRight(size);
        centerId(size, 'c');
        System.out.println();
        topLeft(size);
        centerId(size, 'd');
        inputStream.close();
    }

    /** Annotate pattern with centered ID. */
    public static void centerId(int size, char id) {
        for (int i = 0; i < size / 2; i++) {
            System.out.printf("%3c", ' ');
        }

        System.out.printf("(%c)%n", id);
    }

    /** Print pattern with right angle at bottom-left corner. */
    public static void bottomLeft(int size) {
        final int firstCount = 1;

        for (int row = firstCount; row <= size; row++) {
            for (int col = firstCount; col <= row; col++) {
                if (col == row) {
                    System.out.printf("%3d%n", col);
                    break;
                }

                System.out.printf("%3d", col);
            }
        }
    }

    /** Print pattern with right angle at top-right corner. */
    public static void topRight(int size) {
        final int firstCount = 1;
        int width;

        for (int row = firstCount; row <= size; row++) {
            width = size - row + 1;

            for (int col = firstCount; col < row; col++) {
                System.out.printf("%3c", ' ');
            }

            for (int col = firstCount; col <= width; col++) {
                if (col == width) {
                    System.out.printf("%3d%n", col);
                    break;
                }

                System.out.printf("%3d", col);
            }
        }
    }

    /** Print pattern with right angle at bottom-right corner. */
    public static void bottomRight(int size) {
        final int firstCount = 1;
        int width;
        int number;

        for (int row = firstCount; row <= size; row++) {
            width = size - row + 1;

            for (int col = firstCount; col < width; col++) {
                System.out.printf("%3c", ' ');
            }

            for (int col = firstCount; col <= row; col++) {
                number = row - col + 1;

                if (col == row) {
                    System.out.printf("%3d%n", number);
                    break;
                }

                System.out.printf("%3d", number);
            }
        }
    }

    /** Print pattern with right angle at top-left corner. */
    public static void topLeft(int size) {
        final int firstCount = 1;
        int sentinel;
        int number;

        for (int row = firstCount; row <= size; row++) {
            sentinel = size - row + 1;

            for (int col = firstCount; col <= size; col++) {
                number = sentinel - col + 1;

                if (col == sentinel) {
                    System.out.printf("%3d%n", number);
                    break;
                }

                System.out.printf("%3d", number);
            }
        }
    }
}
