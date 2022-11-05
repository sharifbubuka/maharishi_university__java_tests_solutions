public class RailroadTie {
  public static void main(String[] args) {
    System.out.println(String.format("{1, 2, 0, 3, -18, 0, 2, 2}: %d", isRailroadTie(new int[] {1, 2, 0, 3, -18, 0, 2, 2}))); // 1
    System.out.println(String.format("{1, 2, 3, 0, 2, 2}: %d", isRailroadTie(new int[] {1, 2, 3, 0, 2, 2}))); // 0
    System.out.println(String.format("{0, 1, 2, 0, 3, 4}: %d", isRailroadTie(new int[] {0, 1, 2, 0, 3, 4}))); // 0
    System.out.println(String.format("{1, 2, 0, 0, 3, 4}: %d", isRailroadTie(new int[] {1, 2, 0, 0, 3, 4}))); // 0
    System.out.println(String.format("{1}: %d", isRailroadTie(new int[] {1}))); // 0
    System.out.println(String.format("{}: %d", isRailroadTie(new int[] {}))); // 0
    System.out.println(String.format("{0}: %d", isRailroadTie(new int[] {0}))); // 0
  }

  private static int isRailroadTie(int[] a) {
    if (a.length < 3) return 0;

    boolean nonezero = false;

    for (int i = 0; i < a.length; i++) {
      if (!nonezero && a[i] != 0) nonezero = true;
    
      if (i == 0) { // first index
        if (a[i] == 0 || (a[i + 1] == 0)) return 0;
      } else if (i == a.length - 1) { // last index
        if (a[i] == 0 || (a[i] != 0 && a[i - 1] == 0)) return 0;
      } else { // middle indexes
        if (a[i] == 0) {
          if (a[i - 1] == 0 || a[i + 1] == 0) return 0;
        } else {
          if ((a[i - 1] == 0 && a[i + 1] == 0) || (a[i - 1] != 0 && a[i + 1] != 0)) return 0;
        }
      }
      
    }

    if (!nonezero) return 0;

    return 1;
  }
}
