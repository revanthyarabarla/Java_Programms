package week_1;
import java.util.Scanner;
public class Pg_21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = s.nextInt();
        int sum = 0, rem, i;
        for(i = 1; i < num; i++)
        {
            rem = num % i;
            if (rem == 0)
            {
                sum = sum + i;
            }
        }
        if (sum == num)
            System.out.print(num+" is a Perfect Number");
        else
            System.out.print(num+" is not a Perfect Number");
    }

}
