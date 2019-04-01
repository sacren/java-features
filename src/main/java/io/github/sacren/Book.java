/**
 * Book class composed of Author class.
 *
 * <p>Private data:
 * -bookTitle:String
 * -author:Author
 * -price:double
 * -sales:int
 *
 * <p>Constructor:
 * +Book(bookTitle:String, author:Author, price:double, sales:int)
 *
 * <p>Public methods:
 * +getBookTitle():String
 * +getAuthor():Author
 * +getPrice():double
 * +setPrice(price:double):void
 * +getSales():int
 * +setSales(sales:int):void
 * +toString():String
 */
public class Book {
    /* private instance data */
    private String bookTitle;
    private Author author;
    private double price;
    private int sales;

    /** Custom constructor. */
    public Book(String bookTitle, Author author, double price, int sales) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
        this.sales = sales;
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

    /** Public accessor for book sales. */
    public int getSales() {
        return sales;
    }

    /** Public setter for book sales. */
    public void setSales(int sales) {
        this.sales = sales;
    }

    /** Book description. */
    public String toString() {
        return String.format(
                "%s%n"
                        + "%s%n"
                        + "Price: %.2f%n"
                        + "Sales: %d",
                bookTitle,
                author,
                price,
                sales);
    }
}
