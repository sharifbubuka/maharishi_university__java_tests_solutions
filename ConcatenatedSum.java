public class ConcatenatedSum {
  public static void main(String[] args) {
    System.out.println(String.format("198 - concat length 2 : %d", concatenatedSum(198, 2))); // 1
    System.out.println(String.format("198 - concat length 3 : %d", concatenatedSum(198, 3))); // 0
    System.out.println(String.format("2997 - concat length 3 : %d", concatenatedSum(2997, 3))); // 1
    System.out.println(String.format("2997 - concat length 2 : %d", concatenatedSum(2997, 2))); // 0
    System.out.println(String.format("13332 - concat length 4 : %d", concatenatedSum(13332, 4))); // 1
    System.out.println(String.format("9 - concat length 1 : %d", concatenatedSum(9, 1))); // 1
  } 

  private static int concatenatedSum(int n, int catlen) {
    if (n <= 0 || catlen <= 0) return 0;

    int sum = 0;

    int multiplier = 0;

    for (int i = 1; i <= catlen; i++)
      multiplier = multiplier * 10 + 1;

    int product = n;

    while (product > 0) {
      int remainder = product % 10;
      sum += remainder * multiplier;

      product /= 10;
    }

    if (sum == n) return 1;
    else return 0;
  }
}
