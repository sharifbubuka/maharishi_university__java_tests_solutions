public class CountRepresentations {
  public static void main(String[] args) {
    System.out.println(String.format("12: %d", countRepresentations(12))); // 15
    System.out.println(String.format("24: %d", countRepresentations(24))); // 61
  }

  private static int countRepresentations(int numRupees) {
    int total, count = 0;

    for (int rupee20 = 0; rupee20 <= numRupees; rupee20++) {
      int num20 = rupee20 * 20;
      if (num20 > numRupees) break;
      for (int rupee10 = 0; rupee10 <= numRupees; rupee10++) {
        int num10 = rupee10 * 10;
      if (num10 > numRupees) break;
        for (int rupee5 = 0; rupee5 <= numRupees; rupee5++) {
          int num5 = rupee5 * 5;
          if (num5 > numRupees) break;
          for (int rupee2 = 0; rupee2 <= numRupees; rupee2++) {
            int num2 = rupee2 * 2;
            if (num2 > numRupees) break;
            for (int rupee1 = 0; rupee1 <= numRupees; rupee1++) {
              int num1 = rupee1 * 1;
              total = num20 + num10 + num5 + num2 + num1;
              if (total == numRupees) {
                count++;
                break;
              } else if (total > numRupees) break;
            }
          }
        }
      }
    }

    return count;
  }
}
