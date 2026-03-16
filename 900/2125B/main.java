import java.util.*;
public class main
{
    public static long gcd(long a, long b)
    {
        if(b == 0)
            return a;
        
        return gcd(b, a%b);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();
            
            long g = gcd(a, b);
            
            if(a/g <= k && b/g <= k)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}