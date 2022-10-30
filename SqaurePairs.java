public class SqaurePairs {
    public static void main(String[] args) {
        int[] a = {9,0,2,-5,7,16};
        System.out.println(String.format("{9,0,2,-5,7,16}: Square pairs are %d.", countSquarePairs(a))); // 3
        int[] b = {9};
        System.out.println(String.format("{9}: Square pairs are %d.", countSquarePairs(b))); // 0
    }

    // returns true if int is a perfect sqaure, otherwise returns false
    private static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);

        return(sqrt - Math.floor(sqrt) == 0);
    }

    // returns true if int is greater than 0, otherwise returns false
    private static boolean isPositive(int num) {
        return (num > 0);
    }

    // returns count of perfect squares in an array
    public static int countSquarePairs(int[] a) {
        int squarePairs = 0;

        for (int index = 0; index < a.length; index++) {
            if (!isPositive(a[index])) continue;
            for (int num = 0; num < a.length; num++) {
                if (a[num] == a[index] || !isPositive(a[num]) || a[num] > a[index]) continue;
                
                if (isPerfectSquare(a[index] + a[num])) squarePairs++;
            }
        }

        return squarePairs;
    }
}

