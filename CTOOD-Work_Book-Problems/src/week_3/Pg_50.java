package week_3;
import java.util.Scanner;
public class Pg_50 {
   int n;
    int temp = n;
    //while(temp > 4)
    {
        temp = sum_of_sq(temp);
        if(temp == 1)
            System.out.println("Happy Number");
        else System.out.println("Not a Happy Number");
    }
    public static int sum_of_sq(int n)
    {
        int s = 0;
        while(n!=0)
        {
            int r = n%10;
            s = s+r*r;
            n = n/10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
    }
}
