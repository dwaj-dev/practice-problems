//Q: Write a function to find if a number is a palindrome or not.
// Take number as parameter.
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        if (ispalindrome(n))
            System.out.println(n +" is palindrome");
        else
            System.out.println(n + " is not a palindrome");
    }

    private static boolean ispalindrome(int n) {
        int newno=0;
        int temp=n;
        while (temp > 0) {
            int ld = temp % 10;
            newno = (newno * 10) + ld;
            temp = temp / 10;
        }
        return n==newno;
    }
}

