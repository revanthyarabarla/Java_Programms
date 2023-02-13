package week_2;
import java.util.Scanner;
public class Pg_16 {
    public static void main(String[] args) {
        double n ;
        System.out.print("Enter n value : ");
        Scanner s = new Scanner(System.in);
        n = s.nextDouble();
        if(n >= -128 && n <= 127){
            System.out.println("Byte");
        }
        else if(n >= -32768 && n <= 32767){
            System.out.println("short");
        }
        else if(n >= -214748364 && n <= 2147483647){
            System.out.println("integer");
        }
        else{
            System.out.println("Big int ");
        }
        s.close();
    }

}

