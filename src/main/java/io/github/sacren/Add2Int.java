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

    /** Add2Int instance formatted string. */
    public String toString() {
        int num1 = numbers.getFirstInt();
        int num2 = numbers.getSecondInt();
        return String.format(
                "%d + %d = %d",
                num1, num2, num1 + num2);
    }
}
