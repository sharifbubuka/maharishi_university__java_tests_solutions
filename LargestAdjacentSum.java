public class LargestAdjacentSum {
  public static void main(String[] args) {
    System.out.println(String.format("{1, 2, 3, 4}: %d", largestAdjacentSum(new int[] {1, 2, 3, 4}))); // 7
    System.out.println(String.format("{18, -12, 9, -10}: %d", largestAdjacentSum(new int[] {18, -12, 9, -10}))); // 6
    System.out.println(String.format("{1,1,1,1,1,1,1,1,1}: %d", largestAdjacentSum(new int[] {1,1,1,1,1,1,1,1,1}))); // 2
    System.out.println(String.format("{1,1,1,1,1,2,1,1,1}: %d", largestAdjacentSum(new int[] {1,1,1,1,1,2,1,1,1}))); // 3
  } 

  private static int largestAdjacentSum(int[] a) {
    if (a.length == 0) return 0;
    
    if (a.length == 1) return a[0];

    int sum = 0;
    for (int i = 1; i < a.length; i++) {
      int newsum = a[i] + a[i - 1];
      if (newsum > sum) sum = newsum;
    }

    return sum;
  }
}
