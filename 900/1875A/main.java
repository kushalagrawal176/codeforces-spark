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
            int n = sc.nextInt();
            
            long ans = b;
            for(int i=0;i<n;i++)
                ans += Math.min(sc.nextInt(), a-1);
            
            System.out.println(ans);
        }
    }
}