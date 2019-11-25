/**
 * Add2Int class for adding two integers.
 *
 * <p>Private instance variable:
 * -numbers:Duo
 *
 * <p>Constructor:
 * +Add2Int(num1:int, num2:int)
 *
 * <p>Public methods:
 * +setNumbers():void
 * +setNumbers(num1:int, num2:int):void
 * +sum():int
 * +toString():String
 */
public class Add2Int {
    /* private instance variable */
    private Duo numbers;

    /** Add2Int constructor. */
    public Add2Int(int num1, int num2) {
        setNumbers();
        setNumbers(num1, num2);
    }

    /** Add2Int setter for the initialization of numbers. */
    public void setNumbers() {
        numbers = new Duo();
    }

    /** Add2Int setter for numbers. */
    public void setNumbers(int num1, int num2) {
        numbers.setFirst(num1);
        numbers.setSecond(num2);
    }

    /** Add2Int method for the sum of two numbers. */
    public int sum() {
        int num1 = numbers.getFirstInt();
        int num2 = numbers.getSecondInt();
        if (num1 > 0 && num2 > 0 && Integer.MAX_VALUE - num1 < num2
                || num1 < 0 && num2 < 0 && Integer.MIN_VALUE - num1 > num2) {
            throw new IllegalArgumentException("Out of range!");
        }
        return Integer.sum(num1, num2);
    }

    /** Add2Int instance formatted string. */
    public String toString() {
        return String.format(
                "%d + %d = %d",
                numbers.getFirstInt(),
                numbers.getSecondInt(),
                sum());
    }
}
