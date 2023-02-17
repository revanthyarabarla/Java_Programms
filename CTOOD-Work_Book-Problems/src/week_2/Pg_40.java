package week_2;

import java.util.Scanner;

public class Pg_40 {
    public static void NewYoung()
    {
        System.out.println("Age Not Valid....Resetting To 0");
        for (int i=0;i<2;i++)
        {
            System.out.println("You Are Young");
        }
        System.out.println("\n");
    }
    public static void Young()
    {
        System.out.println("You Are Young");
        System.out.println("You Are Teen");
        System.out.println("\n");
    }
    public static void teen()
    {
        System.out.println("You Are Teen");
        System.out.println("You Are Old");
        System.out.println("\n");
    }
    public static void old()
    {
        for (int i=0;i<2;i++)
        {
            System.out.println("You Are Old");
        }
        System.out.println("\n");
    }
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner (System.in);
        System.out.print("Enter The Number Of Testcases: ");
        int n = scan.nextInt();
        int[] num = new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.print("Enter Age Of Person - "+(i+1)+": ");
            num[i]=scan.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if (num[i]<0)
            {
                NewYoung();
            }
            else if (num[i]<13)
            {
                Young();
            }
            else if (num[i]<18)
            {
                teen();
            }
            else
            {
                old();
            }
        }
    }
}
