package week_2;
import java.util.Scanner;
public class Pg_33 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt(),num;
        int[] sum = new int[n+1];
        for (int i=0;i<=n;i++)
        {
            num = i;
            sum[i]=0;
            while (num>0)
            {
                if (num%2!=0)
                {
                    sum[i]++;
                }
                num/=2;
            }
        }
        for (int i=0;i<=n;i++)
        {
            System.out.print(sum[i]+" ");
        }
    }
}
