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
            long a[] = new long[n];
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextLong();
                
            Arrays.sort(a);
            
            long g = 0;
            for(int i=1;i<n;i++)
            {
                if(a[i]%a[0] == 0)
                    g = gcd(g, a[i]);
            }
            
            if(g == a[0])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}