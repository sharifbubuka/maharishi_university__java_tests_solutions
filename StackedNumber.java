public class StackedNumber {
  public static void main(String[] args) {
    System.out.println(String.format("1 is stacked number: %d", isStacked(1))); // 1
    System.out.println(String.format("3 is stacked number: %d", isStacked(3))); // 1
    System.out.println(String.format("6 is stacked number: %d", isStacked(6))); // 1
    System.out.println(String.format("10 is stacked number: %d", isStacked(10))); // 1
    System.out.println(String.format("15 is stacked number: %d", isStacked(15))); // 1
    System.out.println(String.format("19 is stacked number: %d", isStacked(19))); // 0
    System.out.println(String.format("13 is stacked number: %d", isStacked(13))); // 0
    System.out.println(String.format("9 is stacked number: %d", isStacked(9))); // 0
  }

  private static int isStacked(int n) {
    int result = 0;
    int sum = 0;

    for (int counter = 1; sum < n; counter++) {
      sum += counter;
      if (sum == n) return ++result;
    }

    return result;
  }
}
