package week_3;
import java.util.Scanner;
public class Pg_52
{
    public static void FindMax(int[] arr)
    {
        int max = 0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void FindMax(int[] arr, int n)
    {
        int sum = 0;
        for (int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        FindMax(arr);
        FindMax(arr,n);
        scan.close();
    }
}
