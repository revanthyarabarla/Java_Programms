package week_1;
import java.util.Scanner;
public class Pg_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of units  :");
        int n = s.nextInt();
        int ans;
        if(n<50) {
            ans=(n*2);
        }
        else if(n>=51 && n<=100) {
            ans=(n*3);
        }
        else if(n>=101 && n<=300) {
            ans=(n*5)+100;	//Extra charges = 100Rs
        }
        else if(n>=301 && n<=450) {
            ans=(n*6)+200;	//Extra charges = 200Rs
        }
        else {
            ans=(n*8)+250;	//Extra charges = 250Rs
        }
        System.out.print("The total amount to be pay = "+ans);
    }
}
