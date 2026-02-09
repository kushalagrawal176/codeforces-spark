import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            long ans = Long.MAX_VALUE;
            for(int i=1;i<=Math.sqrt(n);i++)
            {
                if(i > k)
                    break;
                if(n%i == 0)
                {
                    if(n/i <= k)
                        ans = Math.min(ans, Math.min(n/i, i));
                    else
                        ans = Math.min(ans, n/i);
                }
            }
            
            System.out.println(ans);
        }
    }
}