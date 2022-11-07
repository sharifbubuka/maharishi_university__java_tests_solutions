import java.util.Arrays;

public class FilterArray {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(filterArray(new int[] {8, 4, 9, 0, 3, 1, 2}, 88))); // [0, 3, 2]
    System.out.println(Arrays.toString(filterArray(new int[] {9, -9}, 0))); // []
    System.out.println(Arrays.toString(filterArray(new int[] {9, 9}, 1))); // [9]
    System.out.println(Arrays.toString(filterArray(new int[] {9, -9}, 2))); // [-9]
    System.out.println(Arrays.toString(filterArray(new int[] {9, -9}, 3))); // [9, -9]
    System.out.println(Arrays.toString(filterArray(new int[] {9, -9}, 4))); // null
    System.out.println(Arrays.toString(filterArray(new int[] {9, -9, 5}, 3))); // [9, -9]
    System.out.println(Arrays.toString(filterArray(new int[] {0, 9, 12, 18, -6}, 11))); // [0, 9, 18]
  } 

  private static int[] filterArray(int[] a, int n) {
    if (n < 1) return new int[] {};

    int numofbinarydigits = (int) Math.floor(Math.log(n) / Math.log(2)) + 1;

    int[] binaryrep = new int[numofbinarydigits];

    int product = n, onescount = 0;
    for (int i = 0; i < binaryrep.length; i++) {
      if (product < 2) {
        binaryrep[i] = product;
        onescount++;
        break;
      }

      int remainder = product % 2;
      if (remainder == 1) onescount++;
      binaryrep[i] = remainder;

      product = product / 2;
    }

    // System.out.println(Arrays.toString(binaryrep));

    int[] filteredarray = new int[onescount];

    int index = 0;
    for (int i = 0; i < binaryrep.length; i++) {
      if (binaryrep[i] == 1) {
        if (i > a.length - 1) return null;
        filteredarray[index] = a[i];
        index = index + 1;
      }
    }

    return filteredarray;
  }
}
