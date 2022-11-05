public class ComputeDepth {
  public static void main(String[] args) {
    System.out.println(String.format("42: %d", computeDepth(42))); // 9
    System.out.println(String.format("7: %d", computeDepth(7))); // 10
    System.out.println(String.format("13: %d", computeDepth(13))); // 8
    System.out.println(String.format("25: %d", computeDepth(25))); // 36
  }

  private static int computeDepth(int n) {
    int product, flag, modulo, depth = 0;

        int[] digits = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        for(int i = 1; ; i++) {
            product = n * i;
            while(product > 0) {
                modulo = product % 10;
                digits[modulo] = modulo;
                product /= 10;
            }
            flag = 1;
            for(int j = 0; j < 10; j++) {
                if(j != digits[j]) {
                    flag = 0;
                    break;
                }
            }
            ++depth;
            if(flag == 1) break;
        }

    return depth;
  }
}
