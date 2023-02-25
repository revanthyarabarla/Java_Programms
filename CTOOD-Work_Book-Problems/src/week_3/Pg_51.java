package week_3;
import java.util.Scanner;
public class Pg_51
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt(), num = 2;
        for (int i=0;i<100;i++)
        {
            if (num==n)
            {
                System.out.println("True");
                return;
            }
            num*=2;
        }
        System.out.println("False");
    }
}

