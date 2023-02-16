package week_2;

public class Pg_39 {
}
class Palindrome {
    public static int findReverse(int num) {
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int num) {
        return num == findReverse(num);
    }

    public static void displayPalindromeNos(int n) {
        System.out.println("Palindrome numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

class PalindromeDemo {
    public static void main(String[] args) {
        int num = 121;
        boolean check = Palindrome.isPalindrome(num);
        if (check) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
        Palindrome.displayPalindromeNos(1000);
    }
}

