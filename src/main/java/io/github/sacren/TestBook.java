/**
 * Test driver for Book class.
 */
public class TestBook {
    /** Initialize Book instance and print book info. */
    public static void main(String[] args) {
        Author author = new Author("Dennis Ritchie", "dmr@bell-labs.com", 'M');
        String title = "The C Programming Language";
        final double price = 29.99;
        final int sales = 90000;
        Book book = new Book(title, author, price, sales);
        System.out.println(book);
        System.out.printf(
                "Book Title: %s%n"
                        + "%s%n"
                        + "Price: %.2f%n"
                        + "Sales: %d%n%n",
                book.getBookTitle(),
                author,
                book.getPrice(),
                book.getSales());
        System.out.println("=== After price doubles and sales fall to half ===");
        System.out.println();
        book.setPrice(price * 2);
        book.setSales(sales / 2);
        System.out.println(book);
        System.out.printf(
                "Book Title: %s%n"
                        + "%s%n"
                        + "Price: %.2f%n"
                        + "Sales: %d%n",
                book.getBookTitle(),
                author,
                book.getPrice(),
                book.getSales());
    }
}
