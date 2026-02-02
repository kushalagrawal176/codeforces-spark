import java.util.*;
public class main
{
    public static int gcd(int a, int b)
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
            int a[] = new int[n];
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            int val = 0;
            for(int i=0;i<n/2;i++)
                val = gcd(val, Math.abs(a[i]-a[n-1-i]));
            
            System.out.println(val);
        }
    }
}