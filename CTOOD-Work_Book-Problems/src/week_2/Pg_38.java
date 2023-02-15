package week_2;

public class Pg_38 {
}
class Armstrong {
    public static boolean isArmstrong(int n) {
        int original = n;
        int result = 0;
        int digits = (int) (Math.log10(n) + 1);
        while (n != 0) {
            int remainder = n % 10;
            result += Math.pow(remainder, digits);
            n /= 10;
        }
        return original == result;
    }

    public static void displayArmstrong(int n) {
        System.out.println("Armstrong numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int num = 370;
        boolean check = isArmstrong(num);
        if (check) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        displayArmstrong(1000);
    }
}
