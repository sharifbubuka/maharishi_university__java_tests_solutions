public class Func {
 
    // returns perfect square greater than its integer argument
    public static int nextPerfectSquare(int inputNumber) {
        if (inputNumber < 0) return 0;

        if (inputNumber >= Integer.MAX_VALUE) return 0;
        
        int perfectSquare = (int) Math.floor(Math.sqrt(inputNumber));

        return (int) Math.pow(perfectSquare + 1, 2);
    }

    // returns the number of times partial sum goes from less
    // than or equal to nto greater than n
    public static int nUpCount(int[] a, int n) {
        int partialSum = 0;
        int counter = 0;
        boolean sumGreaterThanN = false;

        for (int index: a) {
            int newSum = partialSum + index;

            if (sumGreaterThanN) {
                if (newSum <= n) sumGreaterThanN = false;
            } else {
                if (newSum > n) {
                    counter++;
                    sumGreaterThanN = true;
                }
            }
            partialSum = newSum;
        }

        return counter;
    }

    // returns the number pf prime numbers between start and end
    public static int primeCount(int start, int end) {
        if (end < 0) return 0;

        int counter = 0;
        int iteratorValue = 2;

        do {
            boolean check = true;

            for(int i = 2; i < iteratorValue; i++) {
                if (iteratorValue % i == 0) {
                    check = false;
                };
            }

            if (check == true) counter++;
            else check = true;

            iteratorValue++;
        } while(iteratorValue <= end);

        return counter;
    }
}
