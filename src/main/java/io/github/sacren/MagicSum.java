/**
 * MagicSum class.
 *
 * <p>Private instance data:
 * -sum:int
 *
 * <p>Constructor:
 * +MagicSum(num:int)
 *
 * <p>Public methods:
 * +add(num:int):void
 * +hasMagic():boolean
 * +isMagic():boolean
 * +toString():String
 */
public class MagicSum {
    /* private instance data */
    private int sum;

    /** MagicSum setter for the sum. */
    public void add(int num) {
        if (num < 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", num));
        }
        sum += num;
    }

    /** MagicSum getter for digit 8. */
    public boolean hasMagic() {
        int num = sum;
        for ( ; ; ) {
            if (num == 0) { /* All the digits are dropped */
                return false;
            }
            if (num % 10 == 8) { /* 8 in the number */
                break;
            }
            num /= 10; /* Drop least significant digit */
        }
        return true;
    }

    /** Magic getter if there is digit 8. */
    public boolean isMagic() {
        for (char c : Integer.toString(sum).toCharArray()) {
            if (Integer.parseUnsignedInt(Character.toString(c)) == 8) {
                return true;
            }
        }
        return false;
    }

    /** MagicSum string method. */
    public String toString() {
        return String.format(
                "Magic sum %d: %s%n"
                        + "Magic sum %1$d: %s",
                sum,
                isMagic() ? "TRUE" : "FALSE",
                hasMagic() ? "TRUE" : "FALSE");
    }
}
