/**
 * SalesTax class for price and tax of 7% rate.
 *
 * <p>Private instance data:
 * -price:double
 *
 * <p>Constructor:
 * +SalesTax(price:double)
 *
 * <p>Public methods:
 * +getPreTax():double
 * +getTax():double
 * +toString():String
 */
import java.util.Scanner;

public class SalesTax {
    /* private static data */
    private static final double TAX_RATE = 0.07;

    /* private instance data */
    private double price;

    /** SalesTax constructor. */
    public SalesTax(double price) {
        this.price = price;
    }

    /** SalesTax getter for the pretax sales price. */
    public double getPreTax() {
        return price / (1 + TAX_RATE);
    }

    /** SalesTax getter for the sales tax amount. */
    public double getTax() {
        return price - getPreTax();
    }

    /** SalesTax string method. */
    public String toString() {
        return String.format(
                "The pretax price:   %.2f%n"
                        + "The 7%% sales tax:   %.2f%n"
                        + "The price with tax: %.2f",
                getPreTax(),
                getTax(),
                price);
    }
}
