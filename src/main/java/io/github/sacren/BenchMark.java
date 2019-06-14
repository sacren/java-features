/**
 * BenchMark class for String, StringBuffer and StringBuilder.
 *
 * <p>Private instance data:
 * -original:String
 *
 * <p>Constructor:
 * +BenchMark()
 *
 * <p>Public methods:
 * +set()
 * +getTimeStrIdx():long
 * +getTimeString():long
 * +getTimeStrBuffIdx():long
 * +getTimeStrBuff():long
 * +getTimeStrBldIdx():long
 * +getTimeStrBld():long
 * +toString():String
 */
public class BenchMark {
    /* private static data */
    private static final int CHAR_MIN = 10;
    private static final int CHAR_MAX = 35;

    /* private instance data */
    private String original;

    /** BenchMark constructor. */
    public BenchMark() {
        set();
    }

    /** BenchMark setter for the long string. */
    public void set() {
        int size = 16536;
        int numeric = CHAR_MIN;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            sb.append(Character.forDigit(numeric++, CHAR_MAX + 1));
            if (numeric > CHAR_MAX) {
                numeric = CHAR_MIN;
            }
        }
        original = sb.toString();
    }

    /** BenchMark getter for String by loop. */
    public long getTimeStrIdx() {
        long start;
        long estimate;
        String reversed = "";
        int size = original.length();
        char[] list = original.toCharArray();
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            reversed += list[size - i - 1];
        }
        estimate = System.nanoTime() - start;
        return estimate;
    }

    /** BenchMark getter for String by array. */
    public long getTimeString() {
        long start;
        long estimate;
        String reversed = "";
        start = System.nanoTime();
        for (char c : original.toCharArray()) {
            reversed = c + reversed;
        }
        estimate = System.nanoTime() - start;
        return estimate;
    }

    /** BenchMark getter for StringBuffer by array. */
    public long getTimeStrBuffIdx() {
        long start;
        String reversed;
        start = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (char c : original.toCharArray()) {
            sb.insert(0, c);
        }
        reversed = sb.toString();
        long estimate = System.nanoTime() - start;
        return estimate;
    }

    /** BenchMark getter for StringBuffer. */
    public long getTimeStrBuff() {
        long start;
        long estimate;
        String reversed;
        start = System.nanoTime();
        StringBuffer sb = new StringBuffer(original);
        reversed = sb.reverse().toString();
        estimate = System.nanoTime() - start;
        return estimate;
    }

    /** BenchMark getter for StringBuilder by loop. */
    public long getTimeStrBldIdx() {
        long start;
        String reversed;
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (char c : original.toCharArray()) {
            sb.insert(0, c);
        }
        reversed = sb.toString();
        long estimate = System.nanoTime() - start;
        return estimate;
    }

    /** BenchMark getter for StringBuilder. */
    public long getTimeStrBld() {
        long start;
        long estimate;
        String reversed;
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder(original);
        reversed = sb.reverse().toString();
        estimate = System.nanoTime() - start;
        return estimate;
    }

    /** BenchMark string method. */
    public String toString() {
        return String.format(
                "Time: %d usec (String Loop)%n"
                        + "Time: %d usec (String Array)%n"
                        + "Time: %d usec (StringBuffer Loop)%n"
                        + "Time: %d usec (StringBuffer)%n"
                        + "Time: %d usec (StringBuilder Loop)%n"
                        + "Time: %d usec (StringBuilder)",
                getTimeStrIdx() / 1000,
                getTimeString() / 1000,
                getTimeStrBuffIdx() / 1000,
                getTimeStrBuff() / 1000,
                getTimeStrBldIdx() / 1000,
                getTimeStrBld() / 1000);
    }
}
