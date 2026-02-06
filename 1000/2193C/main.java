import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int q = sc.nextInt();
            
            long[] a = new long[n];
            long[] b = new long[n];
            
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            for (int i = 0; i < n; i++)
                b[i] = sc.nextLong();
            
            // Replace with max of a[i] and b[i]
            for (int i = 0; i < n; i++)
                a[i] = Math.max(a[i], b[i]);
            
            // Suffix maximums
            for (int i = n - 2; i >= 0; i--)
                a[i] = Math.max(a[i], a[i + 1]);
            
            // Prefix sums
            for (int i = 1; i < n; i++)
                a[i] += a[i - 1];
            
            StringBuilder sb = new StringBuilder();
            while (q-- > 0) 
            {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
                
                long ans = a[r] - (l - 1 >= 0 ? a[l - 1] : 0);
                sb.append(ans).append(" ");
            }

            System.out.println(sb.toString().trim());
        }
    }
}
