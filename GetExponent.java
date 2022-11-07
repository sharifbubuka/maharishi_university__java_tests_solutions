public class GetExponent {
  public static void main(String[] args) {
    System.out.println(String.format("4^X = 162: X = %d", getExponent(162, 3))); // 4
    System.out.println(String.format("3^X = 27: X = %d", getExponent(27, 3))); // 3
    System.out.println(String.format("3^X = 28: X = %d", getExponent(28, 3))); // 0
    System.out.println(String.format("7^X = 280: X = %d", getExponent(280, 7))); // 1
    System.out.println(String.format("5^X = -250: X = %d", getExponent(-250, 5))); // 3
    System.out.println(String.format("1^X = 18: X = %d", getExponent(18, 1))); // -1
    System.out.println(String.format("4^X = 128: X = %d", getExponent(128, 4))); // 3
  } 

  private static int getExponent(int n, int p) {
    if (p <= 1) return -1;

    int power = 0;

    for (int i = 0; i <= Math.sqrt(Math.abs(n)) ; i++) {
      int product = (int) Math.pow(p, i);

      if (n % product == 0) power = i;
    }

    return power;
  }
}
