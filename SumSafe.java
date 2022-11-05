public class SumSafe {
  public static void main(String[] args) {
    System.out.println(String.format("1 is sum safe: %d", isSumSafe(1))); // 1
    System.out.println(String.format("1 is sum safe: %d", isSumSafe(3))); // 1
    System.out.println(String.format("1 is sum safe: %d", isSumSafe(6))); // 1
    System.out.println(String.format("1 is sum safe: %d", isSumSafe(10))); // 1
    System.out.println(String.format("1 is sum safe: %d", isSumSafe(15))); // 1
    System.out.println(String.format("1 is sum safe: %d", isSumSafe(19))); // 0
    System.out.println(String.format("1 is sum safe: %d", isSumSafe(13))); // 0
    System.out.println(String.format("1 is sum safe: %d", isSumSafe(9))); // 0
  }

  private static int isSumSafe(int n) {
    int result = 0;
    int sum = 0;

    for (int counter = 1; sum < n; counter++) {
      sum += counter;
      if (sum == n) return ++result;
    }

    return result;
  }
}
