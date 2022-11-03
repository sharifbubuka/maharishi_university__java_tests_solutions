public class IsSquare {
  public static void main(String[] args) {
    System.out.println(String.format("4 is sqaure? : %d", isSqaure(4)));
    System.out.println(String.format("25 is sqaure? : %d", isSqaure(25)));
    System.out.println(String.format("-4 is sqaure? : %d", isSqaure(-4)));
    System.out.println(String.format("8 is sqaure? : %d", isSqaure(8)));
    System.out.println(String.format("0 is sqaure? : %d", isSqaure(0)));
  }

  private static int isSqaure(int n) {
    int result = 0;

    if (n < 0) return result;

    for (int counter = 0; ; counter++) {
      int sqaure = counter * counter;
      if (sqaure > n) break;
      if (sqaure == n) return ++result;
    }

    return result;
  }
}
