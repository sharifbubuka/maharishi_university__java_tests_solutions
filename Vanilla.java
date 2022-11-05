public class Vanilla {
  public static void main(String[] args) {
    System.out.println(String.format("{1} is vanilla: %d", isVanilla(new int[] {1}))); // 1
    System.out.println(String.format("{11, 22, 13, 34, 125} is vanilla: %d", isVanilla(new int[] {11, 22, 13, 34, 125}))); // 0
    System.out.println(String.format("{9, 999, 99999, -9999} is vanilla: %d", isVanilla(new int[] {9, 999, 99999, -9999}))); // 1
    System.out.println(String.format("{} is vanilla: %d", isVanilla(new int[] {}))); // 1
  }

  private static int isVanilla(int[] a) {
    int result = 1;

    if (a.length == 0) return result;

    String digits = "";

    for (int el: a) digits += String.valueOf(Math.abs(el));

    String baseCharacter = digits.split("")[0];

    for (String character: digits.split("")) 
      if (Integer.parseInt(character) != Integer.parseInt(baseCharacter)) return --result;

    return result;
  }
}
