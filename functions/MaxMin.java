//Define two methods to print the maximum and the minimum number respectively
// among three numbers entered by the user.
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("maximum no is : " + MaxInt(a,b,c));
        System.out.println("minimum is : " + MinInt(a,b,c));
    }
    public static int MaxInt(int a, int b, int c)
    {
        int max=a;
        if (a>b)
        {
            if(a>c){
                max= a;
            }
        } else if (b>c) {
            max= b;
        }
        else
            max= c;

        return max;
    }
    public static int MinInt(int a,int b, int c)
    {
        int min =a;
        if (a<b){
            if(a<c)
            {
                min = a;
            }
        } else if (b<c) {
            min = b;
        }
        else
            min=c;

        return min;
    }
    
}
