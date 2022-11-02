public class Centered15 {
  public static void main(String[] args) {
    int[] a = {3, 2, 10, 4, 1, 6, 9};
    System.out.println(String.format("{3, 2, 10, 4, 1, 6, 9}: %d", centered15(a))); // 1
    int[] b = {2, 10, 4, 1, 6, 9};
    System.out.println(String.format("{2, 10, 4, 1, 6, 9}: %d", centered15(b))); // 0
    int[] c = {3, 2, 10, 4, 1, 6};
    System.out.println(String.format("{3, 2, 10, 4, 1, 6}: %d", centered15(c))); // 0
    int[] d = {1, 1,8, 3, 1, 1};
    System.out.println(String.format("{1,1, 8, 3, 1, 1}: %d", centered15(d))); // 0
    int[] e = {9, 15, 6};
    System.out.println(String.format("{9, 15, 6}: %d", centered15(e))); // 1
    int[] f = {1, 1, 2, 2, 1, 1};
    System.out.println(String.format("{1, 1, 2, 2, 1, 1}: %d", centered15(f))); // 0
    int[] g = {1, 1, 15, -1,-1};
    System.out.println(String.format("{1, 1, 15, -1, -1}: %d", centered15(g))); // 1
  }

  private static int centered15(int[] a) {
    int centered = 0;

    int sum = 0;

    for (int num: a) sum = sum + num;

    if (sum == 15) return ++centered;
    else centered = 0;

    for (int outers = 1; outers <= Math.floor((a.length - 1) / 2); outers++) {
      sum = 0;
      for (int inners = outers; inners < a.length - outers; inners++) {
        sum = sum + a[inners];
      }
      if (sum == 15) {
        centered++;
        break;
      }
    }

    return centered;
  }
}
