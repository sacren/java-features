/**
 * Prime class for a list of prime numbers.
 *
 * <p>Private instance data:
 * -num:int
 * -list:int[]
 * -size:int
 * -primes:String
 *
 * <p>Constructor:
 * +Prime(num:int)
 *
 * <p>Public methods:
 * +setNum(num:int):void
 * +getNum():int
 * +isPrime(num:int):boolean
 * +setSize():void
 * +setList():void
 * +getList():int[]
 * +setFormat():void
 * +toString():String
 */
public class Prime {
    /* private static data */
    private static final int MAX_NUM = 1000000;

    /* private instance data */
    private int num;
    private int[] list;
    private int size;
    private String primes;

    /** Prime constructor. */
    public Prime(int num) {
        setNum(num);
        setSize();
        setList();
        setFormat();
    }

    /** Prime setter for the range. */
    public void setNum(int num) {
        if (num <= 0 || num > MAX_NUM) {
            throw new IllegalArgumentException(
                    String.format("%d is out of range!", num));
        }
        this.num = num;
    }

    /** Prime getter for the instance number. */
    public int getNum() {
        return num;
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

    /** Prime setter for how many prime numbers. */
    public void setSize() {
        size = 0; /* for 0 and 1 */
        if (num > 1) {
            size = 1; /* for 2 and above */
        }
        for (int i = 3; i <= num; i += 2) { /* from 3 and odd numbers */
            if (isPrime(i)) {
                size++;
            }
        }
        list = new int[size];
    }

    /** Prime setter for the list of prime numbers. */
    public void setList() {
        int size = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                list[size++] = i;
            }
        }
    }

    /** Prime setter for the formatted list of prime numbers. */
    public void setFormat() {
        StringBuilder sb = new StringBuilder();
        int size = 0;
        for (int prime : list) {
            sb.append(String.format("%-7d", prime));
            sb.append(' ');
            if (++size % 10 == 0) {
                sb.deleteCharAt(sb.length() - 1);
                sb.append(String.format("%n"));
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
                size,
                (double) size / num * 100);
    }
}
