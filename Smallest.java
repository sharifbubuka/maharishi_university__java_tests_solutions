public class Smallest {
  public static void main(String[] args) {
    System.out.println(String.format("4: %d", smallest(4))); // 624
    System.out.println(String.format("5: %d", smallest(5))); // 624
    System.out.println(String.format("6: %d", smallest(6))); // 642
    System.out.println(String.format("7: %d", smallest(7))); // 4062
  }

  private static int smallest(int n) {
    int i, temp, flag = 0;

    for(i = 1; ; i++) {
      for(int j = 1; j <= n; j++) {
        flag = 0;
        temp = i * j;
        while(temp > 0) {
          if(temp % 10 == 2) {
            flag = 1;
            break;
          }
          temp /= 10;
        }
        if(flag == 0) break;
      }
      if(flag == 1) break;
    }

    return i;
  }
}
