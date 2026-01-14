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
            int k = sc.nextInt();
            int q = sc.nextInt();
            
            long ans = 0;
            int cnt = 0;
            
            for(int i=0;i<n;i++)
            {
                int num = sc.nextInt();
                if(num <= q)
                    cnt++;
                else
                    cnt = 0;
                
                if(cnt >= k)
                    ans = ans + (cnt-k+1);
            }
            
            System.out.println(ans);
        }
    }
}