public class RepsEqual {
  public static void main(String[] args) {
    int[] a = {3,2,0,5,3};
    System.out.println(String.format("{3,2,0,5,3}: %d", repsEqual(a, 32053))); // 1
    int[] b = {3,2,0,5};
    System.out.println(String.format("{3,2,0,5}: %d", repsEqual(b, 32053))); // 0
    int[] c = {3,2,0,5,3,4};
    System.out.println(String.format("{3,2,0,5,3,4}: %d", repsEqual(c, 32053))); // 0
    int[] d = {2,3,0,5,3};
    System.out.println(String.format("{2,3,0,5,3}: %d", repsEqual(d, 32053))); // 0
    int[] e = {9,3,1,1,2};
    System.out.println(String.format("{9,3,1,1,2}: %d", repsEqual(e, 32053))); // 0
    int[] f = {0,3,2,0,5,3};
    System.out.println(String.format("{0,3,2,0,5,3}: %d", repsEqual(f, 32053))); // 1
    // int[] a = {0,0,0,0,2,3,4,5};
    // int[] b = cleanNumArray(a);
    // for (int num : b) {
    //   System.out.println(String.format("%d", num));
    // }
  }

  private static int[] cleanNumArray(int[] a) {

    int[] cleanNumArray = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      if (a[i] != 0) {
        int len = a.length - i;
        cleanNumArray = new int[len];
        System.arraycopy(a, i, cleanNumArray, 0, len);
        break;
      }
    }

    return cleanNumArray;
  }

  private static int repsEqual(int[] a, int n) {

    int flag = 1;

    int[] cleanA = cleanNumArray(a);

    String[] stringNumArray = Integer.toString(n).split("");

    if (stringNumArray.length != cleanA.length) return --flag;

    for (int i = 0; i < stringNumArray.length; i++) {
      // System.out.println(String.format("i = %d, len = %d", i, stringNumArray.length));
      if (Integer.parseInt(stringNumArray[i]) != cleanA[i]) {
        flag = 0;
        break;
      }
    }
    
    return flag;
  }


}
