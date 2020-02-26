/**
 * Test driver for Author class.
 */
public class TestAuthor {
    /** Test driver for Author. */
    public static void main(String[] args) {
        /* Author class */
        Author origin = new Author("Dennis Ritchie", "dmr@bell-labs.com", new Gender('M'));
        Author author = origin.clone();
        System.out.println();
        System.out.println("=== Author class ===");
        System.out.println();
        System.out.println(author);
        System.out.println();
        System.out.printf(
                "Author name:   %s%n"
                        + "Author email:  %s%n"
                        + "Author gender: %s%n",
                author.getName(),
                author.getEmail(),
                author.getGender());
        /* delete Author instance private data */
        author.setName(null);
        author.setEmail(null);
        author.setGender();
        System.out.println();
        System.out.println("=== After deleting Auther instance private data ===");
        System.out.println();
        System.out.println(author);
        /* restore Author instance private data */
        author.setName(origin.getName());
        author.setEmail(origin.getEmail());
        author.setGender(origin.getGender());
        System.out.println();
        System.out.println("=== After restoring Author instance private data ===");
        System.out.println();
        System.out.println(author);
    }
}
