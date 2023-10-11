//Q: Given an integer N, write a program to count the number of digits in N.
import java.util.Scanner;
public class CountDigits {
    public static int countdig(int N)
    {
        int digit = 0;
        while (N>0)
        {
            digit ++;
            N= N/10;
        }
        return digit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(countdig(N));
    }
}
