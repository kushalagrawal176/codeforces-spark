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
            
            int prev = sc.nextInt();
            
            int ans = Integer.MIN_VALUE;
            ans = Math.max(ans, prev - 0);
            
            for(int i=0;i<n-1;i++)
            {
                int next = sc.nextInt();
                ans = Math.max(ans, next - prev);
                prev = next;
            }
            
            ans = Math.max(ans, 2*(x - prev));
            
            System.out.println(ans);
        }
    }
}