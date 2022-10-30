import java.util.ArrayList;
import java.util.Collections;

public class Inertial {
    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(String.format("{1}: %d", isInertial(a))); // 0
        int[] b = {2};
        System.out.println(String.format("{2}: %d", isInertial(b))); // 0
        int[] c = {1,2,3,4};
        System.out.println(String.format("{1,2,3,4}: %d", isInertial(c))); // 0
        int[] d = {1,1,1,1,1,1,2};
        System.out.println(String.format("{1,1,1,1,1,1,2}: %d", isInertial(d))); // 1
        int[] e = {2,12,4,6,8,11};
        System.out.println(String.format("{2,12,4,6,8,11}: %d", isInertial(e))); // 1
        int[] f = {2,12,12,4,6,8,11};
        System.out.println(String.format("{2,12,12,4,6,8,11}: %d", isInertial(f))); // 1
        int[] g = {-2,-4,-6,-8,-11};
        System.out.println(String.format("{-2,-4,-6,-8,-11}: %d", isInertial(g))); // 0
        int[] h = {2,3,5,7};
        System.out.println(String.format("{2,3,5,7}: %d", isInertial(h))); // 0
        int[] i = {2,4,6,8,10};
        System.out.println(String.format("{2,4,6,8,10}: %d", isInertial(i))); // 0
    }

    public static int isInertial(int[] a) {
        boolean containsOdd = false;
        boolean maxIsEven = false;
        boolean oddsAreGreaterThanEvensLessThanMaximumEven = true;

        int max = 0;
        ArrayList<Integer> oddValues = new ArrayList<>();
        ArrayList<Integer> evenValues = new ArrayList<>();

        for (int el: a) {
            if (!containsOdd && el % 2 != 0) containsOdd = true;

            if (el > max) max = el;
            
            if (max % 2 == 0) maxIsEven = true;
            else maxIsEven = false;

            if (el % 2 == 0) evenValues.add(el);
            else oddValues.add(el); 
        }

        // remove all occurence of max value from even values array list
        if (evenValues.contains(max)) evenValues.removeAll(Collections.singleton(max));

        if (containsOdd) {
            for (int oddVal: oddValues) {
                outerloop:
                for (int evenVal: evenValues) {
                    if (oddVal < evenVal) {
                        oddsAreGreaterThanEvensLessThanMaximumEven = false;
                        break outerloop;
                    }
                }
            }
        }

        if (containsOdd && maxIsEven && oddsAreGreaterThanEvensLessThanMaximumEven) return 1;
        else return 0;
    }
}
