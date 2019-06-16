/**
 * BenchMark class for String, StringBuffer and StringBuilder.
 *
 * <p>Private instance data:
 * -original:String
 *
 * <p>Public methods:
 * +getTimeBuild()
 * +getTimeRvsLp():long
 * +getTimeRvsArray():long
 * +getTimeSfLp():long
 * +getTimeSf():long
 * +getTimeSbLp():long
 * +getTimeSb():long
 * +toString():String
 */
public class BenchMark {
    /* private static data */
    private static final int CHAR_MIN = 10;
    private static final int CHAR_MAX = 35;

    /* private instance data */
    private String original;

    /** BenchMark getter for build time of long string. */
    public long getTimeBuild() {
        long start;
        int size = 16536;
        int numeric = CHAR_MIN;
        start = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            sb.append(Character.forDigit(numeric++, CHAR_MAX + 1));
            if (numeric > CHAR_MAX) {
                numeric = CHAR_MIN;
            }
        }
        original = sb.toString();
        return System.nanoTime() - start;
    }

    /** BenchMark getter for String by loop. */
    public long getTimeRvsLp() {
        long start;
        String reversed = "";
        int size = original.length();
        char[] list = original.toCharArray();
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            reversed += list[size - i - 1];
        }
        return System.nanoTime() - start;
    }

    /** BenchMark getter for String by array. */
    public long getTimeRvsArray() {
        long start;
        String reversed = "";
        start = System.nanoTime();
        for (char c : original.toCharArray()) {
            reversed = c + reversed;
        }
        return System.nanoTime() - start;
    }

    /** BenchMark getter for StringBuffer by array. */
    public long getTimeSfLp() {
        long start;
        String reversed;
        start = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (char c : original.toCharArray()) {
            sb.insert(0, c);
        }
        reversed = sb.toString();
        return System.nanoTime() - start;
    }

    /** BenchMark getter for StringBuffer. */
    public long getTimeSf() {
        long start;
        String reversed;
        start = System.nanoTime();
        StringBuffer sb = new StringBuffer(original);
        reversed = sb.reverse().toString();
        return System.nanoTime() - start;
    }

    /** BenchMark getter for StringBuilder by loop. */
    public long getTimeSbLp() {
        long start;
        String reversed;
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (char c : original.toCharArray()) {
            sb.insert(0, c);
        }
        reversed = sb.toString();
        return System.nanoTime() - start;
    }

    /** BenchMark getter for StringBuilder. */
    public long getTimeSb() {
        long start;
        String reversed;
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder(original);
        reversed = sb.reverse().toString();
        return System.nanoTime() - start;
    }

    /** BenchMark string method. */
    public String toString() {
        return String.format(
                "Time: %d usec (String Build)%n"
                        + "Time: %d usec (String Loop)%n"
                        + "Time: %d usec (String Array)%n"
                        + "Time: %d usec (StringBuffer Loop)%n"
                        + "Time: %d usec (StringBuffer)%n"
                        + "Time: %d usec (StringBuilder Loop)%n"
                        + "Time: %d usec (StringBuilder)",
                getTimeBuild() / 1000,
                getTimeRvsLp() / 1000,
                getTimeRvsArray() / 1000,
                getTimeSfLp() / 1000,
                getTimeSf() / 1000,
                getTimeSbLp() / 1000,
                getTimeSb() / 1000);
    }
}
