import java.util.*;
public class main
{
    public static long gcd(long a, long b)
    {
        if(a == 0)  
            return b;
        
        return gcd(b%a, a);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextInt();
            
            if((n&1) == 0)
                System.out.println(n/2 + " " + n/2);
            else
            {
                long a = -1;
                long b = -1;
                
                long lcm = Long.MAX_VALUE;
                
                for(int i=1;i<=Math.sqrt(n);i++)
                {
                    if(n%i == 0)
                    {
                        long f1 = i;
                        long l = ((f1*1L*(n-f1))/gcd(f1, n-f1));
                        if(l < lcm)
                        {
                            lcm = l;
                            a = f1;
                            b = n-f1;
                        }
                        
                        if(i == 1)
                            continue;
                            
                        long f2 = n/i;
                        l = ((f2*1L*(n-f2))/gcd(f2, n-f2));
                        if(l < lcm)
                        {
                            lcm = l;
                            a = f2;
                            b = n-f2;
                        } 
                    }
                }
                
                System.out.println(a + " " + b);
            }
        }
    }
}
