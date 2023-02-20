package week_2;

public class Pg_43 {
}
class Amicable {
    public static boolean isFactor(int n, int m) {
        return m % n == 0;
    }

    public static boolean isAmicable(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i < n; i++) {
            if (isFactor(i, n)) {
                sum1 += i;
            }
        }
        for (int i = 1; i < m; i++) {
            if (isFactor(i, m)) {
                sum2 += i;
            }
        }
        return (sum1 == m && sum2 == n);
    }

    public static void displayAllAmicableNos(int n) {
        System.out.println("All pairs of amicable numbers up to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (isAmicable(i, j)) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 220, m = 284;
        if (isAmicable(n, m)) {
            System.out.println("(" + n + ", " + m + ") is a pair of amicable numbers.");
        } else {
            System.out.println("(" + n + ", " + m + ") is not a pair of amicable numbers.");
        }
        displayAllAmicableNos(3000);
    }
}
