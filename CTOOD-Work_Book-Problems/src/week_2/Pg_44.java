package week_2;
import java.util.Scanner;
public class Pg_44 {

}
    class Hossam {
        public static boolean findFactor(int n1,int n2) {
            int num = (n1<n2) ? n1:n2;
            if(n1==n2)
                return true;
            for(int i=2;i<num/2;i++){
                if(n1%i==0 && n2%i==0) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int tc;
            tc = s.nextInt();
            int n,i,j,k,f=0;
            for(i=1;i<=tc;i++) {
                n=s.nextInt();
                int[] a =new int [n];
                for(j=0;j<n;j++) {
                    a[j] = s.nextInt();
                }
                for(j=0;j<a.length;j++) {
                    for(k=j+1;k<a.length;k++) {
                        if(findFactor(a[j],a[k])==true){
                            f=1;
                            System.out.println("YES");
                            break;
                        }
                    }
                }
                if(f == 0)
                    System.out.println("NO");
            }
        }
    }
