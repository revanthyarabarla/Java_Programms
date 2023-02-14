package week_2;

import java.util.Scanner;

public class Pg_37 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int a=0, b=1, c=0;
        if (n==0 || n==1 || n==2 || n==3)
        {
            System.out.println("Number Of Distinct Ways Are: "+n);
            return;
        }
        else
        {
            System.out.print("Number Of Distinct Ways Are: ");
        }
        for (int i=0;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}
