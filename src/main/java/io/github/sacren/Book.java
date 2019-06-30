/**
 * Book class composed of Author class.
 *
 * <p>Private instance data:
 * -title:String
 * -author:Author
 * -price:double
 * -sales:int
 *
 * <p>Constructor:
 * +Book(title:String, author:Author, price:double, sales:int)
 *
 * <p>Public methods:
 * +getTitle():String
 * +getAuthor():Author
 * +getPrice():double
 * +setPrice(price:double):void
 * +getSales():int
 * +setSales(sales:int):void
 * +toString():String
 */
public class Book {
    /* private instance data */
    private String title;
    private Author author;
    private double price;
    private int sales;

    /** Book constructor. */
    public Book(String title, Author author, double price, int sales) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.sales = sales;
    }

    /** Book getter for the book title. */
    public String getTitle() {
        return title;
    }

    /** Book getter for author info. */
    public Author getAuthor() {
        return author;
    }

    /** Book getter for the book price. */
    public double getPrice() {
        return price;
    }

    /** Book setter for book price. */
    public void setPrice(double price) {
        this.price = price;
    }

    /** Book getter for book sales. */
    public int getSales() {
        return sales;
    }

    /** Book setter for book sales. */
    public void setSales(int sales) {
        this.sales = sales;
    }

    /** Book string method. */
    public String toString() {
        return String.format(
                "Book title:    %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d",
                title,
                author,
                price,
                sales);
    }
}
