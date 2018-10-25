/** Print the given integer is odd or even. */
public class CheckOddEven {
    public static void main(String[] args) {
        printOddEven();
    }

    private static void printOddEven() {
        int n1 = 0;
        int n2 = 49;
        final int n3 = 1028;
        final int n4 = -1;

        isOddOrEven(n1);
        isOddOrEven(n2);
        isOddOrEven(n3);
        isOddOrEven(n4);
    }

    private static void isOddOrEven(int number) {
        int remainder = number % 2;

        if (remainder == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
