/**
 * Test driver for Book class.
 */
public class TestBook {
    /** Book test driver. */
    public static void main(String[] args) {
        /* Book class */
        Author dennis = new Author("Dennis Ritchie", "dmr@bell-labs.com", 'M');
        String title = "The C Programming Language";
        Book langC = new Book(title, dennis, 29.99, 90000);
        System.out.println();
        System.out.println("=== Book class ===");
        System.out.println();
        System.out.println(langC);
        System.out.println();
        System.out.printf(
                "Book Title:    %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d%n%n",
                langC.getTitle(),
                dennis,
                langC.getPrice(),
                langC.getSales());
        /* update book */
        System.out.println("=== After update book price and sales ===");
        System.out.println();
        langC.setPrice(69.99);
        langC.setSales(1900);
        System.out.println(langC);
        System.out.println();
        System.out.printf(
                "Book Title:    %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d%n",
                langC.getTitle(),
                dennis,
                langC.getPrice(),
                langC.getSales());
    }
}
