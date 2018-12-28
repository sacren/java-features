/**
 * Author driver.
 */
public class AuthorDriver {
    /** Instantiate Author and print instance details. */
    public static void main(String[] args) {
        String email = "dmr@bell-labs.com";
        Author author = new Author(null, email, Character.MIN_VALUE);
        System.out.print(author);
    }
}
