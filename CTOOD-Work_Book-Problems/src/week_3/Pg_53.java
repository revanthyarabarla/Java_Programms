package week_3;
import java.util.Scanner;
public class Pg_53
{
    public static void Series(int[] ser)
    {
        int sum = 0;
        for (int i=0;i<ser.length;i++)
        {
            sum+=ser[i];
        }
        System.out.println("Series: "+sum);
    }
    public static void Parallel(double[] par)
    {
        double sum = 0;
        for (int i=0;i<par.length;i++)
        {
            sum+=par[i];
        }
        System.out.println("Parallel: "+sum);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int[] ser = new int[n];
        double[] par = new double[n];
        for (int i=0;i<n;i++)
        {
            ser[i] = scan.nextInt();
        }
        for (int j=0;j<n;j++)
        {
            par[j] = scan.nextDouble();
        }
        Series(ser);
        Parallel(par);
        scan.close();
    }
}
