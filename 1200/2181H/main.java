import java.util.*;
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();
        
        long cnt = n;
        long a = gcd(w,cnt);
        
        cnt /= a;
        long b = gcd(h,cnt);
        
        cnt /= b;
        long c = gcd(d,cnt);
        
        cnt /= c;
 
        if(cnt != 1)
        {
            System.out.println(-1);
            return;
        }
        else
            System.out.println((a-1) + " " + (b-1) + " " + (c-1));
 
 
    }
    private static long gcd(long a,long b)
    {
        if(b==0) 
            return a;
            
        return gcd(b, a%b);
    }
}