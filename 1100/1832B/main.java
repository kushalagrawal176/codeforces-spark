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
            int k = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i=0; i<n; i++)
            {
              arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            
            long pre[] = new long[n+1];
            for(int i=0; i<n; i++)
            {
                pre[i+1] = pre[i]+arr[i];
            }
            
            long ans=0;
            for(int i=0; i<=k; i++)
            {
                if(2*i<=n && n-(k-i)>=0)
                {
                    ans = Math.max(ans, (pre[n-(k-i)]-pre[2*i]));
                }
            }
            
            System.out.println(ans);
        }
    }
}