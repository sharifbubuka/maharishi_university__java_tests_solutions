public class NUnique {
  public static void main(String[] args) {
    int[] a = {7, 3, 3, 2, 4};
    System.out.println(String.format("{7, 3, 3, 2, 4}: %d", isNUnique(a,6))); // 0
    int[] b = {7, 3, 3, 2, 4};
    System.out.println(String.format("{7, 3, 3, 2, 4}: %d", isNUnique(b,10))); // 0
    int[] c = {7, 3, 3, 2, 4};
    System.out.println(String.format("{7, 3, 3, 2, 4}: %d", isNUnique(c,11))); // 1
    int[] d = {7, 3, 3, 2, 4};
    System.out.println(String.format("{7, 3, 3, 2, 4}: %d", isNUnique(d,8))); // 0
    int[] e = {7, 3, 3, 2, 4};
    System.out.println(String.format("{7, 3, 3, 2, 4}: %d", isNUnique(e,4))); // 0
    int[] f = {1};
    System.out.println(String.format("{7, 3, 3, 2, 4}: %d", isNUnique(f,20))); // 0
  }

  private static int isNUnique(int[] a, int n) {
    int result = 0;
    int pairs = 0;

    if (a.length > 1) {
      for(int outercounter = 0; outercounter < a.length; outercounter++) {
        for(int innercounter = outercounter + 1; innercounter < a.length; innercounter++) {
          if (a[outercounter] + a[innercounter] == n) pairs++;
          if (pairs > 1) return result;
        }
      }
    }

    if (pairs == 1) return ++result; 

    return result;
  }
  
}
