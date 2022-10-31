public class SolveTen {
      public static void main(String[] args) {
        int[] ans = solve10();
        System.out.println(String.format("[%d,%d]", ans[0], ans[1])); // [0,0]
      }

      private static int fact(int num) {
        if (num == 1) return 1;

        return num * fact(num - 1);
      }

      private static int[] solve10() {
        int[] results = new int[2];

        int fact10 = fact(10);

        for (int a = 2; a <= 9; a++) {
          outerloop:
          for (int b = 2; b <= 9; b++) {
            int sum = fact(a) + fact(b);
            if (sum == fact10) {
              results[0] = a;
              results[1] = b;
              break outerloop;
            }
          }
        }

        return results;
      }
}
