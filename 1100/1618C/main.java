import java.util.*;
 
public class main 
{
    static long gcd(long a, long b) 
    {
        while (b != 0) 
        {
            long t = a % b;
            a = b;
            b = t;
        }
        
        return a;
    }
 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            long[] a = new long[n];
    
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextLong();
 
            // Compute gcd of even-index and odd-index groups
            long g_even = 0, g_odd = 0;
            for (int i = 0; i < n; i++) 
            {
                if (i % 2 == 0)
                    g_even = gcd(g_even, a[i]);
                else 
                    g_odd = gcd(g_odd, a[i]);
            }
 
            // Check if g_even is a valid answer:
            boolean flag1 = true;
            for (int i = 1; i < n; i += 2) 
            {
                if (a[i] % g_even == 0) 
                {
                    flag1 = false;
                    break;
                }
            }
 
            // Check if g_odd is a valid answer:
            boolean flag2 = true;
            for (int i = 0; i < n; i += 2) 
            {
                if (a[i] % g_odd == 0) 
                {
                    flag2 = false;
                    break;
                }
            }
 
            long ans = 0;
            if (flag1 && g_even > 0) 
                ans = g_even;
            if (flag2 && g_odd > ans) 
                ans = g_odd;
 
            System.out.println(ans);
        }
    }