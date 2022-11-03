public class ConvertToBase10 {
  public static void main(String[] args) {
    System.out.println(String.format("{1, 0, 1, 1} in base 10: %d", convertToBase10(new int[] {1, 0, 1, 1}, 2))); // 11
    System.out.println(String.format("{1, 1, 2} in base 10: %d", convertToBase10(new int[] {1, 1, 2}, 3))); // 14
    System.out.println(String.format("{3, 2, 5} in base 10: %d", convertToBase10(new int[] {3, 2, 5}, 8))); // 213
    System.out.println(String.format("{3, 7, 1} in base 10: %d", convertToBase10(new int[] {3, 7, 1}, 6))); // -1
  }

  private static int convertToBase10(int[] a, int base) {
    if (IsLegalNumber.isLegalNumber(a, base) == 1) {
      int base10 = 0;
      for (int index = 0; index < a.length; index++) base10 += a[index] * (int) Math.pow(base, a.length - (index + 1));
      return base10;
    } else return -1;
  }
}
