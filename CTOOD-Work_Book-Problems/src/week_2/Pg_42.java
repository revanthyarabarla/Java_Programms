package week_2;
import java.util.Scanner;
public class Pg_42 {
    public static void divisorGame(int n)
    {
        int alice = 0;
        int i=1;
        while (i<n)
        {
            if (n%i==0)
            {
                n-=i;
                alice++;
                i=1;
            }
            else
            {
                i++;
            }
        }
        if (alice%2!=0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = s.nextInt();
        divisorGame(n);
        s.close();
    }
}