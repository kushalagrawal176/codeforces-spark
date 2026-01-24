import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
    
            long ans=0;
            
            if(k >= 2)
            {
                Arrays.sort(a);
                for(int i=n-1;i>=n-k-1;i--)
                    ans+=a[i];
            }   
            else
            {
                ans=(a[0]+a[n-1]);
                for(int i=1;i<n-1;i++)
                    ans=Math.max(ans,Math.max(a[0],a[n-1])+a[i]);
            }
            
            System.out.println(ans);
        }
    }
}