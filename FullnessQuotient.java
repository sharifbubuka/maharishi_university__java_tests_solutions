public class FullnessQuotient {
  
  public static void main(String[] args) {
    System.out.println(String.format("94: %d", fullnessQuotient(94))); // 6
    System.out.println(String.format("1: %d", fullnessQuotient(1))); // 8
    System.out.println(String.format("9: %d", fullnessQuotient(9))); // 5
    System.out.println(String.format("360: %d", fullnessQuotient(360))); // 0
    System.out.println(String.format("-4: %d", fullnessQuotient(-4))); // -1
  } 

  private static int fullnessQuotient(int n) {
    if (n <= 0) return -1;

    int count = 8;

    for (int i = 2; i <= 9; i++) {
      int num = n;
      boolean flag = false;

      while(num >= i) {
        int rem = num % i;
        num = num / i;

        if (rem == 0) flag = true;

        if (num > 0 && flag) {
          --count;
          break;
        };
      }
    }

    return count;
  }
}
