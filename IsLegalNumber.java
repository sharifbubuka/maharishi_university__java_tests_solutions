public class IsLegalNumber {
  public static void main(String[] args) {
    int[] a = {1, 0, 1, 1}; 
    System.out.println(String.format("{1, 0, 1, 1} is legal in base 2: %d", isLegalNumber(a, 2))); // 1
    int[] b = {3, 2, 5}; 
    System.out.println(String.format("{3, 2, 5} is legal in base 8: %d", isLegalNumber(b, 8))); // 1
    int[] c = {3, 7, 1}; 
    System.out.println(String.format("{3, 2, 5} is legal in base 8: %d", isLegalNumber(c, 6))); // 1
  }

  private static int isLegalNumber(int[] a, int base) {
    // since our array consists of only integers, an no characters
    // number can never be of base higher than 10 
    if (base <= 10) {
      for (int counter = 0; counter < a.length; counter++) {
        if (a[counter] >= base || a[counter] < 0) return 0;
      }
    }



    return 1;
  }
}
