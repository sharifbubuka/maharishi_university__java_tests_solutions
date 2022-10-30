public class GuthrieIndex {
    public static void main(String[] args) {
        System.out.println(String.format("Guthrie index of 1 is %d", guthrieIndex(1))); // 0
        System.out.println(String.format("Guthrie index of 2 is %d", guthrieIndex(2))); // 1
        System.out.println(String.format("Guthrie index of 3 is %d", guthrieIndex(3))); // 7
        System.out.println(String.format("Guthrie index of 4 is %d", guthrieIndex(4))); // 2
        System.out.println(String.format("Guthrie index of 42 is %d", guthrieIndex(42))); // 8
    }

    private static int guthrieIndex(int n) {
        if (n < 1) return 0;

        if (n == 1) return 0;

        int iterationsCount = 0;

        int currentValue = n;

        while (currentValue != 1) {

            currentValue = nextGuthrie(currentValue);

            iterationsCount++;

        };

        return iterationsCount;
    }

    private static int nextGuthrie(int n) {
        if (n == 1) return 1;

        if (n % 2 == 0) return n / 2;
        else return (n * 3) + 1; 
    }
}
