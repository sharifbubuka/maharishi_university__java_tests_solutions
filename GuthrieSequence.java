public class GuthrieSequence {
    public static void main(String[] args) {
        int[] a = {8,4,2,1};
        System.out.println(String.format("{8,4,2,1} is a Guthrie sequence: %d", isGuthrieSequence(a)));
        int[] b = {8,17,4,1};
        System.out.println(String.format("{8,17,4,1} is a Guthrie sequence: %d", isGuthrieSequence(b)));
        int[] c = {8,4,1};
        System.out.println(String.format("{8,4,1} is a Guthrie sequence: %d", isGuthrieSequence(c)));
        int[] d = {8,4,2};
        System.out.println(String.format("{8,4,2} is a Guthrie sequence: %d", isGuthrieSequence(d)));
    }

    private static int isGuthrieSequence(int[] a) {
        int isGuthrieSequence = 0;

        if (a[a.length - 1] != 1 || a[0] < 1) return isGuthrieSequence;

        int iteratorValue = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] != iteratorValue) return isGuthrieSequence;

            if (a[i] % 2 == 0) {
                iteratorValue = a[i] / 2;
            } else {
                iteratorValue = (a[i] * 3) + 1;
            }
        }

        isGuthrieSequence = 1;
        return isGuthrieSequence;
    }

    // recursive implementation of the Guthrie Sequence
    // private static int isGuthrieSequence(int[] a) {
    //     if (a.length == 1 && a[0] == 1) return;

         
    // }
}
