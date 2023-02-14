package week_2;

import java.util.Scanner;

public class Pg_35 {
}
class P2
{
    public static void Utility(int n)
    {
        int num = n;
        int i=0;
        int[] rev = new int[10];
        while (num/10>0)
        {
            rev[i]=num%10;
            num/=10;
            i++;
        }
        rev[i]=num;
        System.out.print("\nReverse Is: ");
        for (int j=0;j<=i;j++)
        {
            System.out.print(rev[j]+" ");
        }
    }
    public static void Checker(int n)
    {
        int num = n,mul;
        int i=0,sum=0,pal=0;
        int[] m = new int[10];
        while (num/10>0)
        {
            m[i]=num%10;
            pal+=m[i]*10;
            num/=10;
            i++;
        }
        m[i]=num;
        pal+=m[i];
        for (int j=0;j<=i;j++)
        {
            mul=m[j];
            for (int k=0;k<i;k++)
            {
                m[j]*=mul;
            }
            sum+=m[j];
        }
        if (sum==n)
        {
            System.out.println("\n\nArmstrong Number: Yes");
        }
        else
        {
            System.out.println("\n\nArmstrong Number: No");
        }
        if (pal==n)
        {
            System.out.println("\nPalindrome Number: Yes");
        }
        else
        {
            System.out.println("\nPalindrome Number: No");
        }
    }
    public static void displayAll(int n)
    {
        int k=0,b=0;
        int[] all = new int[n];
        int[] arm = new int[n];
        int[] sum = new int[n+1];
        int[] ast = new int[n];
        for (int i=1;i<=n;i++)
        {
            int pal = 0;
            int num = i;
            while (num/10>0)
            {
                pal+=num%10;
                pal*=10;
                num/=10;
            }
            pal+=num;
            if (pal==i)
            {
                all[k]=i;
                k++;
            }
        }
        System.out.print("\nAll Palindrome Numbers Till "+n+" Are: ");
        for (int i=0;i<k;i++)
        {
            System.out.print(all[i]+" ");
        }
        System.out.println();
        for (int i=1;i<=n;i++)
        {
            k=0;
            int num = i;
            sum[i]=0;
            while (num/10>0)
            {
                arm[k]=num%10;
                num/=10;
                k++;
            }
            arm[k]=num;
            for (int j=0;j<=k;j++)
            {
                int mul = arm[j];
                for (int l=0;l<k;l++)
                {
                    arm[j]*=mul;
                }
                sum[i]+=arm[j];
            }
            if (sum[i]==i)
            {
                ast[b]=i;
                b++;
            }
        }
        System.out.print("\nAll Armstrong Numbers Till "+n+" Are: ");
        for (int i=0;i<b;i++)
        {
            System.out.print(ast[i]+" ");
        }
    }
}
class P1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        P2.Utility(n);
        P2.Checker(n);
        P2.displayAll(n);
        scan.close();
    }
}
