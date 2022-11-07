public class Array121 {
  public static void main(String[] args) {
    System.out.println(String.format("{1, 2, 1} : %d", is121Array(new int[] {1, 2, 1}))); // 1
    System.out.println(String.format("{1, 1, 1, 2, 2, 2, 1, 1} : %d", is121Array(new int[] {1, 1, 2, 2, 2, 1, 1}))); // 1
    System.out.println(String.format("{1, 1, 2, 2, 2, 1, 1, 1} : %d", is121Array(new int[] {1, 1, 2, 2, 2, 1, 1, 1}))); // 0
    System.out.println(String.format("{1, 1, 2, 1, 2, 1, 1} : %d", is121Array(new int[] {1, 1, 2, 1, 2, 1, 1}))); // 0
    System.out.println(String.format("{1, 1, 1, 2, 2, 2, 1, 1, 1, 3} : %d", is121Array(new int[] {1, 1, 1, 2, 2, 2, 1, 1, 1, 3}))); // 0
    System.out.println(String.format("{1, 1, 1, 1, 1, 1} : %d", is121Array(new int[] {1, 1, 1, 1, 1, 1}))); // 0
    System.out.println(String.format("{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1} : %d", is121Array(new int[] {2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}))); // 0
    System.out.println(String.format("{1, 1, 1, 2, 2, 2, 1, 1, 2, 2} : %d", is121Array(new int[] {1, 1, 1, 2, 2, 2, 1, 1, 2, 2}))); // 0
    System.out.println(String.format("{2, 2, 2} : %d", is121Array(new int[] {2, 2, 2}))); // 0
  } 

  private static int is121Array(int[] a) {
    if (a[0] != 1 || a[a.length - 1] != 1) return 0;

    int onesgroup = 1, onescount = 1, twoscount = 0;

    for (int i = 1; i < a.length; i++) {
      if (a[i] < 1 || a[i] > 2 || onesgroup > 2) return 0;

      if (a[i] == 1) {
        onescount++;
        if (i != 0 && a[i - 1] == 2) onesgroup++;
      } else {
        twoscount++;
      }

    }

    if (twoscount == 0 || onesgroup != 2 || onescount % 2 != 0) return 0;

    return 1;
  }
}
