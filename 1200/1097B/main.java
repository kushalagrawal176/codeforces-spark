import java.util.*;
 
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        boolean[] dp = new boolean[360];
        dp[0] = true;
        
        for (int angle : a) 
        {
            boolean[] next = new boolean[360];
            for (int pos = 0; pos < 360; pos++) 
            {
                if (dp[pos]) 
                {
                    next[(pos + angle) % 360] = true;
                    next[(pos - angle + 360) % 360] = true;
                }
            }
            dp = next;
        }
        
        System.out.println(dp[0] ? "YES" : "NO");
    }
}