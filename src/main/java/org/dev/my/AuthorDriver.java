/**
 * Author driver.
 */
public class AuthorDriver {
    /** Instantiate Author and print instance details. */
    public static void main(String[] args) {
        String name = "Dennis Ritchie";
        String email = "dmr@bell-labs.com";
        final char gender = 'M';
        Author author = new Author(name, email, gender);
        System.out.print(author);
        System.out.println();
        System.out.printf(
                "The C Programming Language is authored by %s.%n"
                        + "Send email to %s for questions.%n",
                author.getName(), author.getEmail());
    }
}
