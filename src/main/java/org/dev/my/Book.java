/**
 * Book class.
 *
 * <p>Private data with default values:
 * -bookTitle:String
 * -author:Author
 * -price:double
 * -quantity:int
 *
 * <p>Constructor:
 * +Book(bookTitle:String, author:Author, price:double, quantity:int)
 *
 * <p>Public methods:
 * +getBookTitle():String
 * +getAuthor():Author
 * +getPrice():double
 * +setPrice(price:double):void
 * +getQuantity():int
 * +setQuantity(quantity:int):void
 * +toString():String
 */
public class Book {
    /* private instance data */
    private String bookTitle;
    private Author author;
    private double price;
    private int quantity;

    /** Custom constructor. */
    public Book(String bookTitle, Author author, double price, int quantity) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    /** Public accessor for book title. */
    public String getBookTitle() {
        return bookTitle;
    }

    /** Public accessor for Author instance. */
    public Author getAuthor() {
        return author;
    }

    /** Publice accessor for book price. */
    public double getPrice() {
        return price;
    }

    /** Public mutator for book price. */
    public void setPrice(double price) {
        this.price = price;
    }

    /** Public accessor for book quantity. */
    public int getQuantity() {
        return quantity;
    }

    /** Public setter for book quantity. */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /** Book description. */
    public String toString() {
        return String.format(
                "%s%n"
                        + "Author: %s%n"
                        + "Gender: %c%n"
                        + "Contact email: %s%n"
                        + "Price: %.2f%n"
                        + "Quantity: %d%n",
                getBookTitle(),
                author.getName(),
                author.getGender(),
                author.getEmail(),
                getPrice(),
                getQuantity());
    }
}
