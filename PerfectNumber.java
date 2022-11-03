public class PerfectNumber {
  public static void main(String[] args) {
    System.out.println(String.format("%d", henry(1, 3))); // 502
    System.out.println(String.format("%d", henry(2, 4))); // 8156
  }

  private static int henry(int start, int end) {
    if(end <= start) return 0;
        int i, j, temp, ind = 0, sum = 0;

        for(i = 4; ; i++) {
            temp = 0;
            for(j = 1; j < i; j++) {
                if(i % j == 0) temp += j;
            }
            if(temp == i) {
                ++ind;
                if(ind == start) sum += i;
                else if(ind == end) {
                    sum += i;
                    break;
                }
            }
        }

        return sum;
    }
}
