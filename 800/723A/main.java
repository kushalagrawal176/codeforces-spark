import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int mini = Math.min(a, Math.min(b,c));
        int maxi = Math.max(a, Math.max(b,c));
        
        int ans = 99999;
        
        for(int i=mini;i<=maxi;i++)
        {
            int d = Math.abs(a-i);
            int e = Math.abs(b-i);
            int f = Math.abs(c-i);
            
            ans = Math.min(ans, d+e+f);
        }
        
        System.out.println(ans);
    }
}