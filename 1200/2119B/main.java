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
 
            int px = sc.nextInt();
            int py = sc.nextInt();
            int qx = sc.nextInt();
            int qy = sc.nextInt();
 
            double mx, sum;
            mx = sum = Math.sqrt(Math.pow(px - qx, 2) + Math.pow(py - qy, 2));
 
            for (int i = 0; i < n; ++i) 
            {
                int x = sc.nextInt();
                mx = Math.max(mx, x);
                sum += x;
            }
 
            System.out.println(mx <= sum - mx ? "Yes":"No");
        }
    }
}