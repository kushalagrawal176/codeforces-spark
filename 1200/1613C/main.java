import java.util.*;
public class main
{
    public static long damage(int a[], int n, long k)
    {
        long cnt = 0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]+k < a[i+1])
                cnt += k;
            else
                cnt += a[i+1]-a[i];
        }
        
        cnt += k;
        
        return cnt;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            long h = sc.nextLong();
            
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            if(h <= n)
                System.out.println(1);
            else
            {
                long k = 1;
                long low = 1;
                long high = h;
                
                while(low <= high)
                {
                    long mid = low + (high-low)/2;
                    
                    if(damage(a, n, mid) >= h)
                    {
                        k = mid;
                        high = mid-1;
                    }
                    else
                        low = mid+1;
                }
                
                System.out.println(k);
            }
        }
    }
}