package week_3;

public class Pg_56 {
    public static void sort(double a[], int n) {
        for (int p = 1; p < n; p++) {
            for (int i = 0; i < n; i++) {
                if (a[i] > a[i + 1]) {
                    int t = (int) a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static double find_smallest(int t) {
        double a[];
        int n;
        for (int j = 1; j < n; j++) {
            if (a[j] > t)
                t = (int) a[j];
            return t;
        }
   }

public static double find_largest(int j) {
    double k = a[0];
    for (j = 1; j < n; j++) {
        if (a[i] > k) {
            k = a[j];
        }
        return t;
    }
  }
}
