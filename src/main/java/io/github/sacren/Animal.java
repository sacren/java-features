/**
 * Animal class.
 *
 *           <p>'__'
 *              (oo)
 *      +========\/
 *     / || %%% ||
 *    *  ||-----||
 *       ""     ""
 *
 * <p>Private static data:
 * -count:int
 *
 * <p>Constructor:
 * +Animal()
 *
 * <p>Animal method:
 * +toString():String
 */
public class Animal {
    /* private static data */
    private static int count;

    /** Animal constructor. */
    public Animal() {
        count++;
    }

    /* static helper for repetitive characters */
    private static StringBuffer add(char ch, int size) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            sb.append(ch);
        }
        return sb;
    }

    /** Animal string method. */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("(%d)%n", count));
        sb.append(add(' ', 3));
        sb.append(add(' ', 10));
        sb.append('\'');
        sb.append(add('_', 2));
        sb.append(String.format("%c%n", '\''));
        sb.append(add(' ', 3));
        sb.append(add(' ', 10));
        sb.append('(');
        sb.append(add('o', 2));
        sb.append(String.format("%c%n", ')'));
        sb.append(add(' ', 3));
        sb.append(add(' ', 2));
        sb.append('+');
        sb.append(add('=', 8));
        sb.append(String.format("%c%c%n", '\\', '/'));
        sb.append(add(' ', 3));
        sb.append(" / ");
        sb.append(add('|', 2));
        sb.append(' ');
        sb.append(add('%', 3));
        sb.append(' ');
        sb.append(add('|', 2));
        sb.append(String.format("%n"));
        sb.append(add(' ', 3));
        sb.append('*');
        sb.append(add(' ', 2));
        sb.append(add('|', 2));
        sb.append(add('-', 5));
        sb.append(add('|', 2));
        sb.append(String.format("%n"));
        sb.append(add(' ', 3));
        sb.append(add(' ', 3));
        sb.append(add('"', 2));
        sb.append(add(' ', 5));
        sb.append(add('"', 2));
        return sb.toString();
    }
}
