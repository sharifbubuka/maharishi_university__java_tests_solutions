public class Packed {
  public static void main(String[] args) {
    System.out.println(String.format("{2, 2, 1}: %d", isPacked(new int[] {2, 2, 1}))); // 1
    System.out.println(String.format("{2, 2, 1, 2, 2}: %d", isPacked(new int[] {2, 2, 1, 2, 2}))); // 0
    System.out.println(String.format("{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}: %d", isPacked(new int[] {4, 4, 4, 4, 1, 2, 2, 3, 3, 3}))); // 1
    System.out.println(String.format("{7, 7, 7, 7, 7, 7, 7, 1}: %d", isPacked(new int[] {7, 7, 7, 7, 7, 7, 7, 1}))); // 1
    System.out.println(String.format("{7, 7, 7, 7, 1, 7, 7, 7}: %d", isPacked(new int[] {7, 7, 7, 7, 1, 7, 7, 7}))); // 0
    System.out.println(String.format("{7, 7, 7, 7, 7, 7, 7}: %d", isPacked(new int[] {7, 7, 7, 7, 7, 7, 7}))); // 1
    System.out.println(String.format("{}: %d", isPacked(new int[] {}))); // 1
    System.out.println(String.format("{1, 2, 1}: %d", isPacked(new int[] {1, 2, 1}))); // 0
    System.out.println(String.format("{2, 1, 1}: %d", isPacked(new int[] {2, 1, 1}))); // 0
    System.out.println(String.format("{-3, -3, -3}: %d", isPacked(new int[] {-3, -3, -3}))); // 0
    System.out.println(String.format("{0, 2, 2}: %d", isPacked(new int[] {0, 2, 2}))); // 0
    System.out.println(String.format("{2, 1, 2}: %d", isPacked(new int[] {2, 1, 2}))); // 0
  } 

  private static int isPacked(int[] a) {

    if (a.length == 0) return 1;
  
    int index = 0, startindex = 0, current = a[0], count = 1;
    boolean[] checked = new boolean[9];

      while (index < a.length) {
        if (current < 1) return 0;

        checked[current] = true;

        if (index == a.length - 1) break;

        if (startindex == a.length - 1 && a[startindex] != 1) return 0;

        if (current == a[index + 1]) {
          count = count + 1;
          index = index + 1;
          current = a[index];
        } else {
          index = index + 1;
          startindex = index;
          count = 1;
          current = a[startindex];
          if (checked[current] == true) return 0;
        }

        if (count > current) return 0;
      }

    return 1;
  }
}
