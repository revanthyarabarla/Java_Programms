package week_3;
import java.util.Scanner;
public class Pg_55
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int max = 0;
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (arr[j]-arr[i]>max)
                {
                    max = arr[j]-arr[i];
                }
            }
        }
        System.out.println(max);
        scan.close();
    }
}
