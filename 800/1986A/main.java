import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int mini = Math.min(a, Math.min(b, c));
            int maxi = Math.max(a, Math.max(b, c));
            
            int ans = 100;
            for(int i=mini;i<=maxi;i++)
            {
                int dist = Math.abs(i-a)+Math.abs(i-b)+Math.abs(i-c);
                ans = Math.min(ans, dist);
            }
            
            System.out.println(ans);
        }
    }
}