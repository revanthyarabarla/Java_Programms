package week_3;
import java.util.Scanner;
public class Pg_57
{
    public static int Square(int s)
    {
        int area;
        area = s*s;
        System.out.println("Area Of Square: "+area);
        return area;
    }
    public static int Rectangle(int l, int b)
    {
        int area;
        area = l*b;
        System.out.println("Area Of Rectangle: "+area);
        return area;
    }
    public static double Circle(double r)
    {
        double area;
        area = 3.14*r*r;
        System.out.println("Area Of Circle: "+area);
        return area;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int s = scan.nextInt();
        int l = scan.nextInt();
        int b = scan.nextInt();
        double r = scan.nextDouble();
        Square(s);
        Rectangle(l, b);
        Circle(r);
        scan.close();
    }
}

