/**
 * Test driver for Author class.
 */
public class TestAuthor {
    /** Test driver for Author. */
    public static void main(String[] args) {
        /* Author class */
        String name = "Dennis Ritchie";
        String email = "dmr@bell-labs.com";
        char gender = 'M';
        Author author = new Author(name, email, gender);
        System.out.println();
        System.out.println("=== Author class ===");
        System.out.println();
        System.out.println(author);
        System.out.println();
        System.out.printf(
                "The C Programming Language is authored by %s.%n"
                        + "Send email to %s for questions.%n",
                author.getName(),
                author.getEmail());
        /* delete Author instance private data */
        author.setName(null);
        author.setEmail(null);
        author.setGender(' ');
        System.out.println();
        System.out.println("=== After deleting Auther instance private data ===");
        System.out.println();
        System.out.println(author);
        /* restore Author instance private data */
        author.setName(name);
        author.setEmail(email);
        author.setGender(gender);
        System.out.println();
        System.out.println("=== After restoring Author instance private data ===");
        System.out.println();
        System.out.println(author);
    }
}
