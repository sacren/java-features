/**
 * PattCoza class.
 *
 * <p>Coza replaces multiple of 3, Loza of 5, Woza of 7 and CozaLoza of 3 and 5.
 *
 * <p>Private instance data:
 * -str:String
 *
 * <p>Constructor:
 * +PattCoza()
 *
 * <p>Public methods:
 * +filter():void
 * +toString():String
 */
public class PattCoza {
    /* private static data */
    private static String COZA = "Coza";
    private static String LOZA = "Loza";
    private static String WOZA = "Woza";
    private static String COZALOZA = "CozaLoza";

    /* private instance data */
    private String str;

    /** PattCoza constructor. */
    public PattCoza() {
        filter();
    }

    /** PattCoza method to filter with patterns. */
    public void filter() {
        str = "";
        for (int i = 1; i <= 110; i++) {
            if (i > 1) {
                if (i % 10 == 1) {
                    str += String.format("%n");
                } else {
                    str += " ";
                }
            }
            if (i % 3 == 0 && i % 5 == 0) {
                str += String.format("%s", COZALOZA);
                continue;
            }
            if (i % 3 == 0) {
                str += String.format("%s", COZA);
                continue;
            }
            if (i % 5 == 0) {
                str += String.format("%s", LOZA);
                continue;
            }
            if (i % 7 == 0) {
                str += String.format("%s", WOZA);
                continue;
            }
            str += String.format("%d", i);
        }
    }

    /** PattCoza instance printout. */
    public String toString() {
        return str;
    }
}
