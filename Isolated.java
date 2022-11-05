import java.util.stream.Stream;

public class Isolated {
  public static void main(String[] args) {
    int tracker = 0;
    for (long counter = 1; ; counter++) {
      if (tracker == 20) break;
      if (isIsolated(counter) == 1) {
        System.out.println(String.format("%d is isolated: %d", counter, isIsolated(counter)));
        tracker++;
      }
    }
  }

  private static int isIsolated(long n){

    if (n > 2097151 || n < 1) return -1;

    long square = Math.multiplyExact(n, n);
    long cube = (long) Math.pow(n, 3);

    int[] squareDigits = Stream.of(String.valueOf(square).split("")).mapToInt(Integer::parseInt).toArray();
    int[] cubeDigits = Stream.of(String.valueOf(cube).split("")).mapToInt(Integer::parseInt).toArray();

    // alternatively, a stream can be used here
    for (int digit: squareDigits) {
      for (int number: cubeDigits) {
        if (digit == number) return 0;
      }
    }

    return 1;
  }
}
