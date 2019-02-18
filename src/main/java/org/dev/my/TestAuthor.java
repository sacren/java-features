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
        System.out.println(author);
        System.out.printf(
                "The C Programming Language is authored by %s.%n"
                        + "Send email to %s for questions.%n",
                author.getAuthorName(), author.getEmail());
        System.out.println();
        System.out.printf("After deleting email address.%n%n");
        author.setEmail("");
        System.out.println(author);
        System.out.printf("After restoring email address.%n%n");
        author.setEmail(email);
        System.out.print(author);
    }
}
