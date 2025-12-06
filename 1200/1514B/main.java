import java.util.*;
public class main
{
    static int mod = (int)1e9+7;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            long cnt = 1;
            
            for(int i=1;i<=k;i++)
            {
                cnt = (cnt*n)%mod;
            }
 
            System.out.println(cnt);
        }
    }
}