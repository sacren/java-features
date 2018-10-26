/** Compute the product of integers from 1 to 10, 1 to 11, 1 to 12, 1 to 13 and 1 to 14. */
public class Product1ToN {
    /** Individually print out the product. */
    public static void main(String[] args) {
        final int first = 0;
        final int last = 5;
        final int base = 10;

        for (int i = first; i < last; i++) {
            System.out.printf("Product from 1 to %d is %d%n", base + i, computeProduct(base + i));
        }
    }

    /* Calculate the product from 1 to 10, 11, etc. */
    private static long computeProduct(int number) {
        /* Skip the first iterator as product is initialized to 1. */
        final int second = 2;
        /* Use long type to not go over bounds. */
        long product = 1;

        for (int i = second; i <= number; i++) {
            product *= i;
        }

        return product;
    }
}
