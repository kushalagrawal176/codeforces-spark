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
            int n = sc.nextInt();
            long g = sc.nextLong();
            
            for(int i=1;i<n;i++)
                g = gcd(g, sc.nextLong());
            
            if(g == 1)
            {
                System.out.println(2);
                continue;
            }
                
            for(int i=2;i<=10000;i++)
            {
                if(gcd(g, i) == 1)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}