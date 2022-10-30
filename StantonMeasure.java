public class StantonMeasure {
    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(String.format("Stantonm Measure of {1} is %d", stantonMeasure(a))); // 1
        int[] b = {0};
        System.out.println(String.format("Stantonm Measure of {0} is %d", stantonMeasure(b))); // 1
        int[] c = {3,1,1,4};
        System.out.println(String.format("Stantonm Measure of {3,1,1,4} is %d", stantonMeasure(c))); // 0
        int[] d = {1,3,1,1,3,3,2,3,3,3,4};
        System.out.println(String.format("Stantonm Measure of {1,3,1,1,3,3,2,3,3,3,4} is %d", stantonMeasure(d))); // 6
        int[] e = {};
        System.out.println(String.format("Stantonm Measure of {} is %d", stantonMeasure(e))); // 0
    }

    private static int stantonMeasure(int[] a) {
        int stantonMeasure = 0;

        int onesCount = 0;

        for (int el: a) if (el == 1) onesCount++;

        for (int el: a) if (el == onesCount) stantonMeasure++;

        return stantonMeasure;
    }
}
