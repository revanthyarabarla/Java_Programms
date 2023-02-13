package week_1;
import java.util.Scanner;
public class Pg_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<11;i++){
            int ans = n * i;
            System.out.println(n + " x " + i + " = " + ans);
        }
        sc.close();
    }
}
