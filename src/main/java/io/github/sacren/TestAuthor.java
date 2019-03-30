/**
 * Test driver for Author class.
 */
public class TestAuthor {
    /** Test driver for Author. */
    public static void main(String[] args) {
        String name = "Dennis Ritchie";
        String email = "dmr@bell-labs.com";
        final char gender = 'M';
        Author author = new Author(name, email, gender);
        System.out.println();
        System.out.println(author);
        System.out.println();
        System.out.printf(
                "The C Programming Language is authored by %s.%n"
                        + "Send email to %s for questions.%n",
                author.getAuthorName(),
                author.getEmail());
        /* reset author email */
        author.setEmail(null);
        System.out.println();
        System.out.println("=== After deleting email address ===");
        System.out.println();
        System.out.println(author);
        /* restore author email */
        author.setEmail(email);
        System.out.println();
        System.out.println("=== After restoring email address ===");
        System.out.println();
        System.out.println(author);
    }
}
