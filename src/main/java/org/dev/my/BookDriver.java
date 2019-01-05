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
        String bookTitle = "The C Programming Language";
        final double price = 29.99;
        final int quantity = 90000;
        Book book = new Book(bookTitle, author, price, quantity);
        System.out.print(book);
        System.out.println();
        System.out.printf("After price doubles and order slashed to half.%n%n");
        book.setPrice(price * 2);
        book.setQuantity(quantity / 2);
        System.out.print(book);
    }
}
