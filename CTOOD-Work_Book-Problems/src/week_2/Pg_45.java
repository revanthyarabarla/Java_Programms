package week_2;

import java.util.Scanner;

public class Pg_45 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int num;
        for (int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            num = 0;
            for (Double j=1.0;j<=arr[i];j++)
            {
                for (Double k=1.0;k<=1000;k*=10)
                {
                    if ((j/k)<10 && (((j/k)==Math.ceil(j/k)) || (j/k)==Math.floor(j/k)))
                    {
                        num++;
                        break;
                    }
                }
            }
            System.out.println(num);
        }
    }
}
