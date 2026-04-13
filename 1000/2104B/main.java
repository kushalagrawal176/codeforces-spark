import java.util.*;
public class main
{
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
 
            long sum[] = new long[n];
            int maxi[] = new int[n];
            
            long s = 0;
 
            for(int i=n-1;i>=0;i--)
            {
                s += a[i];
                sum[i] = s;
            }
            
            int m = a[0];
            for(int i=0;i<n;i++)
            {
                m = Math.max(m, a[i]);
                maxi[i] = m;
            }
            
            for(int i=n-1;i>=0;i--)
            {
                System.out.print(sum[i]-a[i]+Math.max(a[i], maxi[i]) + " ");
            }
            
            System.out.println();
        }
    }
}