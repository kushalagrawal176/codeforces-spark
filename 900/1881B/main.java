import java.util.*;
public class main
{
    public static long gcd(long a, long b)
    {
        if(b == 0) 
            return a;
 
        return gcd(b,a%b);
    }
 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0)
        {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();
 
            long d = gcd(a,gcd(b,c));
 
            if(a/d + b/d + c/d <= 6) 
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}