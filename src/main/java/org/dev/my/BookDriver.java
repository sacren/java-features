/**
 * Book driver.
 */
public class BookDriver {
    /** Initialize Book instance and print book info. */
    public static void main(String[] args) {
        String authorName = "Dennis Ritchie";
        String email = "dmr@bell-labs.com";
        final char gender = 'M';
        Author author = new Author(authorName, email, gender);
        String bookName = "The C Programming Language";
        final double price = 29.99;
        final int quantity = 90000;
        Book book = new Book(bookName, author, price, quantity);
        System.out.print(book);
    }
}
