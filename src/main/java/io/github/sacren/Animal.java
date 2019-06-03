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
 * <p>Animal method:
 * +toString():String
 */
public class Animal {
    /* helper for repetitive characters. */
    private static String add(char c, int count) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

    /** Animal string method. */
    public String toString() {
        StringBuffer sb = new StringBuffer();
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
