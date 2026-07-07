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
            
            a[0] = sc.nextInt();
            for(int i=1;i<n;i++)
                a[i] = sc.nextInt() + a[i-1];
            
            int m = sc.nextInt();
            int b[] = new int[m];
            
            b[0] = sc.nextInt();
            for(int i=1;i<m;i++)
                b[i] = sc.nextInt() + b[i-1];
                
            int maxi = 0;

            // find max prefix sum
            // a[i] + b[j]
            // individual check
            for(int i=0;i<n;i++)
            {
                // individual check
                maxi = Math.max(maxi, a[i]);
                for(int j=0;j<m;j++)
                {
                    maxi = Math.max(maxi, a[i] + b[j]);
                    // individual check
                    maxi = Math.max(maxi, b[j]);
                }
            }
            
            System.out.println(maxi);
        }
    }
}