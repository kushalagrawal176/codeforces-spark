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
            int q = sc.nextInt();
            
            long prefix_sum[] = new long[n+1];
            long max_ele[] = new long[n+1];
            
            prefix_sum[0] = 0;
            max_ele[0] = 0;
            
            for(int i=1;i<=n;i++)
            {
                long ele = sc.nextLong();
                prefix_sum[i] = ele + prefix_sum[i-1];
                max_ele[i] = Math.max(ele, max_ele[i-1]);
            }
            
            while(q-- > 0)
            {
                long ele = sc.nextLong();
                
                int l = 0;
                int r = n;
                
                while(l < r)
                {
                    int mid = (l+r+1)/2;
                    
                    if(max_ele[mid] <= ele)
                        l = mid;
                    else
                        r = mid-1;
                }
                
                System.out.print(prefix_sum[l]+" ");
            }
            
            System.out.println();
        }
    }
}