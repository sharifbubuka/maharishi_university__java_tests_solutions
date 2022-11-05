public class SequentiallyBounded {
  public static void main(String[] args) {
    System.out.println(String.format("{0, 1} is sequentially bounded: %d", isSequentiallyBounded(new int[] {0, 1}))); // 0
    System.out.println(String.format("{-1, 2} is sequentially bounded: %d", isSequentiallyBounded(new int[] {-1, 2}))); // 0
    System.out.println(String.format("{} is sequentially bounded: %d", isSequentiallyBounded(new int[] {}))); // 1
    System.out.println(String.format("{5, 5, 5, 5} is sequentially bounded: %d", isSequentiallyBounded(new int[] {5, 5, 5, 5}))); // 1
    System.out.println(String.format("{5, 5, 5, 2, 5} is sequentially bounded: %d", isSequentiallyBounded(new int[] {5, 5, 5, 2, 5}))); // 0
  }

  private static int isSequentiallyBounded(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int count = 1;
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] == a[i]) count++;
        if (count >= a[i] || a[j] > a[i]) return 0;
      }
    }

    return 1;
  }
}
