package week_3;

import java.util.Scanner;

public class Pg_48 {
    public static void Search(int[] arr, int target)
    {
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==target)
            {
                System.out.println("True");
                return;
            }
        }
            System.out.println("False");
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
        int tar = scan.nextInt();
        Search(arr,tar);
        scan.close();
    }
}
