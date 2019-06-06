/**
 * PattCoza class.
 *
 * <p>Coza replaces multiple of 3, Loza of 5, Woza of 7 and CozaLoza of 3 and 5.
 *
 * <p>Public method:
 * +toString():String
 */
public class PattCoza {
    /** PattCoza string method. */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 110; i++) {
            if (i > 1) {
                if (i % 10 == 1) {
                    sb.append(String.format("%n"));
                } else {
                    sb.append(" ");
                }
            }
            if (i % 3 == 0 && i % 5 == 0) {
                sb.append("CozaLoza");
                continue;
            }
            if (i % 3 == 0) {
                sb.append("Coza");
                continue;
            }
            if (i % 5 == 0) {
                sb.append("Loza");
                continue;
            }
            if (i % 7 == 0) {
                sb.append("Woza");
                continue;
            }
            sb.append(i);
        }
        return sb.toString();
    }
}
