package week_2;

import java.util.Scanner;

public class Pg_41 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        for (int i=0;i<=n;i++)
        {
            int a=1;
            for (int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print(a+" ");
                a=(a*(i-k)/(k+1));
            }
            System.out.println();
        }
        scan.close();
    }
}
