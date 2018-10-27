/** Multiplication of six integers. */
public class SixNumberProduct {
    /** Print out the product of six integers. */
    public static void main(String[] args) {
        System.out.printf("The product of 11, 22, 33, 44, 55 and 66 is %d%n", productOfSix());
    }

    /* Calculate the product of six integers. */
    private static int productOfSix() {
        int[] numbers = {11, 22, 33, 44, 55, 66};
        int product = numbers[0];
        final int first = 1;
        final int size = numbers.length;

        for (int i = first; i < size; i++) {
            product *= numbers[i];
        }

        return product;
    }
}
