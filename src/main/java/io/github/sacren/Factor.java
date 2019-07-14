/**
 * Factor class for a list of prime factors.
 *
 * <p>Private instance data:
 * -list:int[]
 * -prime:Prime
 *
 * <p>Constructor:
 * +Factor(bound:int)
 *
 * <p>Public methods:
 * +setSize():void
 * +setList():void
 * +isFactor(int num):boolean
 * +toString():String
 */
public class Factor {
    /* private instance data */
    private int[] list;
    private Prime prime;
    private String factors;

    /** Factor constructor. */
    public Factor(int bound) {
        prime = new Prime(bound);
        setSize();
        setList();
        setFormat();
    }

    /** Factor setter for how many factors. */
    public void setSize() {
        int size = 0;
        for (int i = 1; i <= prime.getBound(); i++) {
            if (isFactor(i)) {
                size++;
            }
        }
        list = new int[size];
    }

    /** Factor setter for the list of prime factors. */
    public void setList() {
        int size = 0;
        for (int i = 2; i <= prime.getBound(); i++) {
            if (isFactor(i)) {
                list[size++] = i;
            }
        }
    }

    /** Factor getter if it is the product of prime factors. */
    public boolean isFactor(int num) {
        int product = 1;
        for (int n : prime.getList()) {
            if (num % n == 0) {
                product *= n;
            }
        }
        if (prime.isPrime(num) || num == 1) {
            return false;
        }
        return product == num;
    }

    /** Factor setter for the formatted list of factors. */
    public void setFormat() {
        StringBuilder sb = new StringBuilder();
        int size = 0;
        if (list.length == 0) {
            factors = "No prime factor";
            return;
        }
        for (int factor : list) {
            sb.append(String.format("%-7d", factor));
            sb.append(' ');
            if (++size == 10) {
                sb.deleteCharAt(sb.length() - 1);
                sb.append(String.format("%n"));
                size = 0;
            }
        }
        factors = sb.toString();
    }

    /** Factor string method. */
    public String toString() {
        return String.format(
                "%s%n%n"
                        + "Factor total:   %d%n"
                        + "Factor percent: %.2f%%",
                factors,
                list.length,
                (double) list.length / prime.getBound() * 100);
    }
}
