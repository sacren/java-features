/**
 * Animal class.
 *
 * <p>Private data:
 * -animal:String
 *
 * <p>Constructor:
 * +Animal()
 *
 * <p>Animal methods:
 * +draw():void
 * +toString():String
 *
 *           <p>'__'
 *              (oo)
 *      +========\/
 *     / || %%% ||
 *    *  ||-----||
 *       ""     ""
 */
public class Animal {
    /* private instance data */
    private String animal;

    /** Animal constructor. */
    public Animal() {
        animal = "";
        draw();
    }

    public void draw() {
        addChar(' ', 3);
        addChar(' ', 10);
        animal += String.format("%c", '\'');
        addChar('_', 2);
        animal += String.format("%c%n", '\'');
        addChar(' ', 3);
        addChar(' ', 10);
        animal += String.format("%c", '(');
        addChar('o', 2);
        animal += String.format("%c", ')');
        animal += String.format("%n");
        addChar(' ', 3);
        addChar(' ', 2);
        animal += String.format("%c", '+');
        addChar('=', 8);
        animal += String.format("%c%c%n", '\\', '/');
        addChar(' ', 3);
        animal += String.format("%c%c%c", ' ', '/', ' ');
        addChar('|', 2);
        animal += String.format("%c", ' ');
        addChar('%', 3);
        animal += String.format("%c", ' ');
        addChar('|', 2);
        animal += String.format("%n");
        addChar(' ', 3);
        animal += String.format("%c", '*');
        addChar(' ', 2);
        addChar('|', 2);
        addChar('-', 5);
        addChar('|', 2);
        animal += String.format("%n");
        addChar(' ', 3);
        addChar(' ', 3);
        addChar('"', 2);
        addChar(' ', 5);
        addChar('"', 2);
    }

    /* helper for animal formatting */
    private void addChar(final char c, final int count) {
        for (int i = 0; i < count; i++) {
            animal += String.format("%c", c);
        }
    }

    /** Animal instance printout. */
    public String toString() {
        return animal;
    }
}
