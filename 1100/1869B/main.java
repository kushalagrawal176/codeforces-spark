import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
 
            long x[] = new long[(int)n+1];
            long y[] = new long[(int)n+1];
 
            for(int i=1;i<=n;i++)
            {
                x[i] = sc.nextLong();
                y[i] = sc.nextLong();
            }
 
            long p = Math.abs(x[(int)a]-x[(int)b]) + Math.abs(y[(int)a]-y[(int)b]);
 
            long u = Long.MAX_VALUE/2;
            long v = Long.MAX_VALUE/2;
 
            for(int i=1;i<=k;i++)
            {
                u = Math.min(u, Math.abs(x[(int)a]-x[i]) + Math.abs(y[(int)a]-y[i]));
                v = Math.min(v, Math.abs(x[(int)b]-x[i]) + Math.abs(y[(int)b]-y[i]));
            }
 
            System.out.println(Math.min(p, u+v));
        }
    }
}