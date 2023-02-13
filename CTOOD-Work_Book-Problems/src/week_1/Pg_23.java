package week_1;

public class Pg_23 {
    public static void main(String[] args) {
    int base = 2;
    int exponent = 8;
    int result = 1;

        while (exponent != 0) {
        result *= base;
        exponent--;
    }
        System.out.println(base + "^" + exponent + " = " + result);
}
}
