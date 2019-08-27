/**
 * Test driver that uses MyException.
 */
public class TestMyException {
    /** Test driver that uses MyException. */
    public static void main(String[] args) {
        try {
            run(9);
            run(8);
        } catch (MyException ex) {
            ex.printStackTrace();
        }
    }

    /** Static magic number method that throws MyException. */
    public static void run(int number) throws MyException {
        if (number == 8) {
            throw new MyException("Hit magic number!");
        }
        System.out.println("Hello!");
    }
}
