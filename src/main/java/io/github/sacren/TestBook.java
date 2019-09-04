/**
 * Test driver for Book class.
 */
public class TestBook {
    /** Book test driver. */
    public static void main(String[] args) {
        /* Book class */
        Author author = new Author("Dennis Ritchie", "dmr@bell-labs.com", 'M');
        String name = "The C Programming Language";
        Book book = new Book(name, author, 29.99, 90000);
        System.out.println();
        System.out.println("=== Book class ===");
        System.out.println();
        System.out.println(book);
        System.out.println();
        System.out.printf(
                "Book name:     %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d%n%n",
                book.getName(),
                author,
                book.getPrice(),
                book.getSales());
        /* update book */
        System.out.println("=== After update book price and sales ===");
        System.out.println();
        book.setPrice(69.99);
        book.setSales(1900);
        System.out.println(book);
        System.out.println();
        System.out.printf(
                "Book name:     %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d%n",
                book.getName(),
                author,
                book.getPrice(),
                book.getSales());
        /* use anonymous Author instance */
        Book dummy = new Book(
                "Java for Dummies",
                new Author("Peter Pan", "pan@nowhere.net", 'M'),
                19.99,
                9000);
        System.out.println();
        System.out.println("=== Book of anonymous Author instance ===");
        System.out.println();
        System.out.println(dummy);
    }
}
