public class Trivalent {
  public static void main(String[] args) {
    System.out.println(String.format("{-1, 0, 1, 0, 0, 0} is trivalent: %d", isTrivalent(new int[] {-1, 0, 1, 0, 0, 0}))); // 1
    System.out.println(String.format("{} is trivalent: %d", isTrivalent(new int[] {}))); // 0
    System.out.println(String.format("{2147483647, -1, -1, -2147483648} is trivalent: %d", isTrivalent(new int[] {2147483647, -1, -1, -2147483648}))); // 1
  }

  private static int isTrivalent(int[] a) {
    if(a.length < 3) return 0;

    int pos = 0, zero = 0, flag;
    int[] nums = new int[3];

    for(int i = 0; i < a.length; i++) {
      flag = 1;
      for(int j = 0; j < 3; j++) {
        if(a[i] == nums[j] && a[i] != 0) flag = 0;
      }
      if(a[i] == 0 && zero == 0) {
        nums[pos++] = a[i];
        zero = 1;
      } else if(a[i] != 0 && flag == 1) {
        if(pos < 3) nums[pos++] = a[i];
          else if(pos == 3) return 0;
      }
    }
    if(pos < 3) return 0;
    return 1;
  }
}
