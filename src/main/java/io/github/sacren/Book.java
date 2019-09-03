/**
 * Book class models a book with one and only one author.
 *
 * <p>The author is an instance of Author class.
 *
 * <p>Private instance data:
 * -name:String
 * -author:Author
 * -price:double
 * -sales:int
 *
 * <p>Constructor:
 * +Book(name:String, author:Author, price:double, sales:int)
 *
 * <p>Public methods:
 * +setName(name:String):void
 * +setAuthor(author:Author):void
 * +setPrice(price:double):void
 * +setSales(sales:int):void
 * +getName():String
 * +getAuthor():Author
 * +getPrice():double
 * +getSales():int
 * +toString():String
 */
public class Book {
    /* private instance variables */
    private String name;
    private Author author;
    private double price;
    private int sales;

    /** Book class custom constructor. */
    public Book(String name, Author author, double price, int sales) {
        setName(name);
        setAuthor(author);
        setPrice(price);
        setSales(sales);
    }

    /** Book setter for book name. */
    public void setName(String name) {
        this.name = name;
    }

    /** Book setter for book author. */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /** Book setter for book price. */
    public void setPrice(double price) {
        this.price = price;
    }

    /** Book setter for book sales. */
    public void setSales(int sales) {
        this.sales = sales;
    }

    /** Book getter for the book name. */
    public String getName() {
        return name;
    }

    /** Book getter for author info. */
    public Author getAuthor() {
        return author;
    }

    /** Book getter for the book price. */
    public double getPrice() {
        return price;
    }

    /** Book getter for book sales. */
    public int getSales() {
        return sales;
    }

    /** Book instance formatted string. */
    public String toString() {
        return String.format(
                "Book name:    %s%n"
                        + "%s%n"
                        + "Price:         %.2f%n"
                        + "Sales:         %d",
                name,
                author,
                price,
                sales);
    }
}
