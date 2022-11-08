public class SequencedArray {
  public static void main(String[] args) {
    System.out.println(String.format("{1, 2, 3, 4, 5}: %d", isSequencedArray(new int[] {1, 2, 3, 4, 5}, 1,  5))); // 1
    System.out.println(String.format("{1, 3, 4, 2, 5}: %d", isSequencedArray(new int[] {1, 3, 4, 2, 5}, 1,  5))); // 0
    System.out.println(String.format("{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}: %d", isSequencedArray(new int[] {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5,  -2))); // 1
    System.out.println(String.format("{0, 1, 2, 3, 4, 5}: %d", isSequencedArray(new int[] {0, 1, 2, 3, 4, 5}, 1,  5))); // 0
    System.out.println(String.format("{1, 2, 3, 4}: %d", isSequencedArray(new int[] {1, 2, 3, 4}, 1,  5))); // 0
    System.out.println(String.format("{1, 2, 5}: %d", isSequencedArray(new int[] {1, 2, 5}, 1,  5))); // 0
    System.out.println(String.format("{5, 4, 3, 2, 1}: %d", isSequencedArray(new int[] {5, 4, 3, 2, 1}, 1,  5))); // 0
  } 

  private static int isSequencedArray(int[] a, int m, int n) {

    for (int i = m; i <= n; i++) {
      boolean flag = false;
      for(int k = 0; k < a.length; k++) {
        if (a[k] < m || a[k] > n) return 0;
        if (a[k] == i) {
          flag = true;
          if (k == a.length - 1) continue;
          else if (a[k + 1] < a[k]) return 0;
        }
      }

      if (flag == false) return 0;
    }

    return 1;
  }
}
