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
            int b[] = new int[n];
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            for(int i=0;i<n;i++)
                b[i] = sc.nextInt();
            
            Arrays.sort(a);
            Arrays.sort(b);
            
            int ans = 1;
            long mod = 1000000007;
            int j = 0;
            
            for(int i=0;i<n;i++)
            {
                while(j < n && b[j] < a[i])
                    j++;
                
                ans = (int)((ans*1L*(j-i))%mod);
            }
            
            System.out.println(ans);
        }
    }
}