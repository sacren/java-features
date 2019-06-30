/**
 * Test driver for Author class.
 */
public class TestAuthor {
    /** Test driver for Author. */
    public static void main(String[] args) {
        /* Author class */
        String name = "Dennis Ritchie";
        String email = "dmr@bell-labs.com";
        Author dennis = new Author(name, email, 'M');
        System.out.println();
        System.out.println("=== Author class ===");
        System.out.println();
        System.out.println(dennis);
        System.out.println();
        System.out.printf(
                "The C Programming Language is authored by %s.%n"
                        + "Send email to %s for questions.%n",
                dennis.getName(),
                dennis.getEmail());
        /* delete author email */
        dennis.setEmail(null);
        System.out.println();
        System.out.println("=== After deleting email address ===");
        System.out.println();
        System.out.println(dennis);
        /* restore author email */
        dennis.setEmail(email);
        System.out.println();
        System.out.println("=== After restoring email address ===");
        System.out.println();
        System.out.println(dennis);
    }
}
