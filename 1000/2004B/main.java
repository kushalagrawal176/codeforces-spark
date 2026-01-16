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
            int d = sc.nextInt();
            
            int ans = Math.min(b,d) - Math.max(a,c);
            
            if(ans < 0)
                System.out.println(1);
            else
            {
                if(a!=c)
                    ans = ans + 1;
                if(b!=d)
                    ans = ans + 1;
                System.out.println(ans);
            }
        }
    }
}