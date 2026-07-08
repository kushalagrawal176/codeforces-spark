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
            long x = sc.nextLong();
            
            long a = sc.nextLong();
            long l = a-x;
            long r = a+x;
            
            int cnt = 0;
            for(int i=1;i<n;i++)
            {
                a = sc.nextLong();
                
                l = Math.max(l, a-x);
                r = Math.min(r, a+x);
                
                if(l > r)
                {
                    cnt++;
                    l = a-x;
                    r = a+x;
                }
            }
            
            System.out.println(cnt);
        }
    }
}