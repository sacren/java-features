/** Relational logic operators. */
public class RelationalLogicTest {
    public static void main(String[] args) {
        printRelationalLogic();
    }

    private static void printRelationalLogic() {
        final int age = 18;
        final double weight = 71.23;
        final double height = 191;
        final boolean married = false;
        final boolean attached = false;
        final char gender = 'm';

        System.out.println(
                (age == 18 && !married && !attached && gender == 'm')
                        + "\n"
                        + (married && gender == 'f')
                        + "\n"
                        + (height >= 180 && weight >= 65 && weight <= 80)
                        + "\n"
                        + (height >= 180 || weight >= 90));
    }
}
