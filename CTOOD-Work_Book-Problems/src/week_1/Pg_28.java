package week_1;

public class Pg_28 {
}
class BinaryConversion {
    public static void main(String[] args) {
        int n = 125;
        String binary = Integer.toBinaryString(n);
        int max = 0;
        int count = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);

        System.out.println("The maximum number of consecutive 1's in the binary representation of " + n + " is " + max);
    }
}
