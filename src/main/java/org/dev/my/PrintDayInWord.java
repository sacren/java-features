/** Print day of the week. */
public class PrintDayInWord {
    public static void main(String[] args) {
        printDay();
    }

    private static void printDay() {
        int day = 2;
        String word = "Not a valid day";

        switch (day) {
            case 0:
                word = "Sunday";
                break;
            case 1:
                word = "Monday";
                break;
            case 2:
                word = "Tuesday";
                break;
            case 3:
                word = "Wednesday";
                break;
            case 4:
                word = "Thursday";
                break;
            case 5:
                word = "Friday";
                break;
            case 6:
                word = "Saturday";
                break;
            default:
                word = "Not a valid day";
                break;
        }

        System.out.println(word);
    }
}
