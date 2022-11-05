import java.util.Arrays;

public class ClusterCompression {
  public static void main(String[] args) {
    int[] a = clusterCompression2(new int[] {0, 0, 0, 2, 0, 2, 0, 2, 0, 0});
    System.out.println("{0, 0, 0, 2, 0, 2, 0, 2, 0, 0} : " + Arrays.toString(a)); // [0, 2, 0, 2, 0, 2, 0]
    int[] b = clusterCompression2(new int[] {18});
    System.out.println("{18} : " + Arrays.toString(b)); // [18]
    int[] c = clusterCompression2(new int[] {});
    System.out.println("{} : " + Arrays.toString(c)); // []
    int[] d = clusterCompression2(new int[] {-5, -5, -5, -5, -5});
    System.out.println("{-5, -5, -5, -5, -5} : " + Arrays.toString(d)); // [-5]
    int[] e = clusterCompression2(new int[] {1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1});
    System.out.println("{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1} : " + Arrays.toString(e)); // [1, 2, 1]
    int[] f = clusterCompression2(new int[] {8, 8, 6, 6, -2, -2, -2});
    System.out.println("{8, 8, 6, 6, -2, -2, -2} : " + Arrays.toString(f)); // [8, 6, -2]
  }

  private static int[] clusterCompression1(int[] a) {
    String stringCluster = "";

    if (a.length <= 0) return a;

    for (int i = 0; i < a.length; i++) {
      if ((i == 0) || (i == a.length - 1 && a[i] != a[i - 1])) stringCluster += a[i] + " ";
      else if (a[i] != a[i - 1]) stringCluster += a[i] + " "; 
    }

    String[] stringClusterArray = stringCluster.split(" ");

    int[] clutserArray = new int[stringClusterArray.length];

    for (int i = 0; i < stringClusterArray.length; i++) clutserArray[i] = Integer.parseInt(stringClusterArray[i]);

    return clutserArray;
  }

  private static int[] clusterCompression2(int[] a) {
    if (a.length <= 1) return a;

    int current = a[0], count = 1;

    for (int i = 0; i < a.length; i++) {
      if (a[i] != current) {
        current = a[i];
        ++count;
      }
    }

    int[] result = new int[count];
    count = 1;
    current = a[0];
    result[0] = current;

    for (int i = 0; i < a.length; i++) {
      if (a[i] != current) {
        current = a[i];
        result[count++] = a[i];
      }
    }

    return result;
  }
}
