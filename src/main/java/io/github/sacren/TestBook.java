/**
 * Test driver for Book class.
 */
public class TestBook {
    /** Book test driver. */
    public static void main(String[] args) {
        /* Book default constructor */
        System.out.println();
        System.out.println("=== Book instance using default constructor ===");
        System.out.println();
        System.out.println(new Book());
        /* Book class */
        Author[] authors = new Author[2];
        authors[0] = new Author("Brian Kernighan", "bwk@bell-labs.com", 'M');
        authors[1] = new Author("Dennis Ritchie", "dmr@bell-labs.com", 'M');
        String name = "The C Programming Language";
        Book book = new Book(name, authors, 29.99, 90000);
        System.out.println();
        System.out.println("=== Book instance using custom constructor ===");
        System.out.println();
        System.out.println(book);
        System.out.println();
        System.out.printf(
                "Book name:     %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d%n",
                book.getName(),
                book.getAllAuthInfo(),
                book.getPrice(),
                book.getSales());
        /* update book */
        System.out.println();
        System.out.println("=== After update book price and sales ===");
        System.out.println();
        book.setPrice(69.99);
        book.setSales(1900);
        System.out.println(book);
        System.out.println();
        System.out.printf(
                "Book name:     %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d%n",
                book.getName(),
                book.getAllAuthInfo(),
                book.getPrice(),
                book.getSales());
        /* use a list of Author instances but exclude sales */
        Author[] dummyAuthors = new Author[3];
        dummyAuthors[0] = new Author("Peter Pan", "peter@never.land", 'M');
        dummyAuthors[1] = new Author("Wendy", "wendy@never.land", 'F');
        dummyAuthors[2] = new Author("Tinker Bell", "tinker@never.land", 'F');
        Book dummy = new Book("Java for Dummies", dummyAuthors, 19.99);
        System.out.println();
        System.out.println("=== Book of a list of Author instances ===");
        System.out.println();
        System.out.println(dummy);
        System.out.println();
        System.out.println("=== Info of list of Author instances via Book ===");
        System.out.println();
        System.out.println(dummy.getAllAuthInfo());
    }
}
