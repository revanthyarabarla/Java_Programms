package week_1;
import java.util.Scanner;
public class Pg_30 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter n digits number : ");
        int n = scan.nextInt();
        int num = n, pow = 0;
        int[] sum = new int[10];
        for (int i=0;num>0;i++,num/=10)
        {
            if (num%10>0)
            {
                sum[i] = num%10;
            }
            else
            {
                sum[i] = num;
            }
            pow++;
        }
        int ans = 0;
        for (int i=0;i<pow;i++)
        {
            int a = sum[i];
            for (int j=1;j<pow;j++)
            {
                sum[i]*=a;
            }
            ans+=sum[i];
        }
        if (ans==n)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
        scan.close();
    }
}
