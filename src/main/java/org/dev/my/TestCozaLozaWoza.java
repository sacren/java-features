/**
 * Print numbers from 1 to 110, 11 numbers per line, with "Coza" in place of the numbers that are
 * multiple of 3, "Loza" of 5, "Woza" of 7, "CozaLoza" of 3 and 5, and so on.
 *
 * <p>Example:
 *
 * <p>1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11 Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
 * 23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza ...
 */
public class TestCozaLozaWoza {
    public static void main(String[] args) {
        printCoza();
    }

    private static void printCoza() {
        int upperBound = 110;
        int lowerBound = 1;
        String coza = "Coza";
        String loza = "Loza";
        String woza = "Woza";
        String cozaloza = "CozaLoza";

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (i % 11 == 0) {
                    System.out.print(cozaloza);
                    System.out.println();
                } else {
                    System.out.print(cozaloza);
                    System.out.print(" ");
                }
                continue;
            }

            if (i % 3 == 0) {
                if (i % 11 == 0) {
                    System.out.print(coza);
                    System.out.println();
                } else {
                    System.out.print(coza);
                    System.out.print(" ");
                }
                continue;
            }

            if (i % 5 == 0) {
                if (i % 11 == 0) {
                    System.out.print(loza);
                    System.out.println();
                } else {
                    System.out.print(loza);
                    System.out.print(" ");
                }
                continue;
            }

            if (i % 7 == 0) {
                if (i % 11 == 0) {
                    System.out.print(woza);
                    System.out.println();
                } else {
                    System.out.print(woza);
                    System.out.print(" ");
                }
                continue;
            }

            System.out.print(i);

            if (i % 11 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
