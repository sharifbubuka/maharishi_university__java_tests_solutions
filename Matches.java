public class Matches {
  public static void main(String[] args) {
    System.out.println(String.format("", matches(new int[] {}, new int[] {})));
  }

  private static int matches(int[] a, int[] p) {
    int matches = 0;

    if (a.length == 0 || p.length == 0 || a.length < p.length) return matches;

    for (int outercounter = 0; outercounter < p.length; outercounter++) {
      if (p[outercounter] < 0) {

      } else {
        
      }
    }

    return matches;
  }
}
