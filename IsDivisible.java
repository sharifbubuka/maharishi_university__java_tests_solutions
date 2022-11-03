public class IsDivisible {
  public static void main(String[] args) {
    int[] a = {3, 3, 6, 36};
    System.out.println(String.format("{3, 3, 6, 36} : %d", isDivisible(a, 3))); // 1
    int[] b = {4};
    System.out.println(String.format("{3, 3, 6, 36} : %d", isDivisible(b, 2))); // 1
    int[] c = {3, 4, 3, 6, 36};
    System.out.println(String.format("{3, 3, 6, 36} : %d", isDivisible(c, 3))); // 0
    int[] d = {6, 12, 24, 36};
    System.out.println(String.format("{6, 12, 24, 36} : %d", isDivisible(d, 12))); // 0
    int[] e = {};
    System.out.println(String.format("{} : %d", isDivisible(e, 3))); // 1
  }

  private static int isDivisible(int[] a, int divisor) {
    int result = 1;

    for (int el: a) {
      if (el % divisor != 0) {
        result = 0;
        break;
      }
    }

    return result;
  }
}