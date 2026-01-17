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
            int x = sc.nextInt();
            
            int a[] = new int[n];
            int h = 0;
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                h = Math.max(h, a[i]);
            }
            
            long ans = -1;
            long l = 0;
            long r = h + x;
            
            while(l <= r)
            {
                long mid = (l+r) / 2;
                
                long sum = 0;
                for(int i=0;i<n;i++)
                    sum += Math.max(0, mid - a[i]);
                
                if(x >= sum)
                    ans = mid;
                
                if(sum == x)
                    break;
                
                if(x > sum)
                    l = mid + 1;
                else
                    r = mid - 1;
            }
            
            System.out.println(ans);
        }
    }
}