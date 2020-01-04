/**
 * Prime class for a list of prime numbers.
 *
 * <p>Private instance data:
 * -bound:int
 * -list:int[]
 * -primes:String
 *
 * <p>Constructor:
 * +Prime(bound:int)
 *
 * <p>Public methods:
 * +setBound(bound:int):void
 * +getBound():int
 * +isPrime(num:int):boolean
 * +primeCount():int
 * +setList():void
 * +getList():int[]
 * +setFormat():void
 * +toString():String
 */
public class Prime {
    /* private static data */
    private static final int MAX_NUM = 1000000;

    /* private instance data */
    private int bound;
    private int[] list;
    private String primes;

    /** Prime constructor. */
    public Prime(int bound) {
        setBound(bound);
        setList();
        setFormat();
    }

    /** Prime setter for the range. */
    public void setBound(int bound) {
        if (bound <= 0 || bound > MAX_NUM) {
            throw new IllegalArgumentException(
                    String.format("%d is out of range!", bound));
        }
        this.bound = bound;
    }

    /** Prime getter for the instance number. */
    public int getBound() {
        return bound;
    }

    /** Prime getter if the number is prime. */
    public boolean isPrime(int num) {
        /* 6k ± 1 optimization */
        if (num <= 3) {
            return num > 1;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    /** Prime method for the count of prime numbers. */
    public int primeCount() {
        int count = 0; /* for 0 and 1 */
        if (bound > 1) {
            count = 1; /* for 2 and above */
        }
        for (int i = 3; i <= bound; i += 2) { /* from 3 and odd numbers */
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    /** Prime setter for the list of prime numbers. */
    public void setList() {
        int size = 0;
        list = new int[primeCount()];
        if (bound == 1) { /* empty list of prime numbers */
            return;
        }
        if (bound == 2) {
            list[size] = 2;
            return;
        }
        list[size++] = 2; /* special treatment of even prime */
        for (int i = 3; i <= bound; i += 2) { /* odd numbers */
            if (isPrime(i)) {
                list[size++] = i;
            }
        }
    }

    /** Prime setter for the formatted list of prime numbers. */
    public void setFormat() {
        StringBuilder sb = new StringBuilder();
        int column = 1;
        if (list.length == 0) {
            primes = "No prime number";
            return;
        }
        for (int prime : list) {
            sb.append(String.format("%-8d", prime));
            if (column++ == 10) {
                if (prime < 100) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                if (prime < 1000) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                if (prime < 10000) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                if (prime < 100000) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                if (prime < 10000) {
                    sb.deleteCharAt(sb.length() - 1);
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.append(String.format("%n"));
                column = 1;
            }
        }
        primes = sb.toString();
    }

    /** Prime getter for the list of prime numbers. */
    public int[] getList() {
        return list;
    }

    /** Prime string method. */
    public String toString() {
        return String.format(
                "%s%n%n"
                        + "Prime number total:   %d%n"
                        + "Prime number percent: %.2f%%",
                primes,
                primeCount(),
                (double) primeCount() / bound * 100);
    }
}
