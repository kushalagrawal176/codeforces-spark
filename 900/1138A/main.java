import java.util.*;
public class main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int lc = 0;
        int c = 0;
        int la = 0;
        int ans = 0;
 
        for(int i=0;i<n;++i)
        {
            int a = sc.nextInt();
 
            if(a == la)
                c++;
            else 
            {
                lc = c;
                c = 1;
            }
 
            la = a;
            ans = Math.max(ans, Math.min(lc, c));
        }
 
        System.out.println(ans*2);
    }
}