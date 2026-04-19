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
            int s = sc.nextInt();
 
            int ans = 0;
 
            for (int i = 0; i < n; i++) 
            {
                int x, y, z, w;
 
                x = sc.nextInt();
                y = sc.nextInt();
                z = sc.nextInt();
                w = sc.nextInt();
 
                int k = Math.abs(x * z - y * w);
                ans += (k == 0 || k == s) ? 1 : 0;
            }
 
            System.out.println(ans);
        }
    }
}