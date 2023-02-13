package week_1;
public class Pg_26 {
    public static void main(String[] args) {
    int n = 4;
    int height = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
            height *= 2;
            }
            else {
            height += 1;
            }
        }
        System.out.println("The height of the Utopian Tree after " + n + " growth cycles is " + height + " meters.");
    }
}
