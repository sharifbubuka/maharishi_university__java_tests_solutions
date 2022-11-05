import java.util.Arrays;
import java.util.stream.IntStream;

public class SumSafe {
  public static void main(String[] args) {
    System.out.println(String.format("{5, -5, 0} is sum safe: %d", isSumSafe(new int[] {5, -5, 0})));
    System.out.println(String.format("{5, 2, 1} is sum safe: %d", isSumSafe(new int[] {5, 2, 1})));
  }

  private static int isSumSafe(int[] a) {
    int sum = Arrays.stream(a).sum(); // O(n)
    // alternatively, a for loop can be used to get the sum - O(n)

    boolean containsSum = IntStream.of(a).anyMatch(x -> x == sum);
    // alternatively, a for loop can be used to check for sum as value - O(n)

    if (containsSum) return 0;
    else return 1;
  }
}
