import java.util.Scanner;
public class Prime {
    public static boolean isprime(int n)
    {
        for (int i=2; i<n; i++)
        {
            if (n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("given no is prime : " + isprime(n));
    }
}
