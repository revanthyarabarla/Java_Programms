package week_3;
import java.util.Scanner;
public class Pg_54
{
    public static void FindAssistants(int[] arr)
    {
        int sum = 0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i]-3;
        }
        System.out.println("Total Assistant Professors: "+sum);
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
        FindAssistants(arr);
        scan.close();
    }
}
