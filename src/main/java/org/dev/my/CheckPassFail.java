/**
 * Simple decision making.
 */
public class CheckPassFail {
  public static void main(String[] args) {
    checkMark();
  }

  private static void checkMark() {
    int mark = 49;
    System.out.println("mark = 49");

    if (mark >= 50) {
      System.out.println("PASS");
    } else {
      System.out.println("FAIL");
    }

    System.out.println("DONE");
  }
}
