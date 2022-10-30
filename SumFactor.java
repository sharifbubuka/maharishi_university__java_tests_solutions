public class SumFactor {
    public static void main(String[] args) {
        int[] a = {3,0,2,-5,0};
        System.out.println(String.format("Sum Factor of {3,0,2,-5,0} is %d", sumFactor(a))); // 2
        int[] b = {9,-3,-3,-1,-1};
        System.out.println(String.format("Sum Factor  of {9,-3,-3,-1,-1} is %d", sumFactor(b))); // 0
        int[] c = {1};
        System.out.println(String.format("Sum Factor  of {1} is %d", sumFactor(c))); // 1
        int[] d = {0,0,0};
        System.out.println(String.format("Sum Factor  of {0,0,0} is %d", sumFactor(d))); // 3
    }

    private static int sumFactor(int[] a) {
        if (a.length == 0) return 0;

        int sumFactor = 0;
        int sum = 0;

        for (int el: a) sum = sum + el;

        for (int el: a) if (el == sum) sumFactor++;

        return sumFactor;
    }
}
