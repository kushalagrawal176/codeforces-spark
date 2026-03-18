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
            
            int maxi = a[0];
            for(int i=1;i<n;i++)
            {
                maxi = Math.max(maxi, a[i]);
                
                if(i%2 == 1) // even positions in 1-based indexing
                    a[i] = maxi;
            }
 
            int cnt = 0;
            for(int i=0;i<n;i++)
            {
                if(i%2 == 1)
                    continue;
 
                if(i+1 < n)
                {
                    if(a[i] < a[i+1])
                    {}
                    else
                    {
                        cnt += a[i]-a[i+1]+1;
                        a[i] -= a[i]-a[i+1]+1;
                    }
                }
 
                if(i-1 >= 0)
                {
                    if(a[i] < a[i-1])
                    {}
                    else
                        cnt += a[i]-a[i-1]+1;
                }
            }
            
            System.out.println(cnt);
        }
    }
}