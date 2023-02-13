package week_1;

import java.util.Scanner;

public class Pg_13 {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        String s = scan.next();
        int r = 0, l = 0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='L')
            {
                l++;
            }
            else
            {
                l--;
            }
            if (l==0)
            {
                r++;
            }
        }
        System.out.println("Number Of Substrings: "+r);
        scan.close();
    }
}
