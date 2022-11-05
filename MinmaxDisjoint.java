public class MinmaxDisjoint {

  public static void main(String[] args) {
    System.out.println(String.format("{5, 4, 1, 3, 2} is a minmax-disjoint: %d", isMinMaxDisjoint(new int[] {5, 4, 1, 3, 2}))); // 1
    System.out.println(String.format("{9, 0, 5, 9}} is a minmax-disjoint: %d", isMinMaxDisjoint(new int[] {9, 0, 5, 9}))); // 0
    System.out.println(String.format("{18, -1, 3, 4, 0} is a minmax-disjoint: %d", isMinMaxDisjoint(new int[] {18, -1, 3, 4, 0}))); // 0
    System.out.println(String.format("{0, 5, 18, 0, 9} is a minmax-disjoint: %d", isMinMaxDisjoint(new int[] {0, 5, 18, 0, 9}))); // 0
    System.out.println(String.format("{7, 7, 7, 7} is a minmax-disjoint: %d", isMinMaxDisjoint(new int[] {7, 7, 7, 7}))); // 0
    System.out.println(String.format("{} is a minmax-disjoint: %d", isMinMaxDisjoint(new int[] {}))); // 0
    System.out.println(String.format("{1, 2} is a minmax-disjoint: %d", isMinMaxDisjoint(new int[] {1, 2}))); // 0
    System.out.println(String.format("{1} is a minmax-disjoint: %d", isMinMaxDisjoint(new int[] {1}))); // 0
  }

  private static int isMinMaxDisjoint(int[] a) {

    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, maxCount = 0, minCount = 0, result = 1;

    if (a.length == 0) return --result;

    for (int el: a) {
      if (el < min) min = el;
      if (el > max) max = el;
    }

    if (min == max) return --result;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == min) minCount++;
      if (a[i] == max) maxCount++;
      if (maxCount > 1 || minCount > 1 || ((a[i] == max && a[i + 1] == min) || (a[i] == min && a[i + 1] == max))) return --result;
    }

    return result;
  }
}
