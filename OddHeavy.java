public class OddHeavy {
  public static void main(String[] args) {
    System.out.println(String.format("{1}: %d", isOddHeavy(new int[] {1}))); // 1
    System.out.println(String.format("{2}: %d", isOddHeavy(new int[] {2}))); // 0
    System.out.println(String.format("{1, 1, 1, 1, 1, 1}: %d", isOddHeavy(new int[] {1, 1, 1, 1, 1, 1}))); // 1
    System.out.println(String.format("{2, 4, 6, 8, 11}: %d", isOddHeavy(new int[] {2, 4, 6, 8, 11}))); // 1
    System.out.println(String.format("{-2, -4, -6, -8, -11}: %d", isOddHeavy(new int[] {-2, -4, -6, -8, -11}))); // 0
  } 

  private static int isOddHeavy(int[] a) {
     
    boolean oddflag = false;

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (a[j] % 2 != 0) oddflag = true;

        if (j == a.length - 1 && a[j] % 2 == 0) return 0;

        if (i == j) continue;

        if (a[j] % 2 != 0 && a[i] % 2 == 0 && (a[j] % 2 <= a[i] % 2)) return 0;
      }
    }

    if (!oddflag) return 0;

    return 1;
  }
}
