/** Print ONE, TWO, THREE for 1, 2, 3. */
public class PrintNumberInWord {
    public static void main(String[] args) {
        printWord();
    }

    private static void printWord() {
        int number = 8;
        String word;

        switch (number) {
            case 1:
                word = "ONE";
                break;
            case 2:
                word = "TWO";
                break;
            case 3:
                word = "THREE";
                break;
            case 4:
                word = "FOUR";
                break;
            case 5:
                word = "FIVE";
                break;
            case 6:
                word = "SIX";
                break;
            case 7:
                word = "SEVEN";
                break;
            case 8:
                word = "EIGHT";
                break;
            case 9:
                word = "NINE";
                break;
            default:
                word = "OTHER";
        }

        System.out.println(word);
    }
}
