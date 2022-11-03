public class ArrayHasNoZeroes {
  public static void main(String[] args) {
    System.out.println(String.format("{1, 2, 3}: %d", arrayHasNoZeroes(new int[] {1, 2, 3}))); // 1
    System.out.println(String.format("{1, 0, 4, 0}: %d", arrayHasNoZeroes(new int[] {1, 0, 4, 0}))); // 0
    System.out.println(String.format("{1, 2, 3, 0}: %d", arrayHasNoZeroes(new int[] {1, 2, 3, 0}))); // 0
    System.out.println(String.format("{0, 0, 0, 0}: %d", arrayHasNoZeroes(new int[] {0, 0, 0, 0}))); // 0
    System.out.println(String.format("{}: %d", arrayHasNoZeroes(new int[] {}))); // 1
  }

  private static int arrayHasNoZeroes(int[] a) {
    for (int el: a) if (el == 0) return 0;

    return 1;
  }
}
