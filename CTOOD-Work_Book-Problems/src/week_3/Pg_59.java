package week_3;

import java.util.Scanner;

public class Pg_59 {
}
class Pal
{
    public static void Check(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            int n = arr[i];
            int pal = 0;
            int num = arr[i];
            while (num/10>0)
            {
                pal+=num%10;
                pal*=10;
                num/=10;
            }
            pal+=num;
            if (pal!=n)
            {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
class Real
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        Pal.Check(arr);
        scan.close();
    }
}
