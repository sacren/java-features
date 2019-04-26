/**
 * Tax class for income tax calculation.
 *
 * <p>(1) Income $20,000 or below is exempt.
 * (2) Income above $20,000 but $40,000 or below has the rate of 10%.
 * (3) Income above $40,000 but $60,000 or below has the rate of 20%.
 * (4) Income above $60,000 is 30%.
 * (5) Tax rebate of 10% of total tax payable with max of $1,000.
 * (6) If income is negative, terminate tax calculation.
 *
 * <p>Private instance data:
 * -income:double
 * -tax:double
 *
 * <p>Constructor:
 * +Tax(income:double)
 *
 * <p>Public methods:
 * +calc():void
 * +rebate():double
 * +toString():String
 */
public class Tax {
    /* private static data */
    private static final double TAX_RATE_20K = 0.1;
    private static final double TAX_RATE_40K = 0.2;
    private static final double TAX_RATE_60K = 0.3;
    private static final int TAX_STEP = 20000;
    private static final int INCOME_60K = 60000;
    private static final int INCOME_40K = 40000;
    private static final int INCOME_20K = 20000;
    private static final int MAX_TAX_REBATE = 1000;
    private static final double REBATE_RATE = 0.1;

    /* private instance data */
    private double income;
    private double tax;

    /** Tax constructor. */
    public Tax(double income) {
        this.income = income;
        calc();
    }

    /** Tax method to calculate tax. */
    public void calc() {
        if (income < 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid income!", income));
        }
        for ( ; ; ) {
            if (income > INCOME_60K) {
                tax = TAX_STEP * TAX_RATE_20K
                            + TAX_STEP * TAX_RATE_40K
                            + (income - INCOME_60K) * TAX_RATE_60K;
                break;
            }
            if (income > INCOME_40K) {
                tax = TAX_STEP * TAX_RATE_20K + (income - INCOME_40K) * TAX_RATE_40K;
                break;
            }
            if (income > INCOME_20K) {
                tax = (income - INCOME_20K) * TAX_RATE_20K;
                break;
            }
            tax = 0;
            break;
        }
        tax -= rebate();
    }

    /** Tax method for tax rebate. */
    public double rebate() {
        double rebate = tax * REBATE_RATE;
        if (rebate > MAX_TAX_REBATE) {
            rebate = MAX_TAX_REBATE;
        }
        return rebate;
    }

    /** Tax instance printout. */
    public String toString() {
        return String.format(
                "Income: %.2f%n"
                        + "Tax:    %.2f",
                income,
                tax);
    }
}
