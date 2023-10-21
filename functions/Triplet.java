import java.util.Scanner;
public class Triplet {
    public static boolean istriplet(int a, int b, int c)
    {
        if (a>b)
        {
            if(a>c)
                if(a*a==((b*b)+(c*c)))
                    return true;
        } else if (b>c) {
            if(b*b==((a*a)+(c*c)))
                return true;
        }
        else
            if(c*c==((a*a)+(b*b)))
                return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("given set is triplet : " + istriplet(a,b,c));
    }
}
