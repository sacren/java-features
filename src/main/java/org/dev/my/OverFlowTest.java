/**
 * Overflow demo.
 */
public class OverFlowTest {
  public static void main(String[] args) {
    printTestResult();
  }

  private static void printTestResult() {
    int integerMax = Integer.MAX_VALUE;
    int overFlowMax1 = integerMax + 1;
    int overFlowMax2 = integerMax + 2;
    int overFlowMax3 = integerMax * integerMax;
    long longNumber1 = integerMax + 1L;
    int integerMin = Integer.MIN_VALUE;
    int overFlowMin1 = integerMin + 1;
    int overFlowMin2 = integerMin + 2;
    int overFlowMin3 = integerMin * integerMin;
    long longNumber2 = integerMin - 1L;

    System.out.println("int(max) = " + integerMax + "\n"
                       + "int(max) + 1 = " + overFlowMax1 + "\n"
                       + "int(max) + 2 = " + overFlowMax2 + "\n"
                       + "int(max) * int(max) = " + overFlowMax3 + "\n"
                       + "int(max) + 1L = " + longNumber1 + "\n\n"
                       + "int(min) = " + integerMin + "\n"
                       + "int(min) - 1 = " + overFlowMin1 + "\n"
                       + "int(min) - 2 = " + overFlowMin2 + "\n"
                       + "int(min) * int(min) = " + overFlowMin3 + "\n"
                       + "int(min) - 1L = " + longNumber2);
  }
}
